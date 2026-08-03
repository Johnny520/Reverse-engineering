package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
public final class C6118 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C6122 f22063;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f22064;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f22065;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.AbstractC6111 f22066;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.AbstractC6111> f22067;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f22068;

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۡ$ۥ, reason: contains not printable characters */
    public static final class C6119 extends Yue.AbstractC6111 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.concurrent.CountDownLatch f22069;

        public C6119() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = Yue.C6656.f23212
                r0.append(r1)
                java.lang.String r1 = " awaitIdle"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.f22069 = r0
                return
        }

        @Override // Yue.AbstractC6111
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo8734() {
                r2 = this;
                java.util.concurrent.CountDownLatch r0 = r2.f22069
                r0.countDown()
                r0 = -1
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final java.util.concurrent.CountDownLatch m22961() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.f22069
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۡ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n*L\n1#1,218:1\n*E\n"})
    public static final class C6120 extends Yue.AbstractC6111 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2823<Yue.C6593> f22070;

        public C6120(java.lang.String r1, boolean r2, Yue.InterfaceC2823<Yue.C6593> r3) {
                r0 = this;
                r0.f22070 = r3
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC6111
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo8734() {
                r2 = this;
                Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r2.f22070
                r0.invoke()
                r0 = -1
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۡ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"})
    public static final class C6121 extends Yue.AbstractC6111 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2823<java.lang.Long> f22071;

        public C6121(java.lang.String r3, Yue.InterfaceC2823<java.lang.Long> r4) {
                r2 = this;
                r2.f22071 = r4
                r4 = 2
                r0 = 0
                r1 = 0
                r2.<init>(r3, r1, r4, r0)
                return
        }

        @Override // Yue.AbstractC6111
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo8734() {
                r2 = this;
                Yue.ۥۣ۠۠ۨ<java.lang.Long> r0 = r2.f22071
                java.lang.Object r0 = r0.invoke()
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                return r0
        }
    }

    public C6118(@Yue.InterfaceC4418 Yue.C6122 r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f22063 = r2
            r1.f22064 = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f22067 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m22940(Yue.C6118 r0, java.lang.String r1, long r2, boolean r4, Yue.InterfaceC2823 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L6
            r2 = 0
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r4 = 1
        Lb:
            java.lang.String r6 = "name"
            Yue.C3329.m13906(r1, r6)
            java.lang.String r6 = "block"
            Yue.C3329.m13906(r5, r6)
            Yue.ۥۢۡ۟ۡ$ۥ۟ r6 = new Yue.ۥۢۡ۟ۡ$ۥ۟
            r6.<init>(r1, r4, r5)
            r0.m22954(r6, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m22941(Yue.C6118 r0, Yue.AbstractC6111 r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            r0.m22954(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m22942(Yue.C6118 r0, java.lang.String r1, long r2, Yue.InterfaceC2823 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            r2 = 0
        L6:
            java.lang.String r5 = "name"
            Yue.C3329.m13906(r1, r5)
            java.lang.String r5 = "block"
            Yue.C3329.m13906(r4, r5)
            Yue.ۥۢۡ۟ۡ$ۥ۟۟ r5 = new Yue.ۥۢۡ۟ۡ$ۥ۟۟
            r5.<init>(r1, r4)
            r0.m22954(r5, r2)
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f22064
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m22943() {
            r3 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            Yue.ۥۢۡ۟ۢ r0 = r3.f22063
            monitor-enter(r0)
            boolean r1 = r3.m22944()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L43
            Yue.ۥۢۡ۟ۢ r1 = r3.f22063     // Catch: java.lang.Throwable -> L41
            r1.m22970(r3)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r1 = move-exception
            goto L47
        L43:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            return
        L47:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m22944() {
            r5 = this;
            Yue.ۥۢ۠ۨۦ r0 = r5.f22066
            r1 = 1
            if (r0 == 0) goto L10
            Yue.C3329.m13903(r0)
            boolean r0 = r0.m22926()
            if (r0 == 0) goto L10
            r5.f22068 = r1
        L10:
            java.util.List<Yue.ۥۢ۠ۨۦ> r0 = r5.f22067
            int r0 = r0.size()
            int r0 = r0 - r1
            r2 = 0
        L18:
            r3 = -1
            if (r3 >= r0) goto L4d
            java.util.List<Yue.ۥۢ۠ۨۦ> r3 = r5.f22067
            java.lang.Object r3 = r3.get(r0)
            Yue.ۥۢ۠ۨۦ r3 = (Yue.AbstractC6111) r3
            boolean r3 = r3.m22926()
            if (r3 == 0) goto L4a
            java.util.List<Yue.ۥۢ۠ۨۦ> r2 = r5.f22067
            java.lang.Object r2 = r2.get(r0)
            Yue.ۥۢ۠ۨۦ r2 = (Yue.AbstractC6111) r2
            Yue.ۥۢۡ۟ۢ$ۥ۟ r3 = Yue.C6122.f22072
            java.util.logging.Logger r3 = r3.m22977()
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r3 = r3.isLoggable(r4)
            if (r3 == 0) goto L44
            java.lang.String r3 = "canceled"
            Yue.C6117.m22935(r2, r5, r3)
        L44:
            java.util.List<Yue.ۥۢ۠ۨۦ> r2 = r5.f22067
            r2.remove(r0)
            r2 = r1
        L4a:
            int r0 = r0 + (-1)
            goto L18
        L4d:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m22945(@Yue.InterfaceC4418 java.lang.String r2, long r3, boolean r5, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r6) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥۢۡ۟ۡ$ۥ۟ r0 = new Yue.ۥۢۡ۟ۡ$ۥ۟
            r0.<init>(r2, r5, r6)
            r1.m22954(r0, r3)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractC6111 m22946() {
            r1 = this;
            Yue.ۥۢ۠ۨۦ r0 = r1.f22066
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m22947() {
            r1 = this;
            boolean r0 = r1.f22068
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.List<Yue.AbstractC6111> m22948() {
            r1 = this;
            java.util.List<Yue.ۥۢ۠ۨۦ> r0 = r1.f22067
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.lang.String m22949() {
            r1 = this;
            java.lang.String r0 = r1.f22064
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final java.util.List<Yue.AbstractC6111> m22950() {
            r2 = this;
            Yue.ۥۢۡ۟ۢ r0 = r2.f22063
            monitor-enter(r0)
            java.util.List<Yue.ۥۢ۠ۨۦ> r1 = r2.f22067     // Catch: java.lang.Throwable -> Lb
            java.util.List r1 = Yue.C1219.m6537(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m22951() {
            r1 = this;
            boolean r0 = r1.f22065
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Yue.C6122 m22952() {
            r1 = this;
            Yue.ۥۢۡ۟ۢ r0 = r1.f22063
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final java.util.concurrent.CountDownLatch m22953() {
            r5 = this;
            Yue.ۥۢۡ۟ۢ r0 = r5.f22063
            monitor-enter(r0)
            Yue.ۥۢ۠ۨۦ r1 = r5.f22066     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 != 0) goto L19
            java.util.List<Yue.ۥۢ۠ۨۦ> r1 = r5.f22067     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L17:
            r1 = move-exception
            goto L5d
        L19:
            Yue.ۥۢ۠ۨۦ r1 = r5.f22066     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1 instanceof Yue.C6118.C6119     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L27
            Yue.ۥۢۡ۟ۡ$ۥ r1 = (Yue.C6118.C6119) r1     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CountDownLatch r1 = r1.m22961()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L27:
            java.util.List<Yue.ۥۢ۠ۨۦ> r1 = r5.f22067     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L2d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L17
            Yue.ۥۢ۠ۨۦ r3 = (Yue.AbstractC6111) r3     // Catch: java.lang.Throwable -> L17
            boolean r4 = r3 instanceof Yue.C6118.C6119     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2d
            Yue.ۥۢۡ۟ۡ$ۥ r3 = (Yue.C6118.C6119) r3     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.CountDownLatch r1 = r3.m22961()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L45:
            Yue.ۥۢۡ۟ۡ$ۥ r1 = new Yue.ۥۢۡ۟ۡ$ۥ     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            r3 = 0
            boolean r2 = r5.m22956(r1, r3, r2)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L57
            Yue.ۥۢۡ۟ۢ r2 = r5.f22063     // Catch: java.lang.Throwable -> L17
            r2.m22970(r5)     // Catch: java.lang.Throwable -> L17
        L57:
            java.util.concurrent.CountDownLatch r1 = r1.m22961()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L5d:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m22954(@Yue.InterfaceC4418 Yue.AbstractC6111 r3, long r4) {
            r2 = this;
            java.lang.String r0 = "task"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۢۡ۟ۢ r0 = r2.f22063
            monitor-enter(r0)
            boolean r1 = r2.f22065     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L43
            boolean r4 = r3.m22926()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L2a
            Yue.ۥۢۡ۟ۢ$ۥ۟ r4 = Yue.C6122.f22072     // Catch: java.lang.Throwable -> L26
            java.util.logging.Logger r4 = r4.m22977()     // Catch: java.lang.Throwable -> L26
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L26
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            Yue.C6117.m22935(r3, r2, r4)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r3 = move-exception
            goto L53
        L28:
            monitor-exit(r0)
            return
        L2a:
            Yue.ۥۢۡ۟ۢ$ۥ۟ r4 = Yue.C6122.f22072     // Catch: java.lang.Throwable -> L26
            java.util.logging.Logger r4 = r4.m22977()     // Catch: java.lang.Throwable -> L26
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L26
            boolean r4 = r4.isLoggable(r5)     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L3d
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            Yue.C6117.m22935(r3, r2, r4)     // Catch: java.lang.Throwable -> L26
        L3d:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            throw r3     // Catch: java.lang.Throwable -> L26
        L43:
            r1 = 0
            boolean r3 = r2.m22956(r3, r4, r1)     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L4f
            Yue.ۥۢۡ۟ۢ r3 = r2.f22063     // Catch: java.lang.Throwable -> L26
            r3.m22970(r2)     // Catch: java.lang.Throwable -> L26
        L4f:
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return
        L53:
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m22955(@Yue.InterfaceC4418 java.lang.String r2, long r3, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.Long> r5) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۢۡ۟ۡ$ۥ۟۟ r0 = new Yue.ۥۢۡ۟ۡ$ۥ۟۟
            r0.<init>(r2, r5)
            r1.m22954(r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m22956(@Yue.InterfaceC4418 Yue.AbstractC6111 r10, long r11, boolean r13) {
            r9 = this;
            java.lang.String r0 = "task"
            Yue.C3329.m13906(r10, r0)
            r10.m22930(r9)
            Yue.ۥۢۡ۟ۢ r0 = r9.f22063
            Yue.ۥۢۡ۟ۢ$ۥ r0 = r0.m22969()
            long r0 = r0.mo22975()
            long r2 = r0 + r11
            java.util.List<Yue.ۥۢ۠ۨۦ> r4 = r9.f22067
            int r4 = r4.indexOf(r10)
            r5 = 0
            r6 = -1
            if (r4 == r6) goto L3f
            long r7 = r10.m22928()
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L3a
            Yue.ۥۢۡ۟ۢ$ۥ۟ r11 = Yue.C6122.f22072
            java.util.logging.Logger r11 = r11.m22977()
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            boolean r11 = r11.isLoggable(r12)
            if (r11 == 0) goto L39
            java.lang.String r11 = "already scheduled"
            Yue.C6117.m22935(r10, r9, r11)
        L39:
            return r5
        L3a:
            java.util.List<Yue.ۥۢ۠ۨۦ> r7 = r9.f22067
            r7.remove(r4)
        L3f:
            r10.m22931(r2)
            Yue.ۥۢۡ۟ۢ$ۥ۟ r4 = Yue.C6122.f22072
            java.util.logging.Logger r4 = r4.m22977()
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r4 = r4.isLoggable(r7)
            if (r4 == 0) goto L82
            if (r13 == 0) goto L69
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "run again after "
            r13.append(r4)
            long r2 = r2 - r0
            java.lang.String r2 = Yue.C6117.m22936(r2)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            goto L7f
        L69:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "scheduled after "
            r13.append(r4)
            long r2 = r2 - r0
            java.lang.String r2 = Yue.C6117.m22936(r2)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
        L7f:
            Yue.C6117.m22935(r10, r9, r13)
        L82:
            java.util.List<Yue.ۥۢ۠ۨۦ> r13 = r9.f22067
            java.util.Iterator r13 = r13.iterator()
            r2 = r5
        L89:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto La2
            java.lang.Object r3 = r13.next()
            Yue.ۥۢ۠ۨۦ r3 = (Yue.AbstractC6111) r3
            long r3 = r3.m22928()
            long r3 = r3 - r0
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 <= 0) goto L9f
            goto La3
        L9f:
            int r2 = r2 + 1
            goto L89
        La2:
            r2 = r6
        La3:
            if (r2 != r6) goto Lab
            java.util.List<Yue.ۥۢ۠ۨۦ> r11 = r9.f22067
            int r2 = r11.size()
        Lab:
            java.util.List<Yue.ۥۢ۠ۨۦ> r11 = r9.f22067
            r11.add(r2, r10)
            if (r2 != 0) goto Lb3
            r5 = 1
        Lb3:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m22957(@Yue.InterfaceC4543 Yue.AbstractC6111 r1) {
            r0 = this;
            r0.f22066 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m22958(boolean r1) {
            r0 = this;
            r0.f22068 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m22959(boolean r1) {
            r0 = this;
            r0.f22065 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m22960() {
            r3 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            Yue.ۥۢۡ۟ۢ r0 = r3.f22063
            monitor-enter(r0)
            r1 = 1
            r3.f22065 = r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r3.m22944()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            Yue.ۥۢۡ۟ۢ r1 = r3.f22063     // Catch: java.lang.Throwable -> L44
            r1.m22970(r3)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r1 = move-exception
            goto L4a
        L46:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            return
        L4a:
            monitor-exit(r0)
            throw r1
    }
}
