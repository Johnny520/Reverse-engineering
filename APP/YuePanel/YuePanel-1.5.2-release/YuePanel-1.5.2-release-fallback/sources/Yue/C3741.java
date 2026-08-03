package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3741 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long f11886 = 30000;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long f11887 = 10000;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long f11888 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Field f11889;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.Class<?> f11890;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.reflect.Method f11891;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.reflect.Method f11892;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC2947("sLocationListeners")
    public static final java.util.WeakHashMap<Yue.C3741.C3753, java.lang.ref.WeakReference<Yue.C3741.C3754>> f11893 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ, reason: contains not printable characters */
    public static class C3742 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.Class<?> f11894;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.reflect.Method f11895;

        public C3742() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m15058(android.location.LocationManager r6, java.lang.String r7, Yue.C3776 r8, Yue.InterfaceC3737 r9, android.os.Looper r10) {
                java.lang.Class<?> r0 = Yue.C3741.C3742.f11894     // Catch: java.lang.Throwable -> L38
                if (r0 != 0) goto Lc
                java.lang.String r0 = "android.location.LocationRequest"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L38
                Yue.C3741.C3742.f11894 = r0     // Catch: java.lang.Throwable -> L38
            Lc:
                java.lang.reflect.Method r0 = Yue.C3741.C3742.f11895     // Catch: java.lang.Throwable -> L38
                r1 = 1
                if (r0 != 0) goto L28
                java.lang.Class<android.location.LocationManager> r0 = android.location.LocationManager.class
                java.lang.String r2 = "requestLocationUpdates"
                java.lang.Class<?> r3 = Yue.C3741.C3742.f11894     // Catch: java.lang.Throwable -> L38
                java.lang.Class<android.location.LocationListener> r4 = android.location.LocationListener.class
                java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
                java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L38
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L38
                Yue.C3741.C3742.f11895 = r0     // Catch: java.lang.Throwable -> L38
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L38
            L28:
                android.location.LocationRequest r7 = r8.m15129(r7)     // Catch: java.lang.Throwable -> L38
                if (r7 == 0) goto L38
                java.lang.reflect.Method r8 = Yue.C3741.C3742.f11895     // Catch: java.lang.Throwable -> L38
                java.lang.Object[] r7 = new java.lang.Object[]{r7, r9, r10}     // Catch: java.lang.Throwable -> L38
                r8.invoke(r6, r7)     // Catch: java.lang.Throwable -> L38
                return r1
            L38:
                r6 = 0
                return r6
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m15059(android.location.LocationManager r6, java.lang.String r7, Yue.C3776 r8, Yue.C3741.C3754 r9) {
                java.lang.Class<?> r0 = Yue.C3741.C3742.f11894     // Catch: java.lang.Throwable -> L46
                if (r0 != 0) goto Lc
                java.lang.String r0 = "android.location.LocationRequest"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L46
                Yue.C3741.C3742.f11894 = r0     // Catch: java.lang.Throwable -> L46
            Lc:
                java.lang.reflect.Method r0 = Yue.C3741.C3742.f11895     // Catch: java.lang.Throwable -> L46
                r1 = 1
                if (r0 != 0) goto L28
                java.lang.Class<android.location.LocationManager> r0 = android.location.LocationManager.class
                java.lang.String r2 = "requestLocationUpdates"
                java.lang.Class<?> r3 = Yue.C3741.C3742.f11894     // Catch: java.lang.Throwable -> L46
                java.lang.Class<android.location.LocationListener> r4 = android.location.LocationListener.class
                java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
                java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L46
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L46
                Yue.C3741.C3742.f11895 = r0     // Catch: java.lang.Throwable -> L46
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L46
            L28:
                android.location.LocationRequest r7 = r8.m15129(r7)     // Catch: java.lang.Throwable -> L46
                if (r7 == 0) goto L46
                java.util.WeakHashMap<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ, java.lang.ref.WeakReference<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ>> r8 = Yue.C3741.f11893     // Catch: java.lang.Throwable -> L46
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L46
                java.lang.reflect.Method r0 = Yue.C3741.C3742.f11895     // Catch: java.lang.Throwable -> L43
                android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L43
                java.lang.Object[] r7 = new java.lang.Object[]{r7, r9, r2}     // Catch: java.lang.Throwable -> L43
                r0.invoke(r6, r7)     // Catch: java.lang.Throwable -> L43
                Yue.C3741.m15052(r6, r9)     // Catch: java.lang.Throwable -> L43
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
                return r1
            L43:
                r6 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
                throw r6     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46 java.lang.Throwable -> L46 java.lang.Throwable -> L46 java.lang.Throwable -> L46
            L46:
                r6 = 0
                return r6
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3743 {
        public C3743() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m15060(@Yue.InterfaceC4410 android.location.LocationManager r0, @Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r1) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1)
                return r0
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m15061(@Yue.InterfaceC4410 android.location.LocationManager r0, @Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r1, @Yue.InterfaceC4410 android.os.Handler r2) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m15062(android.location.LocationManager r4, android.os.Handler r5, java.util.concurrent.Executor r6, Yue.AbstractC2887.AbstractC2888 r7) {
                r0 = 0
                r1 = 1
                if (r5 == 0) goto L6
                r2 = r1
                goto L7
            L6:
                r2 = r0
            L7:
                Yue.C4868.m19170(r2)
                Yue.ۥۢ۟ۡ<java.lang.Object, java.lang.Object> r2 = Yue.C3741.C3748.f11904
                monitor-enter(r2)
                java.lang.Object r3 = r2.get(r7)     // Catch: java.lang.Throwable -> L1b
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۨ r3 = (Yue.C3741.C3755) r3     // Catch: java.lang.Throwable -> L1b
                if (r3 != 0) goto L1d
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۨ r3 = new Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۨ     // Catch: java.lang.Throwable -> L1b
                r3.<init>(r7)     // Catch: java.lang.Throwable -> L1b
                goto L20
            L1b:
                r4 = move-exception
                goto L30
            L1d:
                r3.m15119()     // Catch: java.lang.Throwable -> L1b
            L20:
                r3.m15118(r6)     // Catch: java.lang.Throwable -> L1b
                boolean r4 = r4.registerGnssStatusCallback(r3, r5)     // Catch: java.lang.Throwable -> L1b
                if (r4 == 0) goto L2e
                r2.put(r7, r3)     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                return r1
            L2e:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                return r0
            L30:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                throw r4
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m15063(@Yue.InterfaceC4410 android.location.LocationManager r0, @Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r1) {
                r0.unregisterGnssMeasurementsCallback(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m15064(android.location.LocationManager r1, java.lang.Object r2) {
                boolean r0 = r2 instanceof Yue.C3741.C3755
                if (r0 == 0) goto La
                r0 = r2
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۨ r0 = (Yue.C3741.C3755) r0
                r0.m15119()
            La:
                android.location.GnssStatus$Callback r2 = (android.location.GnssStatus.Callback) r2
                r1.unregisterGnssStatusCallback(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C3744 {
        public C3744() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m15065(android.location.LocationManager r0) {
                java.lang.String r0 = r0.getGnssHardwareModelName()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m15066(android.location.LocationManager r0) {
                int r0 = r0.getGnssYearOfHardware()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m15067(android.location.LocationManager r0) {
                boolean r0 = r0.isLocationEnabled()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C3745 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.Class<?> f11896;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.reflect.Method f11897;

        public C3745() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m15068(android.location.LocationManager r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4544 android.os.CancellationSignal r3, @Yue.InterfaceC4410 java.util.concurrent.Executor r4, @Yue.InterfaceC4410 Yue.InterfaceC1535<android.location.Location> r5) {
                java.util.Objects.requireNonNull(r5)
                Yue.ۥ۠ۧۨۥ r0 = new Yue.ۥ۠ۧۨۥ
                r0.<init>(r5)
                r1.getCurrentLocation(r2, r3, r4, r0)
                return
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m15069(android.location.LocationManager r1, android.os.Handler r2, java.util.concurrent.Executor r3, Yue.AbstractC2887.AbstractC2888 r4) {
                Yue.ۥۢ۟ۡ<java.lang.Object, java.lang.Object> r2 = Yue.C3741.C3748.f11904
                monitor-enter(r2)
                java.lang.Object r0 = r2.get(r4)     // Catch: java.lang.Throwable -> L11
                Yue.ۥ۠ۧۨۤ$ۥۣ۟۟۟ r0 = (Yue.C3741.C3750) r0     // Catch: java.lang.Throwable -> L11
                if (r0 != 0) goto L13
                Yue.ۥ۠ۧۨۤ$ۥۣ۟۟۟ r0 = new Yue.ۥ۠ۧۨۤ$ۥۣ۟۟۟     // Catch: java.lang.Throwable -> L11
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L11
                goto L13
            L11:
                r1 = move-exception
                goto L22
            L13:
                boolean r1 = r1.registerGnssStatusCallback(r3, r0)     // Catch: java.lang.Throwable -> L11
                if (r1 == 0) goto L1f
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
                r1 = 1
                return r1
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
                r1 = 0
                return r1
            L22:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
                throw r1
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m15070(android.location.LocationManager r6, java.lang.String r7, Yue.C3776 r8, java.util.concurrent.Executor r9, Yue.InterfaceC3737 r10) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L3e
                java.lang.Class<?> r0 = Yue.C3741.C3745.f11896     // Catch: java.lang.Throwable -> L3e
                if (r0 != 0) goto L12
                java.lang.String r0 = "android.location.LocationRequest"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3e
                Yue.C3741.C3745.f11896 = r0     // Catch: java.lang.Throwable -> L3e
            L12:
                java.lang.reflect.Method r0 = Yue.C3741.C3745.f11897     // Catch: java.lang.Throwable -> L3e
                r1 = 1
                if (r0 != 0) goto L2e
                java.lang.Class<android.location.LocationManager> r0 = android.location.LocationManager.class
                java.lang.String r2 = "requestLocationUpdates"
                java.lang.Class<?> r3 = Yue.C3741.C3745.f11896     // Catch: java.lang.Throwable -> L3e
                java.lang.Class<java.util.concurrent.Executor> r4 = java.util.concurrent.Executor.class
                java.lang.Class<android.location.LocationListener> r5 = android.location.LocationListener.class
                java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L3e
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L3e
                Yue.C3741.C3745.f11897 = r0     // Catch: java.lang.Throwable -> L3e
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L3e
            L2e:
                android.location.LocationRequest r7 = r8.m15129(r7)     // Catch: java.lang.Throwable -> L3e
                if (r7 == 0) goto L3e
                java.lang.reflect.Method r8 = Yue.C3741.C3745.f11897     // Catch: java.lang.Throwable -> L3e
                java.lang.Object[] r7 = new java.lang.Object[]{r7, r9, r10}     // Catch: java.lang.Throwable -> L3e
                r8.invoke(r6, r7)     // Catch: java.lang.Throwable -> L3e
                return r1
            L3e:
                r6 = 0
                return r6
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static class C3746 {
        public C3746() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m15071(android.location.LocationManager r0, @Yue.InterfaceC4410 java.lang.String r1) {
                boolean r0 = r0.hasProvider(r1)
                return r0
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m15072(@Yue.InterfaceC4410 android.location.LocationManager r0, @Yue.InterfaceC4410 java.util.concurrent.Executor r1, @Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r2) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m15073(android.location.LocationManager r0, @Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4410 android.location.LocationRequest r2, @Yue.InterfaceC4410 java.util.concurrent.Executor r3, @Yue.InterfaceC4410 android.location.LocationListener r4) {
                r0.requestLocationUpdates(r1, r2, r3, r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C3747 implements android.location.LocationListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.location.LocationManager f11898;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.concurrent.Executor f11899;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.os.Handler f11900;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.InterfaceC1535<android.location.Location> f11901;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC2947("this")
        public boolean f11902;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.lang.Runnable f11903;

        public C3747(android.location.LocationManager r1, java.util.concurrent.Executor r2, Yue.InterfaceC1535<android.location.Location> r3) {
                r0 = this;
                r0.<init>()
                r0.f11898 = r1
                r0.f11899 = r2
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.f11900 = r1
                r0.f11901 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m15074(Yue.C3741.C3747 r0) {
                r0.m15079()
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m15075(Yue.InterfaceC1535 r0, android.location.Location r1) {
                m15076(r0, r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m15076(Yue.InterfaceC1535 r0, android.location.Location r1) {
                r0.accept(r1)
                return
        }

        @Override // android.location.LocationListener
        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@Yue.InterfaceC4544 android.location.Location r4) {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f11902     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r4 = move-exception
                goto L1d
            L9:
                r0 = 1
                r3.f11902 = r0     // Catch: java.lang.Throwable -> L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                Yue.ۥ۟ۧ۠ۧ<android.location.Location> r0 = r3.f11901
                java.util.concurrent.Executor r1 = r3.f11899
                Yue.ۥ۠ۧۨۧ r2 = new Yue.ۥ۠ۧۨۧ
                r2.<init>(r0, r4)
                r1.execute(r2)
                r3.m15078()
                return
            L1d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r4
        }

        @Override // android.location.LocationListener
        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@Yue.InterfaceC4410 java.lang.String r1) {
                r0 = this;
                r1 = 0
                r0.onLocationChanged(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@Yue.InterfaceC4410 java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m15077() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f11902     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto L11
            L9:
                r0 = 1
                r1.f11902 = r0     // Catch: java.lang.Throwable -> L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                r1.m15078()
                return
            L11:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r0
        }

        @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m15078() {
                r3 = this;
                r0 = 0
                r3.f11901 = r0
                android.location.LocationManager r1 = r3.f11898
                r1.removeUpdates(r3)
                java.lang.Runnable r1 = r3.f11903
                if (r1 == 0) goto L13
                android.os.Handler r2 = r3.f11900
                r2.removeCallbacks(r1)
                r3.f11903 = r0
            L13:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m15079() {
                r1 = this;
                r0 = 0
                r1.f11903 = r0
                r1.onLocationChanged(r0)
                return
        }

        @android.annotation.SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m15080(long r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.f11902     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r3 = move-exception
                goto L17
            L9:
                Yue.ۥ۠ۧۨۦ r0 = new Yue.ۥ۠ۧۨۦ     // Catch: java.lang.Throwable -> L7
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L7
                r2.f11903 = r0     // Catch: java.lang.Throwable -> L7
                android.os.Handler r1 = r2.f11900     // Catch: java.lang.Throwable -> L7
                r1.postDelayed(r0, r3)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return
            L17:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                throw r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C3748 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC2947("sGnssStatusListeners")
        public static final Yue.C5787<java.lang.Object, java.lang.Object> f11904 = null;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC2947("sGnssMeasurementListeners")
        public static final Yue.C5787<android.location.GnssMeasurementsEvent.Callback, android.location.GnssMeasurementsEvent.Callback> f11905 = null;

        static {
                Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
                r0.<init>()
                Yue.C3741.C3748.f11904 = r0
                Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
                r0.<init>()
                Yue.C3741.C3748.f11905 = r0
                return
        }

        public C3748() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3749 extends android.location.GnssMeasurementsEvent.Callback {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.location.GnssMeasurementsEvent.Callback f11906;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public volatile java.util.concurrent.Executor f11907;

        public C3749(@Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r1, @Yue.InterfaceC4410 java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.f11906 = r1
                r0.f11907 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m15081(Yue.C3741.C3749 r0, java.util.concurrent.Executor r1, android.location.GnssMeasurementsEvent r2) {
                r0.m15083(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m15082(Yue.C3741.C3749 r0, java.util.concurrent.Executor r1, int r2) {
                r0.m15084(r1, r2)
                return
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.f11907
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۧۨۨ r1 = new Yue.ۥ۠ۧۨۨ
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.f11907
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۨ r1 = new Yue.ۥ۠ۨ
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m15083(java.util.concurrent.Executor r2, android.location.GnssMeasurementsEvent r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11907
                if (r0 == r2) goto L5
                return
            L5:
                android.location.GnssMeasurementsEvent$Callback r2 = r1.f11906
                r2.onGnssMeasurementsReceived(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m15084(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11907
                if (r0 == r2) goto L5
                return
            L5:
                android.location.GnssMeasurementsEvent$Callback r2 = r1.f11906
                r2.onStatusChanged(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m15085() {
                r1 = this;
                r0 = 0
                r1.f11907 = r0
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C3750 extends android.location.GnssStatus.Callback {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.AbstractC2887.AbstractC2888 f11908;

        public C3750(Yue.AbstractC2887.AbstractC2888 r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                Yue.C4868.m19171(r0, r1)
                r2.f11908 = r3
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r2) {
                r1 = this;
                Yue.ۥۣ۠ۦ۟$ۥ r0 = r1.f11908
                r0.m12380(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r2) {
                r1 = this;
                Yue.ۥۣ۠ۦ۟$ۥ r0 = r1.f11908
                Yue.ۥۣ۠ۦ۟ r2 = Yue.AbstractC2887.m12365(r2)
                r0.m12381(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r1 = this;
                Yue.ۥۣ۠ۦ۟$ۥ r0 = r1.f11908
                r0.m12382()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r1 = this;
                Yue.ۥۣ۠ۦ۟$ۥ r0 = r1.f11908
                r0.m12383()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C3751 implements android.location.GpsStatus.Listener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.location.LocationManager f11909;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.AbstractC2887.AbstractC2888 f11910;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public volatile java.util.concurrent.Executor f11911;

        public C3751(android.location.LocationManager r3, Yue.AbstractC2887.AbstractC2888 r4) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                Yue.C4868.m19171(r0, r1)
                r2.f11909 = r3
                r2.f11910 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m15086(Yue.C3741.C3751 r0, java.util.concurrent.Executor r1) {
                r0.m15091(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m15087(Yue.C3741.C3751 r0, java.util.concurrent.Executor r1) {
                r0.m15090(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m15088(Yue.C3741.C3751 r0, java.util.concurrent.Executor r1, int r2) {
                r0.m15092(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m15089(Yue.C3741.C3751 r0, java.util.concurrent.Executor r1, Yue.AbstractC2887 r2) {
                r0.m15093(r1, r2)
                return
        }

        @Override // android.location.GpsStatus.Listener
        @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int r4) {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.f11911
                if (r0 != 0) goto L5
                return
            L5:
                r1 = 1
                if (r4 == r1) goto L46
                r1 = 2
                if (r4 == r1) goto L3d
                r1 = 3
                r2 = 0
                if (r4 == r1) goto L28
                r1 = 4
                if (r4 == r1) goto L13
                goto L4e
            L13:
                android.location.LocationManager r4 = r3.f11909
                android.location.GpsStatus r4 = r4.getGpsStatus(r2)
                if (r4 == 0) goto L4e
                Yue.ۥۣ۠ۦ۟ r4 = Yue.AbstractC2887.m12366(r4)
                Yue.ۥ۠ۨ۟ۡ r1 = new Yue.ۥ۠ۨ۟ۡ
                r1.<init>(r3, r0, r4)
                r0.execute(r1)
                goto L4e
            L28:
                android.location.LocationManager r4 = r3.f11909
                android.location.GpsStatus r4 = r4.getGpsStatus(r2)
                if (r4 == 0) goto L4e
                int r4 = r4.getTimeToFirstFix()
                Yue.ۥ۠ۨ۟۠ r1 = new Yue.ۥ۠ۨ۟۠
                r1.<init>(r3, r0, r4)
                r0.execute(r1)
                goto L4e
            L3d:
                Yue.ۥ۠ۨ۟۟ r4 = new Yue.ۥ۠ۨ۟۟
                r4.<init>(r3, r0)
                r0.execute(r4)
                goto L4e
            L46:
                Yue.ۥ۠ۨ۟ r4 = new Yue.ۥ۠ۨ۟
                r4.<init>(r3, r0)
                r0.execute(r4)
            L4e:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m15090(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11911
                if (r0 == r2) goto L5
                return
            L5:
                Yue.ۥۣ۠ۦ۟$ۥ r2 = r1.f11910
                r2.m12382()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m15091(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11911
                if (r0 == r2) goto L5
                return
            L5:
                Yue.ۥۣ۠ۦ۟$ۥ r2 = r1.f11910
                r2.m12383()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ void m15092(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11911
                if (r0 == r2) goto L5
                return
            L5:
                Yue.ۥۣ۠ۦ۟$ۥ r2 = r1.f11910
                r2.m12380(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ void m15093(java.util.concurrent.Executor r2, Yue.AbstractC2887 r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11911
                if (r0 == r2) goto L5
                return
            L5:
                Yue.ۥۣ۠ۦ۟$ۥ r2 = r1.f11910
                r2.m12381(r3)
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m15094(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11911
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                Yue.C4868.m19183(r0)
                r1.f11911 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m15095() {
                r1 = this;
                r0 = 0
                r1.f11911 = r0
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final class ExecutorC3752 implements java.util.concurrent.Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.os.Handler f11912;

        public ExecutorC3752(@Yue.InterfaceC4410 android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = Yue.C4868.m19181(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.f11912 = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@Yue.InterfaceC4410 java.lang.Runnable r3) {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Handler r1 = r2.f11912
                android.os.Looper r1 = r1.getLooper()
                if (r0 != r1) goto L10
                r3.run()
                goto L1e
            L10:
                android.os.Handler r0 = r2.f11912
                java.lang.Object r3 = Yue.C4868.m19181(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto L1f
            L1e:
                return
            L1f:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.f11912
                r0.append(r1)
                java.lang.String r1 = " is shutting down"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C3753 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f11913;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.InterfaceC3737 f11914;

        public C3753(java.lang.String r2, Yue.InterfaceC3737 r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "invalid null provider"
                java.lang.Object r2 = Yue.C4554.m18128(r2, r0)
                java.lang.String r2 = (java.lang.String) r2
                r1.f11913 = r2
                java.lang.String r2 = "invalid null listener"
                java.lang.Object r2 = Yue.C4554.m18128(r3, r2)
                Yue.ۥ۠ۧۨ۠ r2 = (Yue.InterfaceC3737) r2
                r1.f11914 = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof Yue.C3741.C3753
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r4 = (Yue.C3741.C3753) r4
                java.lang.String r0 = r3.f11913
                java.lang.String r2 = r4.f11913
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                Yue.ۥ۠ۧۨ۠ r0 = r3.f11914
                Yue.ۥ۠ۧۨ۠ r4 = r4.f11914
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r1 = 1
            L1d:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.f11913
                Yue.ۥ۠ۧۨ۠ r1 = r2.f11914
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = Yue.C4554.m18125(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C3754 implements android.location.LocationListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public volatile Yue.C3741.C3753 f11915;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.concurrent.Executor f11916;

        public C3754(@Yue.InterfaceC4544 Yue.C3741.C3753 r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.f11915 = r1
                r0.f11916 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m15096(Yue.C3741.C3754 r0, java.lang.String r1) {
                r0.m15107(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m15097(Yue.C3741.C3754 r0, java.lang.String r1, int r2, android.os.Bundle r3) {
                r0.m15108(r1, r2, r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m15098(Yue.C3741.C3754 r0, android.location.Location r1) {
                r0.m15104(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m15099(Yue.C3741.C3754 r0, java.util.List r1) {
                r0.m15105(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m15100(Yue.C3741.C3754 r0, java.lang.String r1) {
                r0.m15106(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m15101(Yue.C3741.C3754 r0, int r1) {
                r0.m15103(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(int r3) {
                r2 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r2.f11915
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.f11916
                Yue.ۥ۠ۨ۟ۦ r1 = new Yue.ۥ۠ۨ۟ۦ
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@Yue.InterfaceC4410 android.location.Location r3) {
                r2 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r2.f11915
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.f11916
                Yue.ۥ۠ۨ۟ۥ r1 = new Yue.ۥ۠ۨ۟ۥ
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@Yue.InterfaceC4410 java.util.List<android.location.Location> r3) {
                r2 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r2.f11915
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.f11916
                Yue.ۥ۠ۨ۟ۤ r1 = new Yue.ۥ۠ۨ۟ۤ
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@Yue.InterfaceC4410 java.lang.String r3) {
                r2 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r2.f11915
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.f11916
                Yue.ۥۣ۠ۨ۟ r1 = new Yue.ۥۣ۠ۨ۟
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@Yue.InterfaceC4410 java.lang.String r3) {
                r2 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r2.f11915
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.f11916
                Yue.ۥ۠ۨ۟ۢ r1 = new Yue.ۥ۠ۨ۟ۢ
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r3, int r4, android.os.Bundle r5) {
                r2 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r2.f11915
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.f11916
                Yue.ۥ۠ۨ۟ۧ r1 = new Yue.ۥ۠ۨ۟ۧ
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C3741.C3753 m15102() {
                r1 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r1.f11915
                java.lang.Object r0 = Yue.C4554.m18127(r0)
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = (Yue.C3741.C3753) r0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ void m15103(int r2) {
                r1 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r1.f11915
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۧۨ۠ r0 = r0.f11914
                r0.onFlushComplete(r2)
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m15104(android.location.Location r2) {
                r1 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r1.f11915
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۧۨ۠ r0 = r0.f11914
                r0.onLocationChanged(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final /* synthetic */ void m15105(java.util.List r2) {
                r1 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r1.f11915
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۧۨ۠ r0 = r0.f11914
                r0.onLocationChanged(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final /* synthetic */ void m15106(java.lang.String r2) {
                r1 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r1.f11915
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۧۨ۠ r0 = r0.f11914
                r0.onProviderDisabled(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final /* synthetic */ void m15107(java.lang.String r2) {
                r1 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r1.f11915
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۧۨ۠ r0 = r0.f11914
                r0.onProviderEnabled(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final /* synthetic */ void m15108(java.lang.String r2, int r3, android.os.Bundle r4) {
                r1 = this;
                Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r0 = r1.f11915
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۧۨ۠ r0 = r0.f11914
                r0.onStatusChanged(r2, r3, r4)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m15109() {
                r1 = this;
                r0 = 0
                r1.f11915 = r0
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3755 extends android.location.GnssStatus.Callback {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.AbstractC2887.AbstractC2888 f11917;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public volatile java.util.concurrent.Executor f11918;

        public C3755(Yue.AbstractC2887.AbstractC2888 r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                Yue.C4868.m19171(r0, r1)
                r2.f11917 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m15110(Yue.C3741.C3755 r0, java.util.concurrent.Executor r1) {
                r0.m15117(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m15111(Yue.C3741.C3755 r0, java.util.concurrent.Executor r1, int r2) {
                r0.m15114(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m15112(Yue.C3741.C3755 r0, java.util.concurrent.Executor r1) {
                r0.m15116(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m15113(Yue.C3741.C3755 r0, java.util.concurrent.Executor r1, android.location.GnssStatus r2) {
                r0.m15115(r1, r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.f11918
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۨ۟ۨ r1 = new Yue.ۥ۠ۨ۟ۨ
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.f11918
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۨ۠ r1 = new Yue.ۥ۠ۨ۠
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.f11918
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۨ۠۠ r1 = new Yue.ۥ۠ۨ۠۠
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.f11918
                if (r0 != 0) goto L5
                return
            L5:
                Yue.ۥ۠ۨ۠۟ r1 = new Yue.ۥ۠ۨ۠۟
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m15114(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11918
                if (r0 == r2) goto L5
                return
            L5:
                Yue.ۥۣ۠ۦ۟$ۥ r2 = r1.f11917
                r2.m12380(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m15115(java.util.concurrent.Executor r2, android.location.GnssStatus r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11918
                if (r0 == r2) goto L5
                return
            L5:
                Yue.ۥۣ۠ۦ۟$ۥ r2 = r1.f11917
                Yue.ۥۣ۠ۦ۟ r3 = Yue.AbstractC2887.m12365(r3)
                r2.m12381(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ void m15116(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11918
                if (r0 == r2) goto L5
                return
            L5:
                Yue.ۥۣ۠ۦ۟$ۥ r2 = r1.f11917
                r2.m12382()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ void m15117(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.f11918
                if (r0 == r2) goto L5
                return
            L5:
                Yue.ۥۣ۠ۦ۟$ۥ r2 = r1.f11917
                r2.m12383()
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m15118(java.util.concurrent.Executor r5) {
                r4 = this;
                r0 = 0
                r1 = 1
                if (r5 == 0) goto L6
                r2 = r1
                goto L7
            L6:
                r2 = r0
            L7:
                java.lang.String r3 = "invalid null executor"
                Yue.C4868.m19171(r2, r3)
                java.util.concurrent.Executor r2 = r4.f11918
                if (r2 != 0) goto L11
                r0 = r1
            L11:
                Yue.C4868.m19183(r0)
                r4.f11918 = r5
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m15119() {
                r1 = this;
                r0 = 0
                r1.f11918 = r0
                return
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            Yue.C3741.f11893 = r0
            return
    }

    public C3741() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m15036(Yue.InterfaceC1535 r0, android.location.Location r1) {
            m15044(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Boolean m15037(android.location.LocationManager r0, Yue.C3741.C3751 r1) {
            java.lang.Boolean r0 = m15045(r0, r1)
            return r0
    }

    @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m15038(@Yue.InterfaceC4410 android.location.LocationManager r0, @Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4544 Yue.C0943 r2, @Yue.InterfaceC4410 java.util.concurrent.Executor r3, @Yue.InterfaceC4410 Yue.InterfaceC1535<android.location.Location> r4) {
            if (r2 == 0) goto L9
            java.lang.Object r2 = r2.m5363()
            android.os.CancellationSignal r2 = (android.os.CancellationSignal) r2
            goto La
        L9:
            r2 = 0
        La:
            m15039(r0, r1, r2, r3, r4)
            return
    }

    @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m15039(@Yue.InterfaceC4410 android.location.LocationManager r8, @Yue.InterfaceC4410 java.lang.String r9, @Yue.InterfaceC4544 android.os.CancellationSignal r10, @Yue.InterfaceC4410 java.util.concurrent.Executor r11, @Yue.InterfaceC4410 Yue.InterfaceC1535<android.location.Location> r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            Yue.C3741.C3745.m15068(r8, r9, r10, r11, r12)
            return
        La:
            if (r10 == 0) goto Lf
            r10.throwIfCanceled()
        Lf:
            android.location.Location r0 = r8.getLastKnownLocation(r9)
            if (r0 == 0) goto L2d
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = Yue.C3730.m14975(r0)
            long r1 = r1 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2d
            Yue.ۥ۠ۧۨۡ r8 = new Yue.ۥ۠ۧۨۡ
            r8.<init>(r12, r0)
            r11.execute(r8)
            return
        L2d:
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟۠ r0 = new Yue.ۥ۠ۧۨۤ$ۥ۟۟۟۠
            r0.<init>(r8, r11, r12)
            r5 = 0
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r3 = 0
            r1 = r8
            r2 = r9
            r6 = r0
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            if (r10 == 0) goto L49
            Yue.ۥ۠ۧۨۢ r8 = new Yue.ۥ۠ۧۨۢ
            r8.<init>(r0)
            r10.setOnCancelListener(r8)
        L49:
            r8 = 30000(0x7530, double:1.4822E-319)
            r0.m15080(r8)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m15040(@Yue.InterfaceC4410 android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r2 = Yue.C3741.C3744.m15065(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m15041(@Yue.InterfaceC4410 android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = Yue.C3741.C3744.m15066(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m15042(@Yue.InterfaceC4410 android.location.LocationManager r2, @Yue.InterfaceC4410 java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C3741.C3746.m15071(r2, r3)
            return r2
        Lb:
            java.util.List r0 = r2.getAllProviders()
            boolean r0 = r0.contains(r3)
            r1 = 1
            if (r0 == 0) goto L17
            return r1
        L17:
            r0 = 0
            android.location.LocationProvider r2 = r2.getProvider(r3)     // Catch: java.lang.SecurityException -> L21
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            r1 = r0
        L20:
            return r1
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m15043(@Yue.InterfaceC4410 android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C3741.C3744.m15067(r2)
            return r2
        Lb:
            java.lang.String r0 = "network"
            boolean r0 = r2.isProviderEnabled(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "gps"
            boolean r2 = r2.isProviderEnabled(r0)
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r2 = 0
            goto L1f
        L1e:
            r2 = 1
        L1f:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m15044(Yue.InterfaceC1535 r0, android.location.Location r1) {
            r0.accept(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Boolean m15045(android.location.LocationManager r0, Yue.C3741.C3751 r1) throws java.lang.Exception {
            boolean r0 = r0.addGpsStatusListener(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
    @Yue.InterfaceC5336(24)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m15046(@Yue.InterfaceC4410 android.location.LocationManager r2, @Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r3, @Yue.InterfaceC4410 android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r2 = Yue.C3741.C3743.m15061(r2, r3, r4)
            return r2
        Lb:
            if (r0 != r1) goto L16
            java.util.concurrent.Executor r4 = Yue.C2275.m10520(r4)
            boolean r2 = m15048(r2, r4, r3)
            return r2
        L16:
            Yue.ۥۢ۟ۡ<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = Yue.C3741.C3748.f11905
            monitor-enter(r0)
            m15056(r2, r3)     // Catch: java.lang.Throwable -> L28
            boolean r2 = Yue.C3741.C3743.m15061(r2, r3, r4)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2a
            r0.put(r3, r3)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            r2 = 1
            return r2
        L28:
            r2 = move-exception
            goto L2d
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            r2 = 0
            return r2
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r2
    }

    @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
    @Yue.InterfaceC5336(24)
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m15047(@Yue.InterfaceC4410 android.location.LocationManager r2, @Yue.InterfaceC4410 java.util.concurrent.Executor r3, @Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r2 = Yue.C3741.C3746.m15072(r2, r3, r4)
            return r2
        Lb:
            if (r0 != r1) goto L12
            boolean r2 = m15048(r2, r3, r4)
            return r2
        L12:
            Yue.ۥۢ۟ۡ<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = Yue.C3741.C3748.f11905
            monitor-enter(r0)
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۢ r1 = new Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۢ     // Catch: java.lang.Throwable -> L29
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L29
            m15056(r2, r4)     // Catch: java.lang.Throwable -> L29
            boolean r2 = Yue.C3741.C3743.m15060(r2, r1)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            r2 = 1
            return r2
        L29:
            r2 = move-exception
            goto L2e
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            r2 = 0
            return r2
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r2
    }

    @Yue.InterfaceC5336(30)
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m15048(@Yue.InterfaceC4410 android.location.LocationManager r8, @Yue.InterfaceC4410 java.util.concurrent.Executor r9, @Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r10) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto L6b
            r0 = 0
            java.lang.Class<?> r1 = Yue.C3741.f11890     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto L13
            java.lang.String r1 = "android.location.GnssRequest$Builder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L6a
            Yue.C3741.f11890 = r1     // Catch: java.lang.Throwable -> L6a
        L13:
            java.lang.reflect.Method r1 = Yue.C3741.f11891     // Catch: java.lang.Throwable -> L6a
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L26
            java.lang.Class<?> r1 = Yue.C3741.f11890     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "build"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r3)     // Catch: java.lang.Throwable -> L6a
            Yue.C3741.f11891 = r1     // Catch: java.lang.Throwable -> L6a
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L6a
        L26:
            java.lang.reflect.Method r1 = Yue.C3741.f11892     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto L45
            java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
            java.lang.String r4 = "registerGnssMeasurementsCallback"
            java.lang.String r5 = "android.location.GnssRequest"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.Class<java.util.concurrent.Executor> r6 = java.util.concurrent.Executor.class
            java.lang.Class<android.location.GnssMeasurementsEvent$Callback> r7 = android.location.GnssMeasurementsEvent.Callback.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7}     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L6a
            Yue.C3741.f11892 = r1     // Catch: java.lang.Throwable -> L6a
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L6a
        L45:
            java.lang.reflect.Method r1 = Yue.C3741.f11892     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Method r4 = Yue.C3741.f11891     // Catch: java.lang.Throwable -> L6a
            java.lang.Class<?> r5 = Yue.C3741.f11890     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r5 = r5.newInstance(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r3 = r4.invoke(r5, r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r9 = new java.lang.Object[]{r3, r9, r10}     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r8 = r1.invoke(r8, r9)     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto L6a
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L6a
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto L6a
            r0 = r2
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
    }

    @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static boolean m15049(@Yue.InterfaceC4410 android.location.LocationManager r2, @Yue.InterfaceC4410 Yue.AbstractC2887.AbstractC2888 r3, @Yue.InterfaceC4410 android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lf
            java.util.concurrent.Executor r4 = Yue.C2275.m10520(r4)
            boolean r2 = m15051(r2, r4, r3)
            return r2
        Lf:
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۥ r0 = new Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۥ
            r0.<init>(r4)
            boolean r2 = m15051(r2, r0, r3)
            return r2
    }

    @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m15050(android.location.LocationManager r2, android.os.Handler r3, java.util.concurrent.Executor r4, Yue.AbstractC2887.AbstractC2888 r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C3741.C3745.m15069(r2, r3, r4, r5)
            return r2
        Lb:
            boolean r2 = Yue.C3741.C3743.m15062(r2, r3, r4, r5)
            return r2
    }

    @Yue.InterfaceC5344("android.permission.ACCESS_FINE_LOCATION")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m15051(@Yue.InterfaceC4410 android.location.LocationManager r2, @Yue.InterfaceC4410 java.util.concurrent.Executor r3, @Yue.InterfaceC4410 Yue.AbstractC2887.AbstractC2888 r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            r0 = 0
            boolean r2 = m15050(r2, r0, r3, r4)
            return r2
        Lc:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L16
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L16:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            boolean r2 = m15050(r2, r1, r3, r4)
            return r2
    }

    @Yue.InterfaceC2947("sLocationListeners")
    @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m15052(android.location.LocationManager r3, Yue.C3741.C3754 r4) {
            java.util.WeakHashMap<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ, java.lang.ref.WeakReference<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ>> r0 = Yue.C3741.f11893
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r1 = r4.m15102()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            java.lang.Object r4 = r0.put(r1, r2)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            if (r4 == 0) goto L1a
            java.lang.Object r4 = r4.get()
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ r4 = (Yue.C3741.C3754) r4
            goto L1b
        L1a:
            r4 = 0
        L1b:
            if (r4 == 0) goto L23
            r4.m15109()
            r3.removeUpdates(r4)
        L23:
            return
    }

    @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m15053(@Yue.InterfaceC4410 android.location.LocationManager r6, @Yue.InterfaceC4410 Yue.InterfaceC3737 r7) {
            java.util.WeakHashMap<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ, java.lang.ref.WeakReference<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ>> r0 = Yue.C3741.f11893
            monitor-enter(r0)
            java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
            r2 = 0
        Lc:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L31
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L31
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ r3 = (Yue.C3741.C3754) r3     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L21
            goto Lc
        L21:
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r4 = r3.m15102()     // Catch: java.lang.Throwable -> L31
            Yue.ۥ۠ۧۨ۠ r5 = r4.f11914     // Catch: java.lang.Throwable -> L31
            if (r5 != r7) goto Lc
            if (r2 != 0) goto L33
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r6 = move-exception
            goto L5a
        L33:
            r2.add(r4)     // Catch: java.lang.Throwable -> L31
            r3.m15109()     // Catch: java.lang.Throwable -> L31
            r6.removeUpdates(r3)     // Catch: java.lang.Throwable -> L31
            goto Lc
        L3d:
            if (r2 == 0) goto L55
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L31
        L43:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L31
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r2 = (Yue.C3741.C3753) r2     // Catch: java.lang.Throwable -> L31
            java.util.WeakHashMap<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ, java.lang.ref.WeakReference<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ>> r3 = Yue.C3741.f11893     // Catch: java.lang.Throwable -> L31
            r3.remove(r2)     // Catch: java.lang.Throwable -> L31
            goto L43
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            r6.removeUpdates(r7)
            return
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r6
    }

    @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m15054(@Yue.InterfaceC4410 android.location.LocationManager r8, @Yue.InterfaceC4410 java.lang.String r9, @Yue.InterfaceC4410 Yue.C3776 r10, @Yue.InterfaceC4410 Yue.InterfaceC3737 r11, @Yue.InterfaceC4410 android.os.Looper r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L17
            android.location.LocationRequest r10 = r10.m15128()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r12)
            java.util.concurrent.Executor r12 = Yue.C2275.m10520(r0)
            Yue.C3741.C3746.m15073(r8, r9, r10, r12, r11)
            return
        L17:
            boolean r0 = Yue.C3741.C3742.m15058(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L1e
            return
        L1e:
            long r3 = r10.m15122()
            float r5 = r10.m15125()
            r1 = r8
            r2 = r9
            r6 = r11
            r7 = r12
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            return
    }

    @Yue.InterfaceC5344(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m15055(@Yue.InterfaceC4410 android.location.LocationManager r8, @Yue.InterfaceC4410 java.lang.String r9, @Yue.InterfaceC4410 Yue.C3776 r10, @Yue.InterfaceC4410 java.util.concurrent.Executor r11, @Yue.InterfaceC4410 Yue.InterfaceC3737 r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Le
            android.location.LocationRequest r10 = r10.m15128()
            Yue.C3741.C3746.m15073(r8, r9, r10, r11, r12)
            return
        Le:
            r1 = 30
            if (r0 < r1) goto L19
            boolean r0 = Yue.C3741.C3745.m15070(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L19
            return
        L19:
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ r0 = new Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ r1 = new Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ
            r1.<init>(r9, r12)
            r0.<init>(r1, r11)
            boolean r11 = Yue.C3741.C3742.m15059(r8, r9, r10, r0)
            if (r11 == 0) goto L2a
            return
        L2a:
            java.util.WeakHashMap<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۦ, java.lang.ref.WeakReference<Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۧ>> r11 = Yue.C3741.f11893
            monitor-enter(r11)
            long r3 = r10.m15122()     // Catch: java.lang.Throwable -> L44
            float r5 = r10.m15125()     // Catch: java.lang.Throwable -> L44
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L44
            r1 = r8
            r2 = r9
            r6 = r0
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L44
            m15052(r8, r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r8 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L44
            throw r8
    }

    @Yue.InterfaceC5336(24)
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m15056(@Yue.InterfaceC4410 android.location.LocationManager r2, @Yue.InterfaceC4410 android.location.GnssMeasurementsEvent.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            Yue.C3741.C3743.m15063(r2, r3)
            goto L26
        La:
            Yue.ۥۢ۟ۡ<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = Yue.C3741.C3748.f11905
            monitor-enter(r0)
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L20
            android.location.GnssMeasurementsEvent$Callback r3 = (android.location.GnssMeasurementsEvent.Callback) r3     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L25
            boolean r1 = r3 instanceof Yue.C3741.C3749     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            r1 = r3
            Yue.ۥ۠ۧۨۤ$ۥ۟۟۟ۢ r1 = (Yue.C3741.C3749) r1     // Catch: java.lang.Throwable -> L20
            r1.m15085()     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r2 = move-exception
            goto L27
        L22:
            Yue.C3741.C3743.m15063(r2, r3)     // Catch: java.lang.Throwable -> L20
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
        L26:
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m15057(@Yue.InterfaceC4410 android.location.LocationManager r1, @Yue.InterfaceC4410 Yue.AbstractC2887.AbstractC2888 r2) {
            Yue.ۥۢ۟ۡ<java.lang.Object, java.lang.Object> r0 = Yue.C3741.C3748.f11904
            monitor-enter(r0)
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            Yue.C3741.C3743.m15064(r1, r2)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }
}
