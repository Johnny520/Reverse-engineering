package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public class Engine implements com.bumptech.glide.load.engine.EngineJobListener, com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener, com.bumptech.glide.load.engine.EngineResource.ResourceListener {
    private static final int JOB_POOL_SIZE = 150;
    private static final java.lang.String TAG = "Engine";
    private static final boolean VERBOSE_IS_LOGGABLE = false;
    private final com.bumptech.glide.load.engine.ActiveResources activeResources;
    private final com.bumptech.glide.load.engine.cache.MemoryCache cache;
    private final com.bumptech.glide.load.engine.Engine.DecodeJobFactory decodeJobFactory;
    private final com.bumptech.glide.load.engine.Engine.LazyDiskCacheProvider diskCacheProvider;
    private final com.bumptech.glide.load.engine.Engine.EngineJobFactory engineJobFactory;
    private final com.bumptech.glide.load.engine.Jobs jobs;
    private final com.bumptech.glide.load.engine.EngineKeyFactory keyFactory;
    private final com.bumptech.glide.load.engine.ResourceRecycler resourceRecycler;

    @Yue.InterfaceC6959
    public static class DecodeJobFactory {
        private int creationOrder;
        final com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider diskCacheProvider;
        final Yue.C4820.InterfaceC4821<com.bumptech.glide.load.engine.DecodeJob<?>> pool;


        public DecodeJobFactory(com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider r3) {
                r2 = this;
                r2.<init>()
                com.bumptech.glide.load.engine.Engine$DecodeJobFactory$1 r0 = new com.bumptech.glide.load.engine.Engine$DecodeJobFactory$1
                r0.<init>(r2)
                r1 = 150(0x96, float:2.1E-43)
                Yue.ۥۡۤۤ۠$ۥ r0 = com.bumptech.glide.util.pool.FactoryPools.threadSafe(r1, r0)
                r2.pool = r0
                r2.diskCacheProvider = r3
                return
        }

        public <R> com.bumptech.glide.load.engine.DecodeJob<R> build(com.bumptech.glide.GlideContext r20, java.lang.Object r21, com.bumptech.glide.load.engine.EngineKey r22, com.bumptech.glide.load.Key r23, int r24, int r25, java.lang.Class<?> r26, java.lang.Class<R> r27, com.bumptech.glide.Priority r28, com.bumptech.glide.load.engine.DiskCacheStrategy r29, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r30, boolean r31, boolean r32, boolean r33, com.bumptech.glide.load.Options r34, com.bumptech.glide.load.engine.DecodeJob.Callback<R> r35) {
                r19 = this;
                r0 = r19
                r2 = r20
                r3 = r21
                r4 = r22
                r5 = r23
                r6 = r24
                r7 = r25
                r8 = r26
                r9 = r27
                r10 = r28
                r11 = r29
                r12 = r30
                r13 = r31
                r14 = r32
                r15 = r33
                r16 = r34
                r17 = r35
                Yue.ۥۡۤۤ۠$ۥ<com.bumptech.glide.load.engine.DecodeJob<?>> r1 = r0.pool
                java.lang.Object r1 = r1.acquire()
                com.bumptech.glide.load.engine.DecodeJob r1 = (com.bumptech.glide.load.engine.DecodeJob) r1
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                com.bumptech.glide.load.engine.DecodeJob r1 = (com.bumptech.glide.load.engine.DecodeJob) r1
                r20 = r1
                int r1 = r0.creationOrder
                r18 = r1
                int r1 = r1 + 1
                r0.creationOrder = r1
                r1 = r20
                com.bumptech.glide.load.engine.DecodeJob r1 = r1.init(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r1
        }
    }

    @Yue.InterfaceC6959
    public static class EngineJobFactory {
        final com.bumptech.glide.load.engine.executor.GlideExecutor animationExecutor;
        final com.bumptech.glide.load.engine.executor.GlideExecutor diskCacheExecutor;
        final com.bumptech.glide.load.engine.EngineJobListener engineJobListener;
        final Yue.C4820.InterfaceC4821<com.bumptech.glide.load.engine.EngineJob<?>> pool;
        final com.bumptech.glide.load.engine.EngineResource.ResourceListener resourceListener;
        final com.bumptech.glide.load.engine.executor.GlideExecutor sourceExecutor;
        final com.bumptech.glide.load.engine.executor.GlideExecutor sourceUnlimitedExecutor;


        public EngineJobFactory(com.bumptech.glide.load.engine.executor.GlideExecutor r3, com.bumptech.glide.load.engine.executor.GlideExecutor r4, com.bumptech.glide.load.engine.executor.GlideExecutor r5, com.bumptech.glide.load.engine.executor.GlideExecutor r6, com.bumptech.glide.load.engine.EngineJobListener r7, com.bumptech.glide.load.engine.EngineResource.ResourceListener r8) {
                r2 = this;
                r2.<init>()
                com.bumptech.glide.load.engine.Engine$EngineJobFactory$1 r0 = new com.bumptech.glide.load.engine.Engine$EngineJobFactory$1
                r0.<init>(r2)
                r1 = 150(0x96, float:2.1E-43)
                Yue.ۥۡۤۤ۠$ۥ r0 = com.bumptech.glide.util.pool.FactoryPools.threadSafe(r1, r0)
                r2.pool = r0
                r2.diskCacheExecutor = r3
                r2.sourceExecutor = r4
                r2.sourceUnlimitedExecutor = r5
                r2.animationExecutor = r6
                r2.engineJobListener = r7
                r2.resourceListener = r8
                return
        }

        public <R> com.bumptech.glide.load.engine.EngineJob<R> build(com.bumptech.glide.load.Key r8, boolean r9, boolean r10, boolean r11, boolean r12) {
                r7 = this;
                Yue.ۥۡۤۤ۠$ۥ<com.bumptech.glide.load.engine.EngineJob<?>> r0 = r7.pool
                java.lang.Object r0 = r0.acquire()
                com.bumptech.glide.load.engine.EngineJob r0 = (com.bumptech.glide.load.engine.EngineJob) r0
                java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r0)
                r1 = r0
                com.bumptech.glide.load.engine.EngineJob r1 = (com.bumptech.glide.load.engine.EngineJob) r1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                com.bumptech.glide.load.engine.EngineJob r8 = r1.init(r2, r3, r4, r5, r6)
                return r8
        }

        @Yue.InterfaceC6959
        public void shutdown() {
                r1 = this;
                com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.diskCacheExecutor
                com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r0)
                com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.sourceExecutor
                com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r0)
                com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.sourceUnlimitedExecutor
                com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r0)
                com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.animationExecutor
                com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r0)
                return
        }
    }

    public static class LazyDiskCacheProvider implements com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider {
        private volatile com.bumptech.glide.load.engine.cache.DiskCache diskCache;
        private final com.bumptech.glide.load.engine.cache.DiskCache.Factory factory;

        public LazyDiskCacheProvider(com.bumptech.glide.load.engine.cache.DiskCache.Factory r1) {
                r0 = this;
                r0.<init>()
                r0.factory = r1
                return
        }

        @Yue.InterfaceC6959
        public synchronized void clearDiskCacheIfCreated() {
                r1 = this;
                monitor-enter(r1)
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache     // Catch: java.lang.Throwable -> Le
                if (r0 != 0) goto L7
                monitor-exit(r1)
                return
            L7:
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache     // Catch: java.lang.Throwable -> Le
                r0.clear()     // Catch: java.lang.Throwable -> Le
                monitor-exit(r1)
                return
            Le:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
                throw r0
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.DiskCacheProvider
        public com.bumptech.glide.load.engine.cache.DiskCache getDiskCache() {
                r1 = this;
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache
                if (r0 != 0) goto L23
                monitor-enter(r1)
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L14
                com.bumptech.glide.load.engine.cache.DiskCache$Factory r0 = r1.factory     // Catch: java.lang.Throwable -> L12
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r0.build()     // Catch: java.lang.Throwable -> L12
                r1.diskCache = r0     // Catch: java.lang.Throwable -> L12
                goto L14
            L12:
                r0 = move-exception
                goto L21
            L14:
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache     // Catch: java.lang.Throwable -> L12
                if (r0 != 0) goto L1f
                com.bumptech.glide.load.engine.cache.DiskCacheAdapter r0 = new com.bumptech.glide.load.engine.cache.DiskCacheAdapter     // Catch: java.lang.Throwable -> L12
                r0.<init>()     // Catch: java.lang.Throwable -> L12
                r1.diskCache = r0     // Catch: java.lang.Throwable -> L12
            L1f:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                goto L23
            L21:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                throw r0
            L23:
                com.bumptech.glide.load.engine.cache.DiskCache r0 = r1.diskCache
                return r0
        }
    }

    public class LoadStatus {
        private final com.bumptech.glide.request.ResourceCallback cb;
        private final com.bumptech.glide.load.engine.EngineJob<?> engineJob;
        final /* synthetic */ com.bumptech.glide.load.engine.Engine this$0;

        public LoadStatus(com.bumptech.glide.load.engine.Engine r1, com.bumptech.glide.request.ResourceCallback r2, com.bumptech.glide.load.engine.EngineJob<?> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.cb = r2
                r0.engineJob = r3
                return
        }

        public void cancel() {
                r3 = this;
                com.bumptech.glide.load.engine.Engine r0 = r3.this$0
                monitor-enter(r0)
                com.bumptech.glide.load.engine.EngineJob<?> r1 = r3.engineJob     // Catch: java.lang.Throwable -> Lc
                com.bumptech.glide.request.ResourceCallback r2 = r3.cb     // Catch: java.lang.Throwable -> Lc
                r1.removeCallback(r2)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                throw r1
        }
    }

    static {
            java.lang.String r0 = "Engine"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE = r0
            return
    }

    @Yue.InterfaceC6959
    public Engine(com.bumptech.glide.load.engine.cache.MemoryCache r12, com.bumptech.glide.load.engine.cache.DiskCache.Factory r13, com.bumptech.glide.load.engine.executor.GlideExecutor r14, com.bumptech.glide.load.engine.executor.GlideExecutor r15, com.bumptech.glide.load.engine.executor.GlideExecutor r16, com.bumptech.glide.load.engine.executor.GlideExecutor r17, com.bumptech.glide.load.engine.Jobs r18, com.bumptech.glide.load.engine.EngineKeyFactory r19, com.bumptech.glide.load.engine.ActiveResources r20, com.bumptech.glide.load.engine.Engine.EngineJobFactory r21, com.bumptech.glide.load.engine.Engine.DecodeJobFactory r22, com.bumptech.glide.load.engine.ResourceRecycler r23, boolean r24) {
            r11 = this;
            r7 = r11
            r8 = r12
            r11.<init>()
            r7.cache = r8
            com.bumptech.glide.load.engine.Engine$LazyDiskCacheProvider r9 = new com.bumptech.glide.load.engine.Engine$LazyDiskCacheProvider
            r0 = r13
            r9.<init>(r13)
            r7.diskCacheProvider = r9
            if (r20 != 0) goto L19
            com.bumptech.glide.load.engine.ActiveResources r0 = new com.bumptech.glide.load.engine.ActiveResources
            r1 = r24
            r0.<init>(r1)
            goto L1b
        L19:
            r0 = r20
        L1b:
            r7.activeResources = r0
            r0.setListener(r11)
            if (r19 != 0) goto L28
            com.bumptech.glide.load.engine.EngineKeyFactory r0 = new com.bumptech.glide.load.engine.EngineKeyFactory
            r0.<init>()
            goto L2a
        L28:
            r0 = r19
        L2a:
            r7.keyFactory = r0
            if (r18 != 0) goto L34
            com.bumptech.glide.load.engine.Jobs r0 = new com.bumptech.glide.load.engine.Jobs
            r0.<init>()
            goto L36
        L34:
            r0 = r18
        L36:
            r7.jobs = r0
            if (r21 != 0) goto L49
            com.bumptech.glide.load.engine.Engine$EngineJobFactory r10 = new com.bumptech.glide.load.engine.Engine$EngineJobFactory
            r0 = r10
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r11
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L4b
        L49:
            r10 = r21
        L4b:
            r7.engineJobFactory = r10
            if (r22 != 0) goto L55
            com.bumptech.glide.load.engine.Engine$DecodeJobFactory r0 = new com.bumptech.glide.load.engine.Engine$DecodeJobFactory
            r0.<init>(r9)
            goto L57
        L55:
            r0 = r22
        L57:
            r7.decodeJobFactory = r0
            if (r23 != 0) goto L61
            com.bumptech.glide.load.engine.ResourceRecycler r0 = new com.bumptech.glide.load.engine.ResourceRecycler
            r0.<init>()
            goto L63
        L61:
            r0 = r23
        L63:
            r7.resourceRecycler = r0
            r12.setResourceRemovedListener(r11)
            return
    }

    public Engine(com.bumptech.glide.load.engine.cache.MemoryCache r15, com.bumptech.glide.load.engine.cache.DiskCache.Factory r16, com.bumptech.glide.load.engine.executor.GlideExecutor r17, com.bumptech.glide.load.engine.executor.GlideExecutor r18, com.bumptech.glide.load.engine.executor.GlideExecutor r19, com.bumptech.glide.load.engine.executor.GlideExecutor r20, boolean r21) {
            r14 = this;
            r11 = 0
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r13 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    private com.bumptech.glide.load.engine.EngineResource<?> getEngineResourceFromCache(com.bumptech.glide.load.Key r8) {
            r7 = this;
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r7.cache
            com.bumptech.glide.load.engine.Resource r2 = r0.remove(r8)
            if (r2 != 0) goto La
            r8 = 0
            goto L1d
        La:
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.EngineResource
            if (r0 == 0) goto L12
            r8 = r2
            com.bumptech.glide.load.engine.EngineResource r8 = (com.bumptech.glide.load.engine.EngineResource) r8
            goto L1d
        L12:
            com.bumptech.glide.load.engine.EngineResource r0 = new com.bumptech.glide.load.engine.EngineResource
            r3 = 1
            r4 = 1
            r1 = r0
            r5 = r8
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r0
        L1d:
            return r8
    }

    @Yue.InterfaceC4544
    private com.bumptech.glide.load.engine.EngineResource<?> loadFromActiveResources(com.bumptech.glide.load.Key r2) {
            r1 = this;
            com.bumptech.glide.load.engine.ActiveResources r0 = r1.activeResources
            com.bumptech.glide.load.engine.EngineResource r2 = r0.get(r2)
            if (r2 == 0) goto Lb
            r2.acquire()
        Lb:
            return r2
    }

    private com.bumptech.glide.load.engine.EngineResource<?> loadFromCache(com.bumptech.glide.load.Key r3) {
            r2 = this;
            com.bumptech.glide.load.engine.EngineResource r0 = r2.getEngineResourceFromCache(r3)
            if (r0 == 0) goto Le
            r0.acquire()
            com.bumptech.glide.load.engine.ActiveResources r1 = r2.activeResources
            r1.activate(r3, r0)
        Le:
            return r0
    }

    @Yue.InterfaceC4544
    private com.bumptech.glide.load.engine.EngineResource<?> loadFromMemory(com.bumptech.glide.load.engine.EngineKey r2, boolean r3, long r4) {
            r1 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            com.bumptech.glide.load.engine.EngineResource r3 = r1.loadFromActiveResources(r2)
            if (r3 == 0) goto L14
            boolean r0 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r0 == 0) goto L13
            java.lang.String r0 = "Loaded resource from active resources"
            logWithTimeAndKey(r0, r4, r2)
        L13:
            return r3
        L14:
            com.bumptech.glide.load.engine.EngineResource r3 = r1.loadFromCache(r2)
            if (r3 == 0) goto L24
            boolean r0 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r0 == 0) goto L23
            java.lang.String r0 = "Loaded resource from cache"
            logWithTimeAndKey(r0, r4, r2)
        L23:
            return r3
        L24:
            return r0
    }

    private static void logWithTimeAndKey(java.lang.String r1, long r2, com.bumptech.glide.load.Key r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r2)
            r0.append(r1)
            java.lang.String r1 = "ms, key: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "Engine"
            android.util.Log.v(r2, r1)
            return
    }

    private <R> com.bumptech.glide.load.engine.Engine.LoadStatus waitForExistingOrStartNewJob(com.bumptech.glide.GlideContext r21, java.lang.Object r22, com.bumptech.glide.load.Key r23, int r24, int r25, java.lang.Class<?> r26, java.lang.Class<R> r27, com.bumptech.glide.Priority r28, com.bumptech.glide.load.engine.DiskCacheStrategy r29, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r30, boolean r31, boolean r32, com.bumptech.glide.load.Options r33, boolean r34, boolean r35, boolean r36, boolean r37, com.bumptech.glide.request.ResourceCallback r38, java.util.concurrent.Executor r39, com.bumptech.glide.load.engine.EngineKey r40, long r41) {
            r20 = this;
            r0 = r20
            r1 = r38
            r2 = r39
            r15 = r40
            r13 = r41
            com.bumptech.glide.load.engine.Jobs r3 = r0.jobs
            r12 = r37
            com.bumptech.glide.load.engine.EngineJob r3 = r3.get(r15, r12)
            if (r3 == 0) goto L26
            r3.addCallback(r1, r2)
            boolean r2 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r2 == 0) goto L20
            java.lang.String r2 = "Added to existing load"
            logWithTimeAndKey(r2, r13, r15)
        L20:
            com.bumptech.glide.load.engine.Engine$LoadStatus r2 = new com.bumptech.glide.load.engine.Engine$LoadStatus
            r2.<init>(r0, r1, r3)
            return r2
        L26:
            com.bumptech.glide.load.engine.Engine$EngineJobFactory r3 = r0.engineJobFactory
            r4 = r40
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            com.bumptech.glide.load.engine.EngineJob r11 = r3.build(r4, r5, r6, r7, r8)
            r19 = r11
            com.bumptech.glide.load.engine.Engine$DecodeJobFactory r3 = r0.decodeJobFactory
            r4 = r21
            r5 = r22
            r6 = r40
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r1 = r11
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r2 = r15
            r15 = r31
            r16 = r32
            r17 = r37
            r18 = r33
            com.bumptech.glide.load.engine.DecodeJob r3 = r3.build(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.bumptech.glide.load.engine.Jobs r4 = r0.jobs
            r4.put(r2, r1)
            r5 = r1
            r4 = r2
            r1 = r38
            r2 = r39
            r5.addCallback(r1, r2)
            r5.start(r3)
            boolean r2 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r2 == 0) goto L7a
            java.lang.String r2 = "Started new load"
            r6 = r41
            logWithTimeAndKey(r2, r6, r4)
        L7a:
            com.bumptech.glide.load.engine.Engine$LoadStatus r2 = new com.bumptech.glide.load.engine.Engine$LoadStatus
            r2.<init>(r0, r1, r5)
            return r2
    }

    public void clearDiskCache() {
            r1 = this;
            com.bumptech.glide.load.engine.Engine$LazyDiskCacheProvider r0 = r1.diskCacheProvider
            com.bumptech.glide.load.engine.cache.DiskCache r0 = r0.getDiskCache()
            r0.clear()
            return
    }

    public <R> com.bumptech.glide.load.engine.Engine.LoadStatus load(com.bumptech.glide.GlideContext r25, java.lang.Object r26, com.bumptech.glide.load.Key r27, int r28, int r29, java.lang.Class<?> r30, java.lang.Class<R> r31, com.bumptech.glide.Priority r32, com.bumptech.glide.load.engine.DiskCacheStrategy r33, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.Transformation<?>> r34, boolean r35, boolean r36, com.bumptech.glide.load.Options r37, boolean r38, boolean r39, boolean r40, boolean r41, com.bumptech.glide.request.ResourceCallback r42, java.util.concurrent.Executor r43) {
            r24 = this;
            r15 = r24
            boolean r0 = com.bumptech.glide.load.engine.Engine.VERBOSE_IS_LOGGABLE
            if (r0 == 0) goto Lc
            long r0 = com.bumptech.glide.util.LogTime.getLogTime()
        La:
            r13 = r0
            goto Lf
        Lc:
            r0 = 0
            goto La
        Lf:
            com.bumptech.glide.load.engine.EngineKeyFactory r0 = r15.keyFactory
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r34
            r6 = r30
            r7 = r31
            r8 = r37
            com.bumptech.glide.load.engine.EngineKey r0 = r0.buildKey(r1, r2, r3, r4, r5, r6, r7, r8)
            monitor-enter(r24)
            r12 = r38
            com.bumptech.glide.load.engine.EngineResource r1 = r15.loadFromMemory(r0, r12, r13)     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L62
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r22 = r13
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r21 = r0
            com.bumptech.glide.load.engine.Engine$LoadStatus r0 = r1.waitForExistingOrStartNewJob(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L60
            return r0
        L60:
            r0 = move-exception
            goto L6d
        L62:
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L60
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.MEMORY_CACHE
            r2 = 0
            r3 = r42
            r3.onResourceReady(r1, r0, r2)
            r0 = 0
            return r0
        L6d:
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L60
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    public synchronized void onEngineJobCancelled(com.bumptech.glide.load.engine.EngineJob<?> r2, com.bumptech.glide.load.Key r3) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.load.engine.Jobs r0 = r1.jobs     // Catch: java.lang.Throwable -> L8
            r0.removeIfCurrent(r3, r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    public synchronized void onEngineJobComplete(com.bumptech.glide.load.engine.EngineJob<?> r2, com.bumptech.glide.load.Key r3, com.bumptech.glide.load.engine.EngineResource<?> r4) {
            r1 = this;
            monitor-enter(r1)
            if (r4 == 0) goto L11
            boolean r0 = r4.isMemoryCacheable()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            com.bumptech.glide.load.engine.ActiveResources r0 = r1.activeResources     // Catch: java.lang.Throwable -> Lf
            r0.activate(r3, r4)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L18
        L11:
            com.bumptech.glide.load.engine.Jobs r4 = r1.jobs     // Catch: java.lang.Throwable -> Lf
            r4.removeIfCurrent(r3, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.EngineResource.ResourceListener
    public void onResourceReleased(com.bumptech.glide.load.Key r2, com.bumptech.glide.load.engine.EngineResource<?> r3) {
            r1 = this;
            com.bumptech.glide.load.engine.ActiveResources r0 = r1.activeResources
            r0.deactivate(r2)
            boolean r0 = r3.isMemoryCacheable()
            if (r0 == 0) goto L11
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r1.cache
            r0.put(r2, r3)
            goto L17
        L11:
            com.bumptech.glide.load.engine.ResourceRecycler r2 = r1.resourceRecycler
            r0 = 0
            r2.recycle(r3, r0)
        L17:
            return
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
    public void onResourceRemoved(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.Resource<?> r3) {
            r2 = this;
            com.bumptech.glide.load.engine.ResourceRecycler r0 = r2.resourceRecycler
            r1 = 1
            r0.recycle(r3, r1)
            return
    }

    public void release(com.bumptech.glide.load.engine.Resource<?> r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.EngineResource
            if (r0 == 0) goto La
            com.bumptech.glide.load.engine.EngineResource r2 = (com.bumptech.glide.load.engine.EngineResource) r2
            r2.release()
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot release anything but an EngineResource"
            r2.<init>(r0)
            throw r2
    }

    @Yue.InterfaceC6959
    public void shutdown() {
            r1 = this;
            com.bumptech.glide.load.engine.Engine$EngineJobFactory r0 = r1.engineJobFactory
            r0.shutdown()
            com.bumptech.glide.load.engine.Engine$LazyDiskCacheProvider r0 = r1.diskCacheProvider
            r0.clearDiskCacheIfCreated()
            com.bumptech.glide.load.engine.ActiveResources r0 = r1.activeResources
            r0.shutdown()
            return
    }
}
