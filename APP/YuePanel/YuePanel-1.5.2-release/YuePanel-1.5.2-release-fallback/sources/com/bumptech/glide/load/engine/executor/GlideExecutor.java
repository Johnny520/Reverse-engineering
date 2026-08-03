package com.bumptech.glide.load.engine.executor;

/* JADX INFO: loaded from: classes.dex */
public final class GlideExecutor implements java.util.concurrent.ExecutorService {
    static final java.lang.String DEFAULT_ANIMATION_EXECUTOR_NAME = "animation";
    static final java.lang.String DEFAULT_DISK_CACHE_EXECUTOR_NAME = "disk-cache";
    static final int DEFAULT_DISK_CACHE_EXECUTOR_THREADS = 1;
    static final java.lang.String DEFAULT_SOURCE_EXECUTOR_NAME = "source";
    private static final java.lang.String DEFAULT_SOURCE_UNLIMITED_EXECUTOR_NAME = "source-unlimited";
    private static final long KEEP_ALIVE_TIME_MS = 0;
    private static final int MAXIMUM_AUTOMATIC_THREAD_COUNT = 4;
    private static final java.lang.String TAG = "GlideExecutor";
    private static volatile int bestThreadCount;
    private final java.util.concurrent.ExecutorService delegate;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        public static final long NO_THREAD_TIMEOUT = 0;
        private int corePoolSize;
        private int maximumPoolSize;
        private java.lang.String name;
        private final boolean preventNetworkOperations;

        @Yue.InterfaceC4410
        private java.util.concurrent.ThreadFactory threadFactory;
        private long threadTimeoutMillis;

        @Yue.InterfaceC4410
        private com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy;

