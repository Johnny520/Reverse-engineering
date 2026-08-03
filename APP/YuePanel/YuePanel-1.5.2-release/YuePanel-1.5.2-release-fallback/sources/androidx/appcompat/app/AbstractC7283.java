package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7283 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean f25130 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f25131 = "AppCompatDelegate";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static androidx.appcompat.app.AbstractC7283.ExecutorC7287 f25132 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String f25133 = "androidx.appcompat.app.AppLocalesMetadataHolderService";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f25134 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @java.lang.Deprecated
    public static final int f25135 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @java.lang.Deprecated
    public static final int f25136 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f25137 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f25138 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f25139 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f25140 = -100;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static int f25141 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static Yue.C3698 f25142 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static Yue.C3698 f25143 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static java.lang.Boolean f25144 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static boolean f25145 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final Yue.C0580<java.lang.ref.WeakReference<androidx.appcompat.app.AbstractC7283>> f25146 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.Object f25147 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final java.lang.Object f25148 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f25149 = 108;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f25150 = 109;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f25151 = 10;

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C7284 {
        public C7284() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.LocaleList m28019(java.lang.String r0) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C7285 {
        public C7285() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.LocaleList m28020(java.lang.Object r0) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r0 = r0.getApplicationLocales()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m28021(java.lang.Object r0, android.os.LocaleList r1) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                r0.setApplicationLocales(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC7286 {
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class ExecutorC7287 implements java.util.concurrent.Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final java.lang.Object f25152;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final java.util.Queue<java.lang.Runnable> f25153;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final java.util.concurrent.Executor f25154;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public java.lang.Runnable f25155;

        public ExecutorC7287(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.f25152 = r0
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.f25153 = r0
                r1.f25154 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m28022(androidx.appcompat.app.AbstractC7283.ExecutorC7287 r0, java.lang.Runnable r1) {
                r0.m28023(r1)
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Object r0 = r3.f25152
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.f25153     // Catch: java.lang.Throwable -> L15
                Yue.ۥ۟ۡ۠ۤ r2 = new Yue.ۥ۟ۡ۠ۤ     // Catch: java.lang.Throwable -> L15
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L15
                r1.add(r2)     // Catch: java.lang.Throwable -> L15
                java.lang.Runnable r4 = r3.f25155     // Catch: java.lang.Throwable -> L15
                if (r4 != 0) goto L17
                r3.m28024()     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r4 = move-exception
                goto L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return
            L19:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r4
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ void m28023(java.lang.Runnable r1) {
                r0 = this;
                r1.run()     // Catch: java.lang.Throwable -> L7
                r0.m28024()
                return
            L7:
                r1 = move-exception
                r0.m28024()
                throw r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m28024() {
                r3 = this;
                java.lang.Object r0 = r3.f25152
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.f25153     // Catch: java.lang.Throwable -> L15
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L15
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L15
                r3.f25155 = r1     // Catch: java.lang.Throwable -> L15
                if (r1 == 0) goto L17
                java.util.concurrent.Executor r2 = r3.f25154     // Catch: java.lang.Throwable -> L15
                r2.execute(r1)     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r1 = move-exception
                goto L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return
            L19:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r1
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class ExecutorC7288 implements java.util.concurrent.Executor {
        public ExecutorC7288() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r2)
                r0.start()
                return
        }
    }

    static {
            androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟ r0 = new androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟
            androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟۟ r1 = new androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟۟
            r1.<init>()
            r0.<init>(r1)
            androidx.appcompat.app.AbstractC7283.f25132 = r0
            r0 = -100
            androidx.appcompat.app.AbstractC7283.f25141 = r0
            r0 = 0
            androidx.appcompat.app.AbstractC7283.f25142 = r0
            androidx.appcompat.app.AbstractC7283.f25143 = r0
            androidx.appcompat.app.AbstractC7283.f25144 = r0
            r0 = 0
            androidx.appcompat.app.AbstractC7283.f25145 = r0
            Yue.ۥ۟ۡۨۦ r0 = new Yue.ۥ۟ۡۨۦ
            r0.<init>()
            androidx.appcompat.app.AbstractC7283.f25146 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AbstractC7283.f25147 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AbstractC7283.f25148 = r0
            return
    }

    public AbstractC7283() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m27956(android.content.Context r0) {
            m27973(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m27957(android.content.Context r0) {
            m27972(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m27958(@Yue.InterfaceC4410 androidx.appcompat.app.AbstractC7283 r3) {
            java.lang.Object r0 = androidx.appcompat.app.AbstractC7283.f25147
            monitor-enter(r0)
            m27975(r3)     // Catch: java.lang.Throwable -> L12
            Yue.ۥ۟ۡۨۦ<java.lang.ref.WeakReference<androidx.appcompat.app.ۥ۟۟۟>> r1 = androidx.appcompat.app.AbstractC7283.f25146     // Catch: java.lang.Throwable -> L12
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L12
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12
            r1.add(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m27959() {
            java.lang.Object r0 = androidx.appcompat.app.AbstractC7283.f25147
            monitor-enter(r0)
            Yue.ۥ۟ۡۨۦ<java.lang.ref.WeakReference<androidx.appcompat.app.ۥ۟۟۟>> r1 = androidx.appcompat.app.AbstractC7283.f25146     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L21
            androidx.appcompat.app.ۥ۟۟۟ r2 = (androidx.appcompat.app.AbstractC7283) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L9
            r2.mo27985()     // Catch: java.lang.Throwable -> L21
            goto L9
        L21:
            r1 = move-exception
            goto L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m27960() {
            Yue.ۥ۟ۡۨۦ<java.lang.ref.WeakReference<androidx.appcompat.app.ۥ۟۟۟>> r0 = androidx.appcompat.app.AbstractC7283.f25146
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.appcompat.app.ۥ۟۟۟ r1 = (androidx.appcompat.app.AbstractC7283) r1
            if (r1 == 0) goto L6
            r1.mo27984()
            goto L6
        L1e:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static androidx.appcompat.app.AbstractC7283 m27961(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4544 Yue.InterfaceC0437 r2) {
            androidx.appcompat.app.ۥ۟۟۟۟ r0 = new androidx.appcompat.app.ۥ۟۟۟۟
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static androidx.appcompat.app.AbstractC7283 m27962(@Yue.InterfaceC4410 android.app.Dialog r1, @Yue.InterfaceC4544 Yue.InterfaceC0437 r2) {
            androidx.appcompat.app.ۥ۟۟۟۟ r0 = new androidx.appcompat.app.ۥ۟۟۟۟
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static androidx.appcompat.app.AbstractC7283 m27963(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.app.Activity r2, @Yue.InterfaceC4544 Yue.InterfaceC0437 r3) {
            androidx.appcompat.app.ۥ۟۟۟۟ r0 = new androidx.appcompat.app.ۥ۟۟۟۟
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static androidx.appcompat.app.AbstractC7283 m27964(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.view.Window r2, @Yue.InterfaceC4544 Yue.InterfaceC0437 r3) {
            androidx.appcompat.app.ۥ۟۟۟۟ r0 = new androidx.appcompat.app.ۥ۟۟۟۟
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC0412
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static Yue.C3698 m27965() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L15
            java.lang.Object r0 = m27967()
            if (r0 == 0) goto L1a
            android.os.LocaleList r0 = androidx.appcompat.app.AbstractC7283.C7285.m28020(r0)
            Yue.ۥ۠ۧۦۥ r0 = Yue.C3698.m14901(r0)
            return r0
        L15:
            Yue.ۥ۠ۧۦۥ r0 = androidx.appcompat.app.AbstractC7283.f25142
            if (r0 == 0) goto L1a
            return r0
        L1a:
            Yue.ۥ۠ۧۦۥ r0 = Yue.C3698.m14899()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static int m27966() {
            int r0 = androidx.appcompat.app.AbstractC7283.f25141
            return r0
    }

    @Yue.InterfaceC5336(33)
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static java.lang.Object m27967() {
            Yue.ۥ۟ۡۨۦ<java.lang.ref.WeakReference<androidx.appcompat.app.ۥ۟۟۟>> r0 = androidx.appcompat.app.AbstractC7283.f25146
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.appcompat.app.ۥ۟۟۟ r1 = (androidx.appcompat.app.AbstractC7283) r1
            if (r1 == 0) goto L6
            android.content.Context r1 = r1.mo27991()
            if (r1 == 0) goto L6
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r1.getSystemService(r0)
            return r0
        L27:
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static Yue.C3698 m27968() {
            Yue.ۥ۠ۧۦۥ r0 = androidx.appcompat.app.AbstractC7283.f25142
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static Yue.C3698 m27969() {
            Yue.ۥ۠ۧۦۥ r0 = androidx.appcompat.app.AbstractC7283.f25143
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static boolean m27970(android.content.Context r1) {
            java.lang.Boolean r0 = androidx.appcompat.app.AbstractC7283.f25144
            if (r0 != 0) goto L24
            android.content.pm.ServiceInfo r1 = Yue.ServiceC0534.m1891(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            if (r1 == 0) goto L24
            java.lang.String r0 = "autoStoreLocales"
            boolean r1 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            androidx.appcompat.app.AbstractC7283.f25144 = r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            goto L24
        L19:
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Checking for metadata for AppLocalesMetadataHolderService : Service not found"
            android.util.Log.d(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.appcompat.app.AbstractC7283.f25144 = r1
        L24:
            java.lang.Boolean r1 = androidx.appcompat.app.AbstractC7283.f25144
            boolean r1 = r1.booleanValue()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static boolean m27971() {
            boolean r0 = Yue.C6670.m25685()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ void m27972(android.content.Context r0) {
            m27982(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ void m27973(android.content.Context r0) {
            m27981(r0)
            r0 = 1
            androidx.appcompat.app.AbstractC7283.f25145 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static void m27974(@Yue.InterfaceC4410 androidx.appcompat.app.AbstractC7283 r1) {
            java.lang.Object r0 = androidx.appcompat.app.AbstractC7283.f25147
            monitor-enter(r0)
            m27975(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static void m27975(@Yue.InterfaceC4410 androidx.appcompat.app.AbstractC7283 r3) {
            java.lang.Object r0 = androidx.appcompat.app.AbstractC7283.f25147
            monitor-enter(r0)
            Yue.ۥ۟ۡۨۦ<java.lang.ref.WeakReference<androidx.appcompat.app.ۥ۟۟۟>> r1 = androidx.appcompat.app.AbstractC7283.f25146     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L23
            androidx.appcompat.app.ۥ۟۟۟ r2 = (androidx.appcompat.app.AbstractC7283) r2     // Catch: java.lang.Throwable -> L23
            if (r2 == r3) goto L1f
            if (r2 != 0) goto L9
        L1f:
            r1.remove()     // Catch: java.lang.Throwable -> L23
            goto L9
        L23:
            r3 = move-exception
            goto L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static void m27976() {
            r0 = 0
            androidx.appcompat.app.AbstractC7283.f25142 = r0
            androidx.appcompat.app.AbstractC7283.f25143 = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static void m27977(@Yue.InterfaceC4410 Yue.C3698 r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1b
            java.lang.Object r0 = m27967()
            if (r0 == 0) goto L30
            java.lang.String r2 = r2.m14908()
            android.os.LocaleList r2 = androidx.appcompat.app.AbstractC7283.C7284.m28019(r2)
            androidx.appcompat.app.AbstractC7283.C7285.m28021(r0, r2)
            goto L30
        L1b:
            Yue.ۥ۠ۧۦۥ r0 = androidx.appcompat.app.AbstractC7283.f25142
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L30
            java.lang.Object r0 = androidx.appcompat.app.AbstractC7283.f25147
            monitor-enter(r0)
            androidx.appcompat.app.AbstractC7283.f25142 = r2     // Catch: java.lang.Throwable -> L2d
            m27960()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r2
        L30:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m27978(boolean r0) {
            Yue.C6670.m25686(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static void m27979(int r1) {
            r0 = -1
            if (r1 == r0) goto L16
            if (r1 == 0) goto L16
            r0 = 1
            if (r1 == r0) goto L16
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L16
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "setDefaultNightMode() called with an unknown mode"
            android.util.Log.d(r1, r0)
            goto L1f
        L16:
            int r0 = androidx.appcompat.app.AbstractC7283.f25141
            if (r0 == r1) goto L1f
            androidx.appcompat.app.AbstractC7283.f25141 = r1
            m27959()
        L1f:
            return
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static void m27980(boolean r0) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            androidx.appcompat.app.AbstractC7283.f25144 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static void m27981(android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L3c
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r4, r1)
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            int r1 = r1.getComponentEnabledSetting(r0)
            r2 = 1
            if (r1 == r2) goto L3c
            Yue.ۥ۠ۧۦۥ r1 = m27965()
            boolean r1 = r1.m14906()
            if (r1 == 0) goto L35
            java.lang.String r1 = Yue.C0536.m1894(r4)
            java.lang.String r3 = "locale"
            java.lang.Object r3 = r4.getSystemService(r3)
            if (r3 == 0) goto L35
            android.os.LocaleList r1 = androidx.appcompat.app.AbstractC7283.C7284.m28019(r1)
            androidx.appcompat.app.AbstractC7283.C7285.m28021(r3, r1)
        L35:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r4.setComponentEnabledSetting(r0, r2, r2)
        L3c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static void m27982(android.content.Context r3) {
            boolean r0 = m27970(r3)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1c
            boolean r0 = androidx.appcompat.app.AbstractC7283.f25145
            if (r0 != 0) goto L57
            androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟ r0 = androidx.appcompat.app.AbstractC7283.f25132
            Yue.ۥ۟ۡ۠ۢ r1 = new Yue.ۥ۟ۡ۠ۢ
            r1.<init>(r3)
            r0.execute(r1)
            goto L57
        L1c:
            java.lang.Object r0 = androidx.appcompat.app.AbstractC7283.f25148
            monitor-enter(r0)
            Yue.ۥ۠ۧۦۥ r1 = androidx.appcompat.app.AbstractC7283.f25142     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L43
            Yue.ۥ۠ۧۦۥ r1 = androidx.appcompat.app.AbstractC7283.f25143     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L34
            java.lang.String r3 = Yue.C0536.m1894(r3)     // Catch: java.lang.Throwable -> L32
            Yue.ۥ۠ۧۦۥ r3 = Yue.C3698.m14896(r3)     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.AbstractC7283.f25143 = r3     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r3 = move-exception
            goto L58
        L34:
            Yue.ۥ۠ۧۦۥ r3 = androidx.appcompat.app.AbstractC7283.f25143     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.m14906()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L3e:
            Yue.ۥ۠ۧۦۥ r3 = androidx.appcompat.app.AbstractC7283.f25143     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.AbstractC7283.f25142 = r3     // Catch: java.lang.Throwable -> L32
            goto L56
        L43:
            Yue.ۥ۠ۧۦۥ r2 = androidx.appcompat.app.AbstractC7283.f25143     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L56
            Yue.ۥ۠ۧۦۥ r1 = androidx.appcompat.app.AbstractC7283.f25142     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.app.AbstractC7283.f25143 = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.m14908()     // Catch: java.lang.Throwable -> L32
            Yue.C0536.m1893(r3, r1)     // Catch: java.lang.Throwable -> L32
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
        L57:
            return
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract void mo27983(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean mo27984() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract boolean mo27985();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27986(android.content.Context r3) {
            r2 = this;
            androidx.appcompat.app.ۥ۟۟۟$ۥ۟۟۟ r0 = androidx.appcompat.app.AbstractC7283.f25132
            Yue.ۥۣ۟ۡ۠ r1 = new Yue.ۥۣ۟ۡ۠
            r1.<init>(r3)
            r0.execute(r1)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m27987(android.content.Context r1) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC0907
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.content.Context mo27988(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.m27987(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract android.view.View mo27989(@Yue.InterfaceC4544 android.view.View r1, java.lang.String r2, @Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 android.util.AttributeSet r4);

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public abstract <T extends android.view.View> T mo27990(@Yue.InterfaceC3214 int r1);

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public android.content.Context mo27991() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public abstract androidx.appcompat.app.C7275.InterfaceC7277 mo27992();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int mo27993() {
            r1 = this;
            r0 = -100
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public abstract android.view.MenuInflater mo27994();

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public abstract androidx.appcompat.app.AbstractC7267 mo27995();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public abstract boolean mo27996(int r1);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public abstract void mo27997();

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public abstract void mo27998();

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public abstract boolean mo27999();

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public abstract void mo28000(android.content.res.Configuration r1);

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28001(android.os.Bundle r1);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public abstract void mo28002();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public abstract void mo28003(android.os.Bundle r1);

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public abstract void mo28004();

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public abstract void mo28005(android.os.Bundle r1);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28006();

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public abstract void mo28007();

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public abstract boolean mo28008(int r1);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public abstract void mo28009(@Yue.InterfaceC3573 int r1);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public abstract void mo28010(android.view.View r1);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public abstract void mo28011(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public abstract void mo28012(boolean r1);

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public abstract void mo28013(int r1);

    @Yue.InterfaceC0907
    @Yue.InterfaceC5336(33)
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void mo28014(@Yue.InterfaceC4544 android.window.OnBackInvokedDispatcher r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public abstract void mo28015(@Yue.InterfaceC4544 androidx.appcompat.widget.Toolbar r1);

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public void mo28016(@Yue.InterfaceC6018 int r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public abstract void mo28017(@Yue.InterfaceC4544 java.lang.CharSequence r1);

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public abstract Yue.AbstractC0181 mo28018(@Yue.InterfaceC4410 Yue.AbstractC0181.InterfaceC0182 r1);
}
