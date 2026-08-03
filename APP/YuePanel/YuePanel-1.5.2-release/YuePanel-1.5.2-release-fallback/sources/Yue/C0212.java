package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public final class C0212 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f459 = "ActivityRecreator";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Class<?> f460 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Field f461 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Field f462 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Method f463 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.reflect.Method f464 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.reflect.Method f465 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final android.os.Handler f466 = null;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ$ۥ, reason: contains not printable characters */
    public class RunnableC0213 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0212.C0216 f467;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f468;

        public RunnableC0213(Yue.C0212.C0216 r1, java.lang.Object r2) {
                r0 = this;
                r0.f467 = r1
                r0.f468 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                Yue.ۥ۟۟ۨ$ۥ۟۟۟ r0 = r2.f467
                java.lang.Object r1 = r2.f468
                r0.f473 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ$ۥ۟, reason: contains not printable characters */
    public class RunnableC0214 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.app.Application f469;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0212.C0216 f470;

        public RunnableC0214(android.app.Application r1, Yue.C0212.C0216 r2) {
                r0 = this;
                r0.f469 = r1
                r0.f470 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.Application r0 = r2.f469
                Yue.ۥ۟۟ۨ$ۥ۟۟۟ r1 = r2.f470
                r0.unregisterActivityLifecycleCallbacks(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC0215 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f471;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f472;

        public RunnableC0215(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                r0.f471 = r1
                r0.f472 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.lang.reflect.Method r0 = Yue.C0212.f463     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                if (r0 == 0) goto L18
                java.lang.Object r1 = r5.f471     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                java.lang.Object r2 = r5.f472     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                java.lang.String r4 = "AppCompat recreation"
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                goto L4c
            L14:
                r0 = move-exception
                goto L28
            L16:
                r0 = move-exception
                goto L30
            L18:
                java.lang.reflect.Method r0 = Yue.C0212.f464     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                java.lang.Object r1 = r5.f471     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                java.lang.Object r2 = r5.f472     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
                goto L4c
            L28:
                java.lang.String r1 = "ActivityRecreator"
                java.lang.String r2 = "Exception while invoking performStopActivity"
                android.util.Log.e(r1, r2, r0)
                goto L4c
            L30:
                java.lang.Class r1 = r0.getClass()
                java.lang.Class<java.lang.RuntimeException> r2 = java.lang.RuntimeException.class
                if (r1 != r2) goto L4c
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L4c
                java.lang.String r1 = r0.getMessage()
                java.lang.String r2 = "Unable to stop"
                boolean r1 = r1.startsWith(r2)
                if (r1 != 0) goto L4b
                goto L4c
            L4b:
                throw r0
            L4c:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C0216 implements android.app.Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Object f473;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.app.Activity f474;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f475;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f476;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f477;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f478;

        public C0216(@Yue.InterfaceC4410 android.app.Activity r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f476 = r0
                r1.f477 = r0
                r1.f478 = r0
                r1.f474 = r2
                int r2 = r2.hashCode()
                r1.f475 = r2
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.f474
                if (r0 != r2) goto La
                r2 = 0
                r1.f474 = r2
                r2 = 1
                r1.f477 = r2
            La:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r3) {
                r2 = this;
                boolean r0 = r2.f477
                if (r0 == 0) goto L1c
                boolean r0 = r2.f478
                if (r0 != 0) goto L1c
                boolean r0 = r2.f476
                if (r0 != 0) goto L1c
                java.lang.Object r0 = r2.f473
                int r1 = r2.f475
                boolean r3 = Yue.C0212.m1115(r0, r1, r3)
                if (r3 == 0) goto L1c
                r3 = 1
                r2.f478 = r3
                r3 = 0
                r2.f473 = r3
            L1c:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.f474
                if (r0 != r2) goto L7
                r2 = 1
                r1.f476 = r2
            L7:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            Yue.C0212.f466 = r0
            java.lang.Class r0 = m1108()
            Yue.C0212.f460 = r0
            java.lang.reflect.Field r1 = m1109()
            Yue.C0212.f461 = r1
            java.lang.reflect.Field r1 = m1113()
            Yue.C0212.f462 = r1
            java.lang.reflect.Method r1 = m1111(r0)
            Yue.C0212.f463 = r1
            java.lang.reflect.Method r1 = m1110(r0)
            Yue.C0212.f464 = r1
            java.lang.reflect.Method r0 = m1112(r0)
            Yue.C0212.f465 = r0
            return
    }

    public C0212() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.Class<?> m1108() {
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Field m1109() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mMainThread"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method m1110(java.lang.Class<?> r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "performStopActivity"
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L17
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L17
            return r4
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method m1111(java.lang.Class<?> r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "performStopActivity"
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L19
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L19
            r1 = 1
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L19
            return r5
        L19:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method m1112(java.lang.Class<?> r11) {
            boolean r0 = m1114()
            r1 = 0
            if (r0 == 0) goto L29
            if (r11 != 0) goto La
            goto L29
        La:
            java.lang.String r0 = "requestRelaunchActivity"
            java.lang.Class<android.os.IBinder> r2 = android.os.IBinder.class
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<java.util.List> r4 = java.util.List.class
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L29
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L29
            java.lang.Class<android.content.res.Configuration> r7 = android.content.res.Configuration.class
            java.lang.Class<android.content.res.Configuration> r8 = android.content.res.Configuration.class
            r6 = r10
            r9 = r10
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r0, r2)     // Catch: java.lang.Throwable -> L29
            r0 = 1
            r11.setAccessible(r0)     // Catch: java.lang.Throwable -> L29
            return r11
        L29:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.reflect.Field m1113() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m1114() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 == r1) goto Ld
            r1 = 27
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m1115(java.lang.Object r2, int r3, android.app.Activity r4) {
            r0 = 0
            java.lang.reflect.Field r1 = Yue.C0212.f462     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L22
            if (r1 != r2) goto L24
            int r2 = r4.hashCode()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L10
            goto L24
        L10:
            java.lang.reflect.Field r2 = Yue.C0212.f461     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L22
            android.os.Handler r3 = Yue.C0212.f466     // Catch: java.lang.Throwable -> L22
            Yue.ۥ۟۟ۨ$ۥ۟۟ r4 = new Yue.ۥ۟۟ۨ$ۥ۟۟     // Catch: java.lang.Throwable -> L22
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L22
            r3.postAtFrontOfQueue(r4)     // Catch: java.lang.Throwable -> L22
            r2 = 1
            return r2
        L22:
            r2 = move-exception
            goto L25
        L24:
            return r0
        L25:
            java.lang.String r3 = "ActivityRecreator"
            java.lang.String r4 = "Exception while fetching field values"
            android.util.Log.e(r3, r4, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m1116(@Yue.InterfaceC4410 android.app.Activity r15) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 1
            if (r0 < r1) goto Lb
            r15.recreate()
            return r2
        Lb:
            boolean r0 = m1114()
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.reflect.Method r0 = Yue.C0212.f465
            if (r0 != 0) goto L17
            return r1
        L17:
            java.lang.reflect.Method r0 = Yue.C0212.f464
            if (r0 != 0) goto L20
            java.lang.reflect.Method r0 = Yue.C0212.f463
            if (r0 != 0) goto L20
            return r1
        L20:
            java.lang.reflect.Field r0 = Yue.C0212.f462     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r3 = r0.get(r15)     // Catch: java.lang.Throwable -> L7d
            if (r3 != 0) goto L29
            return r1
        L29:
            java.lang.reflect.Field r0 = Yue.C0212.f461     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L32
            return r1
        L32:
            android.app.Application r12 = r15.getApplication()     // Catch: java.lang.Throwable -> L7d
            Yue.ۥ۟۟ۨ$ۥ۟۟۟ r13 = new Yue.ۥ۟۟ۨ$ۥ۟۟۟     // Catch: java.lang.Throwable -> L7d
            r13.<init>(r15)     // Catch: java.lang.Throwable -> L7d
            r12.registerActivityLifecycleCallbacks(r13)     // Catch: java.lang.Throwable -> L7d
            android.os.Handler r14 = Yue.C0212.f466     // Catch: java.lang.Throwable -> L7d
            Yue.ۥ۟۟ۨ$ۥ r4 = new Yue.ۥ۟۟ۨ$ۥ     // Catch: java.lang.Throwable -> L7d
            r4.<init>(r13, r3)     // Catch: java.lang.Throwable -> L7d
            r14.post(r4)     // Catch: java.lang.Throwable -> L7d
            boolean r4 = m1114()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L66
            java.lang.reflect.Method r15 = Yue.C0212.f465     // Catch: java.lang.Throwable -> L64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L64
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r7 = r11
            r10 = r11
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11}     // Catch: java.lang.Throwable -> L64
            r15.invoke(r0, r3)     // Catch: java.lang.Throwable -> L64
            goto L69
        L64:
            r15 = move-exception
            goto L72
        L66:
            r15.recreate()     // Catch: java.lang.Throwable -> L64
        L69:
            Yue.ۥ۟۟ۨ$ۥ۟ r15 = new Yue.ۥ۟۟ۨ$ۥ۟     // Catch: java.lang.Throwable -> L7d
            r15.<init>(r12, r13)     // Catch: java.lang.Throwable -> L7d
            r14.post(r15)     // Catch: java.lang.Throwable -> L7d
            return r2
        L72:
            android.os.Handler r0 = Yue.C0212.f466     // Catch: java.lang.Throwable -> L7d
            Yue.ۥ۟۟ۨ$ۥ۟ r2 = new Yue.ۥ۟۟ۨ$ۥ۟     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r12, r13)     // Catch: java.lang.Throwable -> L7d
            r0.post(r2)     // Catch: java.lang.Throwable -> L7d
            throw r15     // Catch: java.lang.Throwable -> L7d
        L7d:
            return r1
    }
}