        public Builder(boolean r3) {
                r2 = this;
                r2.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory
                r1 = 0
                r0.<init>(r1)
                r2.threadFactory = r0
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.DEFAULT
                r2.uncaughtThrowableStrategy = r0
                r2.preventNetworkOperations = r3
                return
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor build() {
                r12 = this;
                java.lang.String r0 = r12.name
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L3a
                java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
                int r2 = r12.corePoolSize
                int r3 = r12.maximumPoolSize
                long r4 = r12.threadTimeoutMillis
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.util.concurrent.PriorityBlockingQueue r7 = new java.util.concurrent.PriorityBlockingQueue
                r7.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory r8 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory
                java.util.concurrent.ThreadFactory r1 = r12.threadFactory
                java.lang.String r9 = r12.name
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy r10 = r12.uncaughtThrowableStrategy
                boolean r11 = r12.preventNetworkOperations
                r8.<init>(r1, r9, r10, r11)
                r1 = r0
                r1.<init>(r2, r3, r4, r6, r7, r8)
                long r1 = r12.threadTimeoutMillis
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L34
                r1 = 1
                r0.allowCoreThreadTimeOut(r1)
            L34:
                com.bumptech.glide.load.engine.executor.GlideExecutor r1 = new com.bumptech.glide.load.engine.executor.GlideExecutor
                r1.<init>(r0)
                return r1
            L3a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Name must be non-null and non-empty, but given: "
                r1.append(r2)
                java.lang.String r2 = r12.name
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setName(java.lang.String r1) {
                r0 = this;
                r0.name = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setThreadCount(@Yue.InterfaceC3281(from = 1) int r1) {
                r0 = this;
                r0.corePoolSize = r1
                r0.maximumPoolSize = r1
                return r0
        }

        @java.lang.Deprecated
        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setThreadFactory(@Yue.InterfaceC4410 java.util.concurrent.ThreadFactory r1) {
                r0 = this;
                r0.threadFactory = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setThreadTimeoutMillis(long r1) {
                r0 = this;
                r0.threadTimeoutMillis = r1
                return r0
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setUncaughtThrowableStrategy(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r1) {
                r0 = this;
                r0.uncaughtThrowableStrategy = r1
                return r0
        }
    }

    public static final class DefaultPriorityThreadFactory implements java.util.concurrent.ThreadFactory {
        private static final int DEFAULT_PRIORITY = 9;


        private DefaultPriorityThreadFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ DefaultPriorityThreadFactory(com.bumptech.glide.load.engine.executor.GlideExecutor.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(@Yue.InterfaceC4410 java.lang.Runnable r2) {
                r1 = this;
                com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory$1 r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory$1
                r0.<init>(r1, r2)
                return r0
        }
    }

    public static final class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private final java.util.concurrent.ThreadFactory delegate;
        private final java.lang.String name;
        final boolean preventNetworkOperations;
        private final java.util.concurrent.atomic.AtomicInteger threadNum;
        final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy;


        public DefaultThreadFactory(java.util.concurrent.ThreadFactory r2, java.lang.String r3, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r4, boolean r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.threadNum = r0
                r1.delegate = r2
                r1.name = r3
                r1.uncaughtThrowableStrategy = r4
                r1.preventNetworkOperations = r5
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(@Yue.InterfaceC4410 java.lang.Runnable r3) {
                r2 = this;
                java.util.concurrent.ThreadFactory r0 = r2.delegate
                com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory$1 r1 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory$1
                r1.<init>(r2, r3)
                java.lang.Thread r3 = r0.newThread(r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "glide-"
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                java.lang.String r1 = "-thread-"
                r0.append(r1)
                java.util.concurrent.atomic.AtomicInteger r1 = r2.threadNum
                int r1 = r1.getAndIncrement()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.setName(r0)
                return r3
        }
    }

    public interface UncaughtThrowableStrategy {
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy DEFAULT = null;
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy IGNORE = null;
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy LOG = null;
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy THROW = null;




        static {
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$1 r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$1
                r0.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.IGNORE = r0
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$2 r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$2
                r0.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.LOG = r0
                com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$3 r1 = new com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$3
                r1.<init>()
                com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.THROW = r1
                com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.DEFAULT = r0
                return
        }

        void handle(java.lang.Throwable r1);
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 10
            long r0 = r0.toMillis(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor.KEEP_ALIVE_TIME_MS = r0
            return
    }

    @Yue.InterfaceC6959
    public GlideExecutor(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    public static int calculateAnimationExecutorThreadCount() {
            int r0 = calculateBestThreadCount()
            r1 = 4
            if (r0 < r1) goto L9
            r0 = 2
            goto La
        L9:
            r0 = 1
        La:
            return r0
    }

    public static int calculateBestThreadCount() {
            int r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.bestThreadCount
            if (r0 != 0) goto Lf
            r0 = 4
            int r1 = com.bumptech.glide.load.engine.executor.RuntimeCompat.availableProcessors()
            int r0 = java.lang.Math.min(r0, r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor.bestThreadCount = r0
        Lf:
            int r0 = com.bumptech.glide.load.engine.executor.GlideExecutor.bestThreadCount
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newAnimationBuilder() {
            int r0 = calculateAnimationExecutorThreadCount()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = new com.bumptech.glide.load.engine.executor.GlideExecutor$Builder
            r2 = 1
            r1.<init>(r2)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r1.setThreadCount(r0)
            java.lang.String r1 = "animation"
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setName(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newAnimationExecutor() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newAnimationBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r0.build()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newAnimationExecutor(int r1, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r2) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newAnimationBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setThreadCount(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setUncaughtThrowableStrategy(r2)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newDiskCacheBuilder() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$Builder
            r1 = 1
            r0.<init>(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setThreadCount(r1)
            java.lang.String r1 = "disk-cache"
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setName(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newDiskCacheBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r0.build()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor(int r1, java.lang.String r2, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r3) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newDiskCacheBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setThreadCount(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setName(r2)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setUncaughtThrowableStrategy(r3)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r1) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newDiskCacheBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setUncaughtThrowableStrategy(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newSourceBuilder() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor$Builder
            r1 = 0
            r0.<init>(r1)
            int r1 = calculateBestThreadCount()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setThreadCount(r1)
            java.lang.String r1 = "source"
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = r0.setName(r1)
            return r0
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor() {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newSourceBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r0.build()
            return r0
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor(int r1, java.lang.String r2, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r3) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newSourceBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setThreadCount(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setName(r2)
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r1.setUncaughtThrowableStrategy(r3)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy r1) {
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r0 = newSourceBuilder()
            com.bumptech.glide.load.engine.executor.GlideExecutor$Builder r1 = r0.setUncaughtThrowableStrategy(r1)
            com.bumptech.glide.load.engine.executor.GlideExecutor r1 = r1.build()
            return r1
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newUnlimitedSourceExecutor() {
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = new com.bumptech.glide.load.engine.executor.GlideExecutor
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            long r4 = com.bumptech.glide.load.engine.executor.GlideExecutor.KEEP_ALIVE_TIME_MS
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory r8 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory
            com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory r1 = new com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory
            r2 = 0
            r1.<init>(r2)
            com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy r2 = com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.DEFAULT
            r3 = 0
            java.lang.String r10 = "source-unlimited"
            r8.<init>(r1, r10, r2, r3)
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = r9
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r0.<init>(r9)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, @Yue.InterfaceC4410 java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Yue.InterfaceC4410 java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    @Yue.InterfaceC4410
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(@Yue.InterfaceC4410 java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @Yue.InterfaceC4410
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(@Yue.InterfaceC4410 java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, @Yue.InterfaceC4410 java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @Yue.InterfaceC4410
    public <T> T invokeAny(@Yue.InterfaceC4410 java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@Yue.InterfaceC4410 java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, @Yue.InterfaceC4410 java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    @Yue.InterfaceC4410
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    @Yue.InterfaceC4410
    public java.util.concurrent.Future<?> submit(@Yue.InterfaceC4410 java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    @Yue.InterfaceC4410
    public <T> java.util.concurrent.Future<T> submit(@Yue.InterfaceC4410 java.lang.Runnable r2, T r3) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(@Yue.InterfaceC4410 java.util.concurrent.Callable<T> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.String r0 = r0.toString()
            return r0
    }
}
