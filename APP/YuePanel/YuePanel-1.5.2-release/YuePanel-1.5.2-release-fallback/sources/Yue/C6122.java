package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
public final class C6122 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6122.C6124 f22072 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C6122 f22073 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.logging.Logger f22074 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C6122.InterfaceC6123 f22075;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f22076;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f22077;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f22078;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.C6118> f22079;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.C6118> f22080;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Runnable f22081;

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ$ۥ, reason: contains not printable characters */
    public interface InterfaceC6123 {
        void execute(@Yue.InterfaceC4418 java.lang.Runnable r1);

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo22973(@Yue.InterfaceC4418 Yue.C6122 r1, long r2);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        void mo22974(@Yue.InterfaceC4418 Yue.C6122 r1);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        long mo22975();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        void mo22976(@Yue.InterfaceC4418 Yue.C6122 r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ$ۥ۟, reason: contains not printable characters */
    public static final class C6124 {
        public C6124() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6124(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.logging.Logger m22977() {
                r1 = this;
                java.util.logging.Logger r0 = Yue.C6122.m22962()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    public static final class C6125 implements Yue.C6122.InterfaceC6123 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.concurrent.ThreadPoolExecutor f22082;

        public C6125(@Yue.InterfaceC4418 java.util.concurrent.ThreadFactory r10) {
                r9 = this;
                java.lang.String r0 = "threadFactory"
                Yue.C3329.m13906(r10, r0)
                r9.<init>()
                java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
                r7.<init>()
                r2 = 0
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = 60
                r1 = r0
                r8 = r10
                r1.<init>(r2, r3, r4, r6, r7, r8)
                r9.f22082 = r0
                return
        }

        @Override // Yue.C6122.InterfaceC6123
        public void execute(@Yue.InterfaceC4418 java.lang.Runnable r2) {
                r1 = this;
                java.lang.String r0 = "runnable"
                Yue.C3329.m13906(r2, r0)
                java.util.concurrent.ThreadPoolExecutor r0 = r1.f22082
                r0.execute(r2)
                return
        }

        @Override // Yue.C6122.InterfaceC6123
        /* JADX INFO: renamed from: ۥ */
        public void mo22973(@Yue.InterfaceC4418 Yue.C6122 r8, long r9) throws java.lang.InterruptedException {
                r7 = this;
                java.lang.String r0 = "taskRunner"
                Yue.C3329.m13906(r8, r0)
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r9 / r0
                long r0 = r0 * r2
                long r0 = r9 - r0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L17
                int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r9 <= 0) goto L1b
            L17:
                int r9 = (int) r0
                r8.wait(r2, r9)
            L1b:
                return
        }

        @Override // Yue.C6122.InterfaceC6123
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo22974(@Yue.InterfaceC4418 Yue.C6122 r2) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                Yue.C3329.m13906(r2, r0)
                r2.notify()
                return
        }

        @Override // Yue.C6122.InterfaceC6123
        /* JADX INFO: renamed from: ۥ۟۟ */
        public long mo22975() {
                r2 = this;
                long r0 = java.lang.System.nanoTime()
                return r0
        }

        @Override // Yue.C6122.InterfaceC6123
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo22976(@Yue.InterfaceC4418 Yue.C6122 r2) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                Yue.C3329.m13906(r2, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m22978() {
                r1 = this;
                java.util.concurrent.ThreadPoolExecutor r0 = r1.f22082
                r0.shutdown()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۢ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n+ 2 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n*L\n1#1,314:1\n35#2,19:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n*L\n62#1:315,19\n*E\n"})
    public static final class RunnableC6126 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6122 f22083;

        public RunnableC6126(Yue.C6122 r1) {
                r0 = this;
                r0.f22083 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
            L0:
                Yue.ۥۢۡ۟ۢ r0 = r8.f22083
                monitor-enter(r0)
                Yue.ۥۢ۠ۨۦ r1 = r0.m22966()     // Catch: java.lang.Throwable -> L96
                monitor-exit(r0)
                if (r1 != 0) goto Lb
                return
            Lb:
                Yue.ۥۢۡ۟ۡ r0 = r1.m22929()
                Yue.C3329.m13903(r0)
                Yue.ۥۢۡ۟ۢ r2 = r8.f22083
                Yue.ۥۢۡ۟ۢ$ۥ۟ r3 = Yue.C6122.f22072
                java.util.logging.Logger r3 = r3.m22977()
                java.util.logging.Level r4 = java.util.logging.Level.FINE
                boolean r3 = r3.isLoggable(r4)
                if (r3 == 0) goto L34
                Yue.ۥۢۡ۟ۢ r4 = r0.m22952()
                Yue.ۥۢۡ۟ۢ$ۥ r4 = r4.m22969()
                long r4 = r4.mo22975()
                java.lang.String r6 = "starting"
                Yue.C6117.m22935(r1, r0, r6)
                goto L36
            L34:
                r4 = -1
            L36:
                Yue.C6122.m22963(r2, r1)     // Catch: java.lang.Throwable -> L65
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L63
                if (r3 == 0) goto L0
                Yue.ۥۢۡ۟ۢ r2 = r0.m22952()
                Yue.ۥۢۡ۟ۢ$ۥ r2 = r2.m22969()
                long r2 = r2.mo22975()
                long r2 = r2 - r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "finished run in "
                r4.append(r5)
                java.lang.String r2 = Yue.C6117.m22936(r2)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                Yue.C6117.m22935(r1, r0, r2)
                goto L0
            L63:
                r2 = move-exception
                goto L6e
            L65:
                r6 = move-exception
                Yue.ۥۢۡ۟ۢ$ۥ r2 = r2.m22969()     // Catch: java.lang.Throwable -> L63
                r2.execute(r8)     // Catch: java.lang.Throwable -> L63
                throw r6     // Catch: java.lang.Throwable -> L63
            L6e:
                if (r3 == 0) goto L95
                Yue.ۥۢۡ۟ۢ r3 = r0.m22952()
                Yue.ۥۢۡ۟ۢ$ۥ r3 = r3.m22969()
                long r6 = r3.mo22975()
                long r6 = r6 - r4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "failed a run in "
                r3.append(r4)
                java.lang.String r4 = Yue.C6117.m22936(r6)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                Yue.C6117.m22935(r1, r0, r3)
            L95:
                throw r2
            L96:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }
    }

    static {
            Yue.ۥۢۡ۟ۢ$ۥ۟ r0 = new Yue.ۥۢۡ۟ۢ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C6122.f22072 = r0
            Yue.ۥۢۡ۟ۢ r0 = new Yue.ۥۢۡ۟ۢ
            Yue.ۥۢۡ۟ۢ$ۥ۟۟ r1 = new Yue.ۥۢۡ۟ۢ$ۥ۟۟
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = Yue.C6656.f23212
            r2.append(r3)
            java.lang.String r3 = " TaskRunner"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            java.util.concurrent.ThreadFactory r2 = Yue.C6656.m25603(r2, r3)
            r1.<init>(r2)
            r0.<init>(r1)
            Yue.C6122.f22073 = r0
            java.lang.Class<Yue.ۥۢۡ۟ۢ> r0 = Yue.C6122.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r1 = "getLogger(TaskRunner::class.java.name)"
            Yue.C3329.m13905(r0, r1)
            Yue.C6122.f22074 = r0
            return
    }

    public C6122(@Yue.InterfaceC4418 Yue.C6122.InterfaceC6123 r2) {
            r1 = this;
            java.lang.String r0 = "backend"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f22075 = r2
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.f22076 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f22079 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f22080 = r2
            Yue.ۥۢۡ۟ۢ$ۥ۟۟۟ r2 = new Yue.ۥۢۡ۟ۢ$ۥ۟۟۟
            r2.<init>(r1)
            r1.f22081 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.logging.Logger m22962() {
            java.util.logging.Logger r0 = Yue.C6122.f22074
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ void m22963(Yue.C6122 r0, Yue.AbstractC6111 r1) {
            r0.m22972(r1)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.List<Yue.C6118> m22964() {
            r2 = this;
            monitor-enter(r2)
            java.util.List<Yue.ۥۢۡ۟ۡ> r0 = r2.f22079     // Catch: java.lang.Throwable -> Lb
            java.util.List<Yue.ۥۢۡ۟ۡ> r1 = r2.f22080     // Catch: java.lang.Throwable -> Lb
            java.util.List r0 = Yue.C1219.m6468(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m22965(Yue.AbstractC6111 r5, long r6) {
            r4 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Thread "
            r6.append(r7)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r6.append(r7)
            java.lang.String r7 = " MUST hold lock on "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L32:
            Yue.ۥۢۡ۟ۡ r0 = r5.m22929()
            Yue.C3329.m13903(r0)
            Yue.ۥۢ۠ۨۦ r1 = r0.m22946()
            if (r1 != r5) goto L73
            boolean r1 = r0.m22947()
            r2 = 0
            r0.m22958(r2)
            r2 = 0
            r0.m22957(r2)
            java.util.List<Yue.ۥۢۡ۟ۡ> r2 = r4.f22079
            r2.remove(r0)
            r2 = -1
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r3 = 1
            if (r2 == 0) goto L62
            if (r1 != 0) goto L62
            boolean r1 = r0.m22951()
            if (r1 != 0) goto L62
            r0.m22956(r5, r6, r3)
        L62:
            java.util.List r5 = r0.m22948()
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            if (r5 == 0) goto L72
            java.util.List<Yue.ۥۢۡ۟ۡ> r5 = r4.f22080
            r5.add(r0)
        L72:
            return
        L73:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Check failed."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractC6111 m22966() {
            r14 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto Lb
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
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            java.util.List<Yue.ۥۢۡ۟ۡ> r0 = r14.f22080
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L3c
            return r1
        L3c:
            Yue.ۥۢۡ۟ۢ$ۥ r0 = r14.f22075
            long r2 = r0.mo22975()
            java.util.List<Yue.ۥۢۡ۟ۡ> r0 = r14.f22080
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L4e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L80
            java.lang.Object r7 = r0.next()
            Yue.ۥۢۡ۟ۡ r7 = (Yue.C6118) r7
            java.util.List r7 = r7.m22948()
            java.lang.Object r7 = r7.get(r9)
            Yue.ۥۢ۠ۨۦ r7 = (Yue.AbstractC6111) r7
            long r10 = r7.m22928()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L7a
            long r4 = java.lang.Math.min(r10, r4)
            goto L4e
        L7a:
            if (r6 == 0) goto L7e
            r0 = r8
            goto L81
        L7e:
            r6 = r7
            goto L4e
        L80:
            r0 = r9
        L81:
            if (r6 == 0) goto L9d
            r14.m22967(r6)
            if (r0 != 0) goto L95
            boolean r0 = r14.f22077
            if (r0 != 0) goto L9c
            java.util.List<Yue.ۥۢۡ۟ۡ> r0 = r14.f22080
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L9c
        L95:
            Yue.ۥۢۡ۟ۢ$ۥ r0 = r14.f22075
            java.lang.Runnable r1 = r14.f22081
            r0.execute(r1)
        L9c:
            return r6
        L9d:
            boolean r0 = r14.f22077
            if (r0 == 0) goto Lae
            long r6 = r14.f22078
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lad
            Yue.ۥۢۡ۟ۢ$ۥ r0 = r14.f22075
            r0.mo22974(r14)
        Lad:
            return r1
        Lae:
            r14.f22077 = r8
            long r2 = r2 + r4
            r14.f22078 = r2
            Yue.ۥۢۡ۟ۢ$ۥ r0 = r14.f22075     // Catch: java.lang.Throwable -> Lbc java.lang.InterruptedException -> Lbe
            r0.mo22973(r14, r4)     // Catch: java.lang.Throwable -> Lbc java.lang.InterruptedException -> Lbe
        Lb8:
            r14.f22077 = r9
            goto L32
        Lbc:
            r0 = move-exception
            goto Lc2
        Lbe:
            r14.m22968()     // Catch: java.lang.Throwable -> Lbc
            goto Lb8
        Lc2:
            r14.f22077 = r9
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m22967(Yue.AbstractC6111 r3) {
            r2 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L32:
            r0 = -1
            r3.m22931(r0)
            Yue.ۥۢۡ۟ۡ r0 = r3.m22929()
            Yue.C3329.m13903(r0)
            java.util.List r1 = r0.m22948()
            r1.remove(r3)
            java.util.List<Yue.ۥۢۡ۟ۡ> r1 = r2.f22080
            r1.remove(r0)
            r0.m22957(r3)
            java.util.List<Yue.ۥۢۡ۟ۡ> r3 = r2.f22079
            r3.add(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m22968() {
            r3 = this;
            java.util.List<Yue.ۥۢۡ۟ۡ> r0 = r3.f22079
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            r1 = -1
            if (r1 >= r0) goto L19
            java.util.List<Yue.ۥۢۡ۟ۡ> r1 = r3.f22079
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۡ۟ۡ r1 = (Yue.C6118) r1
            r1.m22944()
            int r0 = r0 + (-1)
            goto L8
        L19:
            java.util.List<Yue.ۥۢۡ۟ۡ> r0 = r3.f22080
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r1 >= r0) goto L40
            java.util.List<Yue.ۥۢۡ۟ۡ> r2 = r3.f22080
            java.lang.Object r2 = r2.get(r0)
            Yue.ۥۢۡ۟ۡ r2 = (Yue.C6118) r2
            r2.m22944()
            java.util.List r2 = r2.m22948()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3d
            java.util.List<Yue.ۥۢۡ۟ۡ> r2 = r3.f22080
            r2.remove(r0)
        L3d:
            int r0 = r0 + (-1)
            goto L21
        L40:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Yue.C6122.InterfaceC6123 m22969() {
            r1 = this;
            Yue.ۥۢۡ۟ۢ$ۥ r0 = r1.f22075
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m22970(@Yue.InterfaceC4418 Yue.C6118 r3) {
            r2 = this;
            java.lang.String r0 = "taskQueue"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST hold lock on "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L37:
            Yue.ۥۢ۠ۨۦ r0 = r3.m22946()
            if (r0 != 0) goto L54
            java.util.List r0 = r3.m22948()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4f
            java.util.List<Yue.ۥۢۡ۟ۡ> r0 = r2.f22080
            Yue.C6656.m25555(r0, r3)
            goto L54
        L4f:
            java.util.List<Yue.ۥۢۡ۟ۡ> r0 = r2.f22080
            r0.remove(r3)
        L54:
            boolean r3 = r2.f22077
            if (r3 == 0) goto L5e
            Yue.ۥۢۡ۟ۢ$ۥ r3 = r2.f22075
            r3.mo22974(r2)
            goto L65
        L5e:
            Yue.ۥۢۡ۟ۢ$ۥ r3 = r2.f22075
            java.lang.Runnable r0 = r2.f22081
            r3.execute(r0)
        L65:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C6118 m22971() {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f22076     // Catch: java.lang.Throwable -> L1f
            int r1 = r0 + 1
            r4.f22076 = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            Yue.ۥۢۡ۟ۡ r1 = new Yue.ۥۢۡ۟ۡ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 81
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r4, r0)
            return r1
        L1f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m22972(Yue.AbstractC6111 r6) {
            r5 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST NOT hold lock on "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = r6.m22927()
            r0.setName(r2)
            long r2 = r6.mo8734()     // Catch: java.lang.Throwable -> L53
            monitor-enter(r5)
            r5.m22965(r6, r2)     // Catch: java.lang.Throwable -> L50
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)
            r0.setName(r1)
            return
        L50:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L53:
            r2 = move-exception
            monitor-enter(r5)
            r3 = -1
            r5.m22965(r6, r3)     // Catch: java.lang.Throwable -> L61
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L61
            monitor-exit(r5)
            r0.setName(r1)
            throw r2
        L61:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
