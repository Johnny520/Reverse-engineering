package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0532 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f1335 = "Startup";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile Yue.C0532 f1336;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.Object f1337 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.util.Map<java.lang.Class<?>, java.lang.Object> f1338;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.util.Set<java.lang.Class<? extends Yue.InterfaceC3247<?>>> f1339;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.content.Context f1340;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C0532.f1337 = r0
            return
    }

    public C0532(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f1340 = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f1339 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f1338 = r1
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C0532 m1881(@Yue.InterfaceC4410 android.content.Context r2) {
            Yue.ۥ۟ۡۥۢ r0 = Yue.C0532.f1336
            if (r0 != 0) goto L19
            java.lang.Object r0 = Yue.C0532.f1337
            monitor-enter(r0)
            Yue.ۥ۟ۡۥۢ r1 = Yue.C0532.f1336     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            Yue.ۥ۟ۡۥۢ r1 = new Yue.ۥ۟ۡۥۢ     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            Yue.C0532.f1336 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            Yue.ۥ۟ۡۥۢ r2 = Yue.C0532.f1336
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m1882(@Yue.InterfaceC4410 Yue.C0532 r1) {
            java.lang.Object r0 = Yue.C0532.f1337
            monitor-enter(r0)
            Yue.C0532.f1336 = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1883() {
            r3 = this;
            java.lang.String r0 = "Startup"
            Yue.C6385.m23578(r0)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.Context r1 = r3.f1340     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.Class<androidx.startup.InitializationProvider> r2 = androidx.startup.InitializationProvider.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.Context r1 = r3.f1340     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r0 = r1.getProviderInfo(r0, r2)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            r3.m1884(r0)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            Yue.C6385.m23581()
            return
        L2b:
            r0 = move-exception
            goto L34
        L2d:
            r0 = move-exception
            Yue.ۥۢ۠ r1 = new Yue.ۥۢ۠     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1     // Catch: java.lang.Throwable -> L2b
        L34:
            Yue.C6385.m23581()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m1884(@Yue.InterfaceC4544 android.os.Bundle r6) {
            r5 = this;
            android.content.Context r0 = r5.f1340
            int r1 = Yue.C5099.C5100.f18354
            java.lang.String r0 = r0.getString(r1)
            if (r6 == 0) goto L5e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L40
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.Set r2 = r6.keySet()     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ClassNotFoundException -> L40
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.ClassNotFoundException -> L40
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ClassNotFoundException -> L40
            r4 = 0
            java.lang.String r4 = r6.getString(r3, r4)     // Catch: java.lang.ClassNotFoundException -> L40
            boolean r4 = r0.equals(r4)     // Catch: java.lang.ClassNotFoundException -> L40
            if (r4 == 0) goto L17
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.Class<Yue.ۥ۠ۥۢ۠> r4 = Yue.InterfaceC3247.class
            boolean r4 = r4.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            if (r4 == 0) goto L17
            java.util.Set<java.lang.Class<? extends Yue.ۥ۠ۥۢ۠<?>>> r4 = r5.f1339     // Catch: java.lang.ClassNotFoundException -> L40
            r4.add(r3)     // Catch: java.lang.ClassNotFoundException -> L40
            goto L17
        L40:
            r6 = move-exception
            goto L58
        L42:
            java.util.Set<java.lang.Class<? extends Yue.ۥ۠ۥۢ۠<?>>> r6 = r5.f1339     // Catch: java.lang.ClassNotFoundException -> L40
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.ClassNotFoundException -> L40
        L48:
            boolean r0 = r6.hasNext()     // Catch: java.lang.ClassNotFoundException -> L40
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()     // Catch: java.lang.ClassNotFoundException -> L40
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L40
            r5.m1886(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L40
            goto L48
        L58:
            Yue.ۥۢ۠ r0 = new Yue.ۥۢ۠
            r0.<init>(r6)
            throw r0
        L5e:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public <T> T m1885(@Yue.InterfaceC4410 java.lang.Class<? extends Yue.InterfaceC3247<?>> r3) {
            r2 = this;
            java.lang.Object r0 = Yue.C0532.f1337
            monitor-enter(r0)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.f1338     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r2.m1886(r3, r1)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final <T> T m1886(@Yue.InterfaceC4410 java.lang.Class<? extends Yue.InterfaceC3247<?>> r5, @Yue.InterfaceC4410 java.util.Set<java.lang.Class<?>> r6) {
            r4 = this;
            boolean r0 = Yue.C6385.m23583()
            if (r0 == 0) goto L11
            java.lang.String r0 = r5.getSimpleName()     // Catch: java.lang.Throwable -> Le
            Yue.C6385.m23578(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r5 = move-exception
            goto L88
        L11:
            boolean r0 = r6.contains(r5)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L74
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r4.f1338     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L6a
            r6.add(r5)     // Catch: java.lang.Throwable -> Le
            r0 = 0
            java.lang.reflect.Constructor r1 = r5.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L53
            Yue.ۥ۠ۥۢ۠ r0 = (Yue.InterfaceC3247) r0     // Catch: java.lang.Throwable -> L53
            java.util.List r1 = r0.dependencies()     // Catch: java.lang.Throwable -> L53
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L55
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L53
        L3b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L53
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L53
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r4.f1338     // Catch: java.lang.Throwable -> L53
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L3b
            r4.m1886(r2, r6)     // Catch: java.lang.Throwable -> L53
            goto L3b
        L53:
            r5 = move-exception
            goto L64
        L55:
            android.content.Context r1 = r4.f1340     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.create(r1)     // Catch: java.lang.Throwable -> L53
            r6.remove(r5)     // Catch: java.lang.Throwable -> L53
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r4.f1338     // Catch: java.lang.Throwable -> L53
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L53
            goto L70
        L64:
            Yue.ۥۢ۠ r6 = new Yue.ۥۢ۠     // Catch: java.lang.Throwable -> Le
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Le
            throw r6     // Catch: java.lang.Throwable -> Le
        L6a:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r4.f1338     // Catch: java.lang.Throwable -> Le
            java.lang.Object r0 = r6.get(r5)     // Catch: java.lang.Throwable -> Le
        L70:
            Yue.C6385.m23581()
            return r0
        L74:
            java.lang.String r6 = "Cannot initialize %s. Cycle detected."
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> Le
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> Le
            java.lang.String r5 = java.lang.String.format(r6, r5)     // Catch: java.lang.Throwable -> Le
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Le
            throw r6     // Catch: java.lang.Throwable -> Le
        L88:
            Yue.C6385.m23581()
            throw r5
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public <T> T m1887(@Yue.InterfaceC4410 java.lang.Class<? extends Yue.InterfaceC3247<T>> r1) {
            r0 = this;
            java.lang.Object r1 = r0.m1885(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m1888(@Yue.InterfaceC4410 java.lang.Class<? extends Yue.InterfaceC3247<?>> r2) {
            r1 = this;
            java.util.Set<java.lang.Class<? extends Yue.ۥ۠ۥۢ۠<?>>> r0 = r1.f1339
            boolean r2 = r0.contains(r2)
            return r2
    }
}
