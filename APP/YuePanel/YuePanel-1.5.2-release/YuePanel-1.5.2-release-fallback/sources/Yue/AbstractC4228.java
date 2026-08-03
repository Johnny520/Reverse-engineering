package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4228<Params, Progress, Result> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final java.lang.String f13090 = "AsyncTask";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f13091 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f13092 = 128;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f13093 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.util.concurrent.ThreadFactory f13094 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.util.concurrent.BlockingQueue<java.lang.Runnable> f13095 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final java.util.concurrent.Executor f13096 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f13097 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f13098 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static Yue.AbstractC4228.HandlerC4234 f13099;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile java.util.concurrent.Executor f13100;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.AbstractC4228.AbstractCallableC4236<Params, Result> f13101;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.util.concurrent.FutureTask<Result> f13102;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public volatile Yue.AbstractC4228.EnumC4235 f13103;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f13104;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f13105;

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ, reason: contains not printable characters */
    public static class ThreadFactoryC4229 implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.concurrent.atomic.AtomicInteger f13106;

        public ThreadFactoryC4229() {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r1 = 1
                r0.<init>(r1)
                r2.f13106 = r0
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Thread r0 = new java.lang.Thread
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "ModernAsyncTask #"
                r1.append(r2)
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f13106
                int r2 = r2.getAndIncrement()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r4, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟, reason: contains not printable characters */
    public class C4230 extends Yue.AbstractC4228.AbstractCallableC4236<Params, Result> {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC4228 f13107;

        public C4230(Yue.AbstractC4228 r1) {
                r0 = this;
                r0.f13107 = r1
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws java.lang.Exception {
                r4 = this;
                Yue.ۥۡۡۢ۠ r0 = r4.f13107
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f13105
                r1 = 1
                r0.set(r1)
                r0 = 10
                r2 = 0
                android.os.Process.setThreadPriority(r0)     // Catch: java.lang.Throwable -> L1f
                Yue.ۥۡۡۢ۠ r0 = r4.f13107     // Catch: java.lang.Throwable -> L1f
                Params[] r3 = r4.f13116     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r2 = r0.mo4141(r3)     // Catch: java.lang.Throwable -> L1f
                android.os.Binder.flushPendingCommands()     // Catch: java.lang.Throwable -> L1f
                Yue.ۥۡۡۢ۠ r0 = r4.f13107
                r0.m16523(r2)
                return r2
            L1f:
                r0 = move-exception
                Yue.ۥۡۡۢ۠ r3 = r4.f13107     // Catch: java.lang.Throwable -> L28
                java.util.concurrent.atomic.AtomicBoolean r3 = r3.f13104     // Catch: java.lang.Throwable -> L28
                r3.set(r1)     // Catch: java.lang.Throwable -> L28
                throw r0     // Catch: java.lang.Throwable -> L28
            L28:
                r0 = move-exception
                Yue.ۥۡۡۢ۠ r1 = r4.f13107
                r1.m16523(r2)
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟, reason: contains not printable characters */
    public class C4231 extends java.util.concurrent.FutureTask<Result> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC4228 f13108;

        public C4231(Yue.AbstractC4228 r1, java.util.concurrent.Callable r2) {
                r0 = this;
                r0.f13108 = r1
                r0.<init>(r2)
                return
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
                r3 = this;
                java.lang.String r0 = "An error occurred while executing doInBackground()"
                java.lang.Object r1 = r3.get()     // Catch: java.lang.Throwable -> Lc java.util.concurrent.ExecutionException -> Le java.lang.InterruptedException -> L10 java.util.concurrent.CancellationException -> L18
                Yue.ۥۡۡۢ۠ r2 = r3.f13108     // Catch: java.lang.Throwable -> Lc java.util.concurrent.ExecutionException -> Le java.lang.InterruptedException -> L10 java.util.concurrent.CancellationException -> L18
                r2.m16524(r1)     // Catch: java.lang.Throwable -> Lc java.util.concurrent.ExecutionException -> Le java.lang.InterruptedException -> L10 java.util.concurrent.CancellationException -> L18
                goto L2e
            Lc:
                r1 = move-exception
                goto L12
            Le:
                r1 = move-exception
                goto L1f
            L10:
                r0 = move-exception
                goto L29
            L12:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r2.<init>(r0, r1)
                throw r2
            L18:
                Yue.ۥۡۡۢ۠ r0 = r3.f13108
                r1 = 0
                r0.m16524(r1)
                goto L2e
            L1f:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.Throwable r1 = r1.getCause()
                r2.<init>(r0, r1)
                throw r2
            L29:
                java.lang.String r1 = "AsyncTask"
                android.util.Log.w(r1, r0)
            L2e:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ class C4232 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f13109 = null;

        static {
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ[] r0 = Yue.AbstractC4228.EnumC4235.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.AbstractC4228.C4232.f13109 = r0
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r1 = Yue.AbstractC4228.EnumC4235.f13113     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = Yue.AbstractC4228.C4232.f13109     // Catch: java.lang.NoSuchFieldError -> L1d
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r1 = Yue.AbstractC4228.EnumC4235.f13114     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C4233<Data> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.AbstractC4228 f13110;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Data[] f13111;

        public C4233(Yue.AbstractC4228 r1, Data... r2) {
                r0 = this;
                r0.<init>()
                r0.f13110 = r1
                r0.f13111 = r2
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class HandlerC4234 extends android.os.Handler {
        public HandlerC4234() {
                r1 = this;
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                java.lang.Object r0 = r3.obj
                Yue.ۥۡۡۢ۠$ۥ۟۟۟۟ r0 = (Yue.AbstractC4228.C4233) r0
                int r3 = r3.what
                r1 = 1
                if (r3 == r1) goto L15
                r1 = 2
                if (r3 == r1) goto Ld
                goto L1f
            Ld:
                Yue.ۥۡۡۢ۠ r3 = r0.f13110
                Data[] r0 = r0.f13111
                r3.m16522(r0)
                goto L1f
            L15:
                Yue.ۥۡۡۢ۠ r3 = r0.f13110
                Data[] r0 = r0.f13111
                r1 = 0
                r0 = r0[r1]
                r3.m16515(r0)
            L1f:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public enum EnumC4235 extends java.lang.Enum<Yue.AbstractC4228.EnumC4235> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.AbstractC4228.EnumC4235 f13112 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final Yue.AbstractC4228.EnumC4235 f13113 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final Yue.AbstractC4228.EnumC4235 f13114 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.AbstractC4228.EnumC4235[] f13115 = null;

        static {
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r0 = new Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ
                java.lang.String r1 = "PENDING"
                r2 = 0
                r0.<init>(r1, r2)
                Yue.AbstractC4228.EnumC4235.f13112 = r0
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r1 = new Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ
                java.lang.String r2 = "RUNNING"
                r3 = 1
                r1.<init>(r2, r3)
                Yue.AbstractC4228.EnumC4235.f13113 = r1
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r2 = new Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ
                java.lang.String r3 = "FINISHED"
                r4 = 2
                r2.<init>(r3, r4)
                Yue.AbstractC4228.EnumC4235.f13114 = r2
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ[] r0 = new Yue.AbstractC4228.EnumC4235[]{r0, r1, r2}
                Yue.AbstractC4228.EnumC4235.f13115 = r0
                return
        }

        EnumC4235(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static Yue.AbstractC4228.EnumC4235 valueOf(java.lang.String r1) {
                java.lang.Class<Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ> r0 = Yue.AbstractC4228.EnumC4235.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r1 = (Yue.AbstractC4228.EnumC4235) r1
                return r1
        }

        public static Yue.AbstractC4228.EnumC4235[] values() {
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ[] r0 = Yue.AbstractC4228.EnumC4235.f13115
                java.lang.Object r0 = r0.clone()
                Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ[] r0 = (Yue.AbstractC4228.EnumC4235[]) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۢ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static abstract class AbstractCallableC4236<Params, Result> implements java.util.concurrent.Callable<Result> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Params[] f13116;

        public AbstractCallableC4236() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۡۡۢ۠$ۥ r7 = new Yue.ۥۡۡۢ۠$ۥ
            r7.<init>()
            Yue.AbstractC4228.f13094 = r7
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r0 = 10
            r6.<init>(r0)
            Yue.AbstractC4228.f13095 = r6
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            r3 = 1
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 5
            r2 = 128(0x80, float:1.8E-43)
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            Yue.AbstractC4228.f13096 = r8
            Yue.AbstractC4228.f13100 = r8
            return
    }

    public AbstractC4228() {
            r2 = this;
            r2.<init>()
            Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r0 = Yue.AbstractC4228.EnumC4235.f13112
            r2.f13103 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f13104 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f13105 = r0
            Yue.ۥۡۡۢ۠$ۥ۟ r0 = new Yue.ۥۡۡۢ۠$ۥ۟
            r0.<init>(r2)
            r2.f13101 = r0
            Yue.ۥۡۡۢ۠$ۥ۟۟ r1 = new Yue.ۥۡۡۢ۠$ۥ۟۟
            r1.<init>(r2, r0)
            r2.f13102 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m16509(java.lang.Runnable r1) {
            java.util.concurrent.Executor r0 = Yue.AbstractC4228.f13100
            r0.execute(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static android.os.Handler m16510() {
            java.lang.Class<Yue.ۥۡۡۢ۠> r0 = Yue.AbstractC4228.class
            monitor-enter(r0)
            Yue.ۥۡۡۢ۠$ۥ۟۟۟۠ r1 = Yue.AbstractC4228.f13099     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            Yue.ۥۡۡۢ۠$ۥ۟۟۟۠ r1 = new Yue.ۥۡۡۢ۠$ۥ۟۟۟۠     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            Yue.AbstractC4228.f13099 = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            Yue.ۥۡۡۢ۠$ۥ۟۟۟۠ r1 = Yue.AbstractC4228.f13099     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m16511(java.util.concurrent.Executor r0) {
            Yue.AbstractC4228.f13100 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m16512(boolean r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f13104
            r1 = 1
            r0.set(r1)
            java.util.concurrent.FutureTask<Result> r0 = r2.f13102
            boolean r3 = r0.cancel(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract Result mo4141(Params... r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.AbstractC4228<Params, Progress, Result> m16513(Params... r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = Yue.AbstractC4228.f13100
            Yue.ۥۡۡۢ۠ r2 = r1.m16514(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.AbstractC4228<Params, Progress, Result> m16514(java.util.concurrent.Executor r3, Params... r4) {
            r2 = this;
            Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r0 = r2.f13103
            Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r1 = Yue.AbstractC4228.EnumC4235.f13112
            if (r0 == r1) goto L2e
            int[] r3 = Yue.AbstractC4228.C4232.f13109
            Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r4 = r2.f13103
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L26
            r4 = 2
            if (r3 == r4) goto L1e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "We should never reach this state"
            r3.<init>(r4)
            throw r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot execute task: the task has already been executed (a task can be executed only once)"
            r3.<init>(r4)
            throw r3
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot execute task: the task is already running."
            r3.<init>(r4)
            throw r3
        L2e:
            Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r0 = Yue.AbstractC4228.EnumC4235.f13113
            r2.f13103 = r0
            r2.m16521()
            Yue.ۥۡۡۢ۠$ۥ۟۟۟ۢ<Params, Result> r0 = r2.f13101
            r0.f13116 = r4
            java.util.concurrent.FutureTask<Result> r4 = r2.f13102
            r3.execute(r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m16515(Result r2) {
            r1 = this;
            boolean r0 = r1.m16519()
            if (r0 == 0) goto La
            r1.mo4142(r2)
            goto Ld
        La:
            r1.mo4143(r2)
        Ld:
            Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r2 = Yue.AbstractC4228.EnumC4235.f13114
            r1.f13103 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Result m16516() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.FutureTask<Result> r0 = r1.f13102
            java.lang.Object r0 = r0.get()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Result m16517(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.FutureTask<Result> r0 = r1.f13102
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.AbstractC4228.EnumC4235 m16518() {
            r1 = this;
            Yue.ۥۡۡۢ۠$ۥ۟۟۟ۡ r0 = r1.f13103
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m16519() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f13104
            boolean r0 = r0.get()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m16520() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo4142(Result r1) {
            r0 = this;
            r0.m16520()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo4143(Result r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m16521() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m16522(Progress... r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Result m16523(Result r4) {
            r3 = this;
            android.os.Handler r0 = m16510()
            Yue.ۥۡۡۢ۠$ۥ۟۟۟۟ r1 = new Yue.ۥۡۡۢ۠$ۥ۟۟۟۟
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            r1.<init>(r3, r2)
            r2 = 1
            android.os.Message r0 = r0.obtainMessage(r2, r1)
            r0.sendToTarget()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m16524(Result r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f13105
            boolean r0 = r0.get()
            if (r0 != 0) goto Lb
            r1.m16523(r2)
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m16525(Progress... r3) {
            r2 = this;
            boolean r0 = r2.m16519()
            if (r0 != 0) goto L17
            android.os.Handler r0 = m16510()
            Yue.ۥۡۡۢ۠$ۥ۟۟۟۟ r1 = new Yue.ۥۡۡۢ۠$ۥ۟۟۟۟
            r1.<init>(r2, r3)
            r3 = 2
            android.os.Message r3 = r0.obtainMessage(r3, r1)
            r3.sendToTarget()
        L17:
            return
    }
}
