package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5326 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ, reason: contains not printable characters */
    public static class ThreadFactoryC5327 implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.String f19909;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f19910;

        /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ$ۥ, reason: contains not printable characters */
        public static class C5328 extends java.lang.Thread {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final int f19911;

            public C5328(java.lang.Runnable r1, java.lang.String r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.f19911 = r3
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                    r1 = this;
                    int r0 = r1.f19911
                    android.os.Process.setThreadPriority(r0)
                    super.run()
                    return
            }
        }

        public ThreadFactoryC5327(@Yue.InterfaceC4410 java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f19909 = r1
                r0.f19910 = r2
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                Yue.ۥۡۦۥ۟$ۥ$ۥ r0 = new Yue.ۥۡۦۥ۟$ۥ$ۥ
                java.lang.String r1 = r3.f19909
                int r2 = r3.f19910
                r0.<init>(r4, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ۟, reason: contains not printable characters */
    public static class ExecutorC5329 implements java.util.concurrent.Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.os.Handler f19912;

        public ExecutorC5329(@Yue.InterfaceC4410 android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = Yue.C4868.m19181(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.f19912 = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@Yue.InterfaceC4410 java.lang.Runnable r3) {
                r2 = this;
                android.os.Handler r0 = r2.f19912
                java.lang.Object r3 = Yue.C4868.m19181(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto Lf
                return
            Lf:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.f19912
                r0.append(r1)
                java.lang.String r1 = " is shutting down"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ۟۟, reason: contains not printable characters */
    public static class RunnableC5330<T> implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public java.util.concurrent.Callable<T> f19913;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public Yue.InterfaceC1535<T> f19914;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public android.os.Handler f19915;

        /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ۟۟$ۥ, reason: contains not printable characters */
        public class RunnableC5331 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC1535 f19916;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ java.lang.Object f19917;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C5326.RunnableC5330 f19918;

            public RunnableC5331(Yue.C5326.RunnableC5330 r1, Yue.InterfaceC1535 r2, java.lang.Object r3) {
                    r0 = this;
                    r0.f19918 = r1
                    r0.f19916 = r2
                    r0.f19917 = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    Yue.ۥ۟ۧ۠ۧ r0 = r2.f19916
                    java.lang.Object r1 = r2.f19917
                    r0.accept(r1)
                    return
            }
        }

        public RunnableC5330(@Yue.InterfaceC4410 android.os.Handler r1, @Yue.InterfaceC4410 java.util.concurrent.Callable<T> r2, @Yue.InterfaceC4410 Yue.InterfaceC1535<T> r3) {
                r0 = this;
                r0.<init>()
                r0.f19913 = r2
                r0.f19914 = r3
                r0.f19915 = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.util.concurrent.Callable<T> r0 = r4.f19913     // Catch: java.lang.Exception -> L7
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
                goto L8
            L7:
                r0 = 0
            L8:
                Yue.ۥ۟ۧ۠ۧ<T> r1 = r4.f19914
                android.os.Handler r2 = r4.f19915
                Yue.ۥۡۦۥ۟$ۥ۟۟$ۥ r3 = new Yue.ۥۡۦۥ۟$ۥ۟۟$ۥ
                r3.<init>(r4, r1, r0)
                r2.post(r3)
                return
        }
    }

    public C5326() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.concurrent.ThreadPoolExecutor m20161(@Yue.InterfaceC4410 java.lang.String r8, int r9, @Yue.InterfaceC3281(from = 0) int r10) {
            Yue.ۥۡۦۥ۟$ۥ r7 = new Yue.ۥۡۦۥ۟$ۥ
            r7.<init>(r8, r9)
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            long r3 = (long) r10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r9 = 1
            r8.allowCoreThreadTimeOut(r9)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.concurrent.Executor m20162(@Yue.InterfaceC4410 android.os.Handler r1) {
            Yue.ۥۡۦۥ۟$ۥ۟ r0 = new Yue.ۥۡۦۥ۟$ۥ۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T> void m20163(@Yue.InterfaceC4410 java.util.concurrent.Executor r2, @Yue.InterfaceC4410 java.util.concurrent.Callable<T> r3, @Yue.InterfaceC4410 Yue.InterfaceC1535<T> r4) {
            android.os.Handler r0 = Yue.C0922.m5269()
            Yue.ۥۡۦۥ۟$ۥ۟۟ r1 = new Yue.ۥۡۦۥ۟$ۥ۟۟
            r1.<init>(r0, r3, r4)
            r2.execute(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T> T m20164(@Yue.InterfaceC4410 java.util.concurrent.ExecutorService r1, @Yue.InterfaceC4410 java.util.concurrent.Callable<T> r2, @Yue.InterfaceC3281(from = 0) int r3) throws java.lang.InterruptedException {
            java.util.concurrent.Future r1 = r1.submit(r2)
            long r2 = (long) r3
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Lc java.util.concurrent.ExecutionException -> Le java.util.concurrent.TimeoutException -> L10
            java.lang.Object r1 = r1.get(r2, r0)     // Catch: java.lang.InterruptedException -> Lc java.util.concurrent.ExecutionException -> Le java.util.concurrent.TimeoutException -> L10
            return r1
        Lc:
            r1 = move-exception
            goto L18
        Le:
            r1 = move-exception
            goto L19
        L10:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            java.lang.String r2 = "timeout"
            r1.<init>(r2)
            throw r1
        L18:
            throw r1
        L19:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }
}
