package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
class EngineJob<R> implements com.bumptech.glide.load.engine.DecodeJob.Callback<R>, com.bumptech.glide.util.pool.FactoryPools.Poolable {
    private static final com.bumptech.glide.load.engine.EngineJob.EngineResourceFactory DEFAULT_FACTORY = null;
    private final com.bumptech.glide.load.engine.executor.GlideExecutor animationExecutor;
    final com.bumptech.glide.load.engine.EngineJob.ResourceCallbacksAndExecutors cbs;
    com.bumptech.glide.load.DataSource dataSource;
    private com.bumptech.glide.load.engine.DecodeJob<R> decodeJob;
    private final com.bumptech.glide.load.engine.executor.GlideExecutor diskCacheExecutor;
    private final com.bumptech.glide.load.engine.EngineJobListener engineJobListener;
    com.bumptech.glide.load.engine.EngineResource<?> engineResource;
    private final com.bumptech.glide.load.engine.EngineJob.EngineResourceFactory engineResourceFactory;
    com.bumptech.glide.load.engine.GlideException exception;
    private boolean hasLoadFailed;
    private boolean hasResource;
    private boolean isCacheable;
    private volatile boolean isCancelled;
    private boolean isLoadedFromAlternateCacheKey;
    private com.bumptech.glide.load.Key key;
    private boolean onlyRetrieveFromCache;
    private final java.util.concurrent.atomic.AtomicInteger pendingCallbacks;
    private final Yue.C4820.InterfaceC4821<com.bumptech.glide.load.engine.EngineJob<?>> pool;
    private com.bumptech.glide.load.engine.Resource<?> resource;
    private final com.bumptech.glide.load.engine.EngineResource.ResourceListener resourceListener;
    private final com.bumptech.glide.load.engine.executor.GlideExecutor sourceExecutor;
    private final com.bumptech.glide.load.engine.executor.GlideExecutor sourceUnlimitedExecutor;
    private final com.bumptech.glide.util.pool.StateVerifier stateVerifier;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorPool;

    public class CallLoadFailed implements java.lang.Runnable {
        private final com.bumptech.glide.request.ResourceCallback cb;
        final /* synthetic */ com.bumptech.glide.load.engine.EngineJob this$0;

        public CallLoadFailed(com.bumptech.glide.load.engine.EngineJob r1, com.bumptech.glide.request.ResourceCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.cb = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bumptech.glide.request.ResourceCallback r0 = r4.cb
                java.lang.Object r0 = r0.getLock()
                monitor-enter(r0)
                com.bumptech.glide.load.engine.EngineJob r1 = r4.this$0     // Catch: java.lang.Throwable -> L28
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L28
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L1e
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r2 = r2.cbs     // Catch: java.lang.Throwable -> L1e
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L1e
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L1e
                if (r2 == 0) goto L20
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L1e
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L1e
                r2.callCallbackOnLoadFailed(r3)     // Catch: java.lang.Throwable -> L1e
                goto L20
            L1e:
                r2 = move-exception
                goto L2a
            L20:
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L1e
                r2.decrementPendingCallbacks()     // Catch: java.lang.Throwable -> L1e
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                return
            L28:
                r1 = move-exception
                goto L2c
            L2a:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
                throw r2     // Catch: java.lang.Throwable -> L28
            L2c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                throw r1
        }
    }

    public class CallResourceReady implements java.lang.Runnable {
        private final com.bumptech.glide.request.ResourceCallback cb;
        final /* synthetic */ com.bumptech.glide.load.engine.EngineJob this$0;

        public CallResourceReady(com.bumptech.glide.load.engine.EngineJob r1, com.bumptech.glide.request.ResourceCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.cb = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                com.bumptech.glide.request.ResourceCallback r0 = r4.cb
                java.lang.Object r0 = r0.getLock()
                monitor-enter(r0)
                com.bumptech.glide.load.engine.EngineJob r1 = r4.this$0     // Catch: java.lang.Throwable -> L36
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L36
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r2 = r2.cbs     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L2c
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L2c
                if (r2 == 0) goto L2e
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.load.engine.EngineResource<?> r2 = r2.engineResource     // Catch: java.lang.Throwable -> L2c
                r2.acquire()     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L2c
                r2.callCallbackOnResourceReady(r3)     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L2c
                com.bumptech.glide.request.ResourceCallback r3 = r4.cb     // Catch: java.lang.Throwable -> L2c
                r2.removeCallback(r3)     // Catch: java.lang.Throwable -> L2c
                goto L2e
            L2c:
                r2 = move-exception
                goto L38
            L2e:
                com.bumptech.glide.load.engine.EngineJob r2 = r4.this$0     // Catch: java.lang.Throwable -> L2c
                r2.decrementPendingCallbacks()     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                return
            L36:
                r1 = move-exception
                goto L3a
            L38:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
                throw r2     // Catch: java.lang.Throwable -> L36
            L3a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
                throw r1
        }
    }

    @Yue.InterfaceC6959
    public static class EngineResourceFactory {
        public EngineResourceFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public <R> com.bumptech.glide.load.engine.EngineResource<R> build(com.bumptech.glide.load.engine.Resource<R> r8, boolean r9, com.bumptech.glide.load.Key r10, com.bumptech.glide.load.engine.EngineResource.ResourceListener r11) {
                r7 = this;
                com.bumptech.glide.load.engine.EngineResource r6 = new com.bumptech.glide.load.engine.EngineResource
                r3 = 1
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }
    }

    public static final class ResourceCallbackAndExecutor {
        final com.bumptech.glide.request.ResourceCallback cb;
        final java.util.concurrent.Executor executor;

        public ResourceCallbackAndExecutor(com.bumptech.glide.request.ResourceCallback r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.cb = r1
                r0.executor = r2
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor
                if (r0 == 0) goto Lf
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r2 = (com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor) r2
                com.bumptech.glide.request.ResourceCallback r0 = r1.cb
                com.bumptech.glide.request.ResourceCallback r2 = r2.cb
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.bumptech.glide.request.ResourceCallback r0 = r1.cb
                int r0 = r0.hashCode()
                return r0
        }
    }

    public static final class ResourceCallbacksAndExecutors implements java.lang.Iterable<com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor> {
        private final java.util.List<com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor> callbacksAndExecutors;

        public ResourceCallbacksAndExecutors() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 2
                r0.<init>(r1)
                r2.<init>(r0)
                return
        }

        public ResourceCallbacksAndExecutors(java.util.List<com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor> r1) {
                r0 = this;
                r0.<init>()
                r0.callbacksAndExecutors = r1
                return
        }

        private static com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor defaultCallbackAndExecutor(com.bumptech.glide.request.ResourceCallback r2) {
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r0 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor
                java.util.concurrent.Executor r1 = com.bumptech.glide.util.Executors.directExecutor()
                r0.<init>(r2, r1)
                return r0
        }

        public void add(com.bumptech.glide.request.ResourceCallback r3, java.util.concurrent.Executor r4) {
                r2 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r2.callbacksAndExecutors
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r1 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor
                r1.<init>(r3, r4)
                r0.add(r1)
                return
        }

        public void clear() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                r0.clear()
                return
        }

        public boolean contains(com.bumptech.glide.request.ResourceCallback r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r2 = defaultCallbackAndExecutor(r2)
                boolean r2 = r0.contains(r2)
                return r2
        }

        public com.bumptech.glide.load.engine.EngineJob.ResourceCallbacksAndExecutors copy() {
                r3 = this;
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r2 = r3.callbacksAndExecutors
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        public boolean isEmpty() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.lang.Iterable
        @Yue.InterfaceC4410
        public java.util.Iterator<com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor> iterator() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        public void remove(com.bumptech.glide.request.ResourceCallback r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r2 = defaultCallbackAndExecutor(r2)
                r0.remove(r2)
                return
        }

        public int size() {
                r1 = this;
                java.util.List<com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor> r0 = r1.callbacksAndExecutors
                int r0 = r0.size()
                return r0
        }
    }

    static {
            com.bumptech.glide.load.engine.EngineJob$EngineResourceFactory r0 = new com.bumptech.glide.load.engine.EngineJob$EngineResourceFactory
            r0.<init>()
            com.bumptech.glide.load.engine.EngineJob.DEFAULT_FACTORY = r0
            return
    }

    public EngineJob(com.bumptech.glide.load.engine.executor.GlideExecutor r10, com.bumptech.glide.load.engine.executor.GlideExecutor r11, com.bumptech.glide.load.engine.executor.GlideExecutor r12, com.bumptech.glide.load.engine.executor.GlideExecutor r13, com.bumptech.glide.load.engine.EngineJobListener r14, com.bumptech.glide.load.engine.EngineResource.ResourceListener r15, Yue.C4820.InterfaceC4821<com.bumptech.glide.load.engine.EngineJob<?>> r16) {
            r9 = this;
            com.bumptech.glide.load.engine.EngineJob$EngineResourceFactory r8 = com.bumptech.glide.load.engine.EngineJob.DEFAULT_FACTORY
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Yue.InterfaceC6959
    public EngineJob(com.bumptech.glide.load.engine.executor.GlideExecutor r2, com.bumptech.glide.load.engine.executor.GlideExecutor r3, com.bumptech.glide.load.engine.executor.GlideExecutor r4, com.bumptech.glide.load.engine.executor.GlideExecutor r5, com.bumptech.glide.load.engine.EngineJobListener r6, com.bumptech.glide.load.engine.EngineResource.ResourceListener r7, Yue.C4820.InterfaceC4821<com.bumptech.glide.load.engine.EngineJob<?>> r8, com.bumptech.glide.load.engine.EngineJob.EngineResourceFactory r9) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = new com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors
            r0.<init>()
            r1.cbs = r0
            com.bumptech.glide.util.pool.StateVerifier r0 = com.bumptech.glide.util.pool.StateVerifier.newInstance()
            r1.stateVerifier = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.pendingCallbacks = r0
            r1.diskCacheExecutor = r2
            r1.sourceExecutor = r3
            r1.sourceUnlimitedExecutor = r4
            r1.animationExecutor = r5
            r1.engineJobListener = r6
            r1.resourceListener = r7
            r1.pool = r8
            r1.engineResourceFactory = r9
            return
    }

    private com.bumptech.glide.load.engine.executor.GlideExecutor getActiveSourceExecutor() {
            r1 = this;
            boolean r0 = r1.useUnlimitedSourceGeneratorPool
            if (r0 == 0) goto L7
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.sourceUnlimitedExecutor
            goto L10
        L7:
            boolean r0 = r1.useAnimationPool
            if (r0 == 0) goto Le
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.animationExecutor
            goto L10
        Le:
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.sourceExecutor
        L10:
            return r0
    }

    private boolean isDone() {
            r1 = this;
            boolean r0 = r1.hasLoadFailed
            if (r0 != 0) goto Lf
            boolean r0 = r1.hasResource
            if (r0 != 0) goto Lf
            boolean r0 = r1.isCancelled
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private synchronized void release() {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.load.Key r0 = r3.key     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2e
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r3.cbs     // Catch: java.lang.Throwable -> L2c
            r0.clear()     // Catch: java.lang.Throwable -> L2c
            r0 = 0
            r3.key = r0     // Catch: java.lang.Throwable -> L2c
            r3.engineResource = r0     // Catch: java.lang.Throwable -> L2c
            r3.resource = r0     // Catch: java.lang.Throwable -> L2c
            r1 = 0
            r3.hasLoadFailed = r1     // Catch: java.lang.Throwable -> L2c
            r3.isCancelled = r1     // Catch: java.lang.Throwable -> L2c
            r3.hasResource = r1     // Catch: java.lang.Throwable -> L2c
            r3.isLoadedFromAlternateCacheKey = r1     // Catch: java.lang.Throwable -> L2c
            com.bumptech.glide.load.engine.DecodeJob<R> r2 = r3.decodeJob     // Catch: java.lang.Throwable -> L2c
            r2.release(r1)     // Catch: java.lang.Throwable -> L2c
            r3.decodeJob = r0     // Catch: java.lang.Throwable -> L2c
            r3.exception = r0     // Catch: java.lang.Throwable -> L2c
            r3.dataSource = r0     // Catch: java.lang.Throwable -> L2c
            Yue.ۥۡۤۤ۠$ۥ<com.bumptech.glide.load.engine.EngineJob<?>> r0 = r3.pool     // Catch: java.lang.Throwable -> L2c
            r0.release(r3)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r0 = move-exception
            goto L34
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    public synchronized void addCallback(com.bumptech.glide.request.ResourceCallback r3, java.util.concurrent.Executor r4) {
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.util.pool.StateVerifier r0 = r2.stateVerifier     // Catch: java.lang.Throwable -> L1c
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r2.cbs     // Catch: java.lang.Throwable -> L1c
            r0.add(r3, r4)     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r2.hasResource     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            if (r0 == 0) goto L1e
            r2.incrementPendingCallbacks(r1)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.EngineJob$CallResourceReady r0 = new com.bumptech.glide.load.engine.EngineJob$CallResourceReady     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r4.execute(r0)     // Catch: java.lang.Throwable -> L1c
            goto L36
        L1c:
            r3 = move-exception
            goto L38
        L1e:
            boolean r0 = r2.hasLoadFailed     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L2e
            r2.incrementPendingCallbacks(r1)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.EngineJob$CallLoadFailed r0 = new com.bumptech.glide.load.engine.EngineJob$CallLoadFailed     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1c
            r4.execute(r0)     // Catch: java.lang.Throwable -> L1c
            goto L36
        L2e:
            boolean r3 = r2.isCancelled     // Catch: java.lang.Throwable -> L1c
            r3 = r3 ^ r1
            java.lang.String r4 = "Cannot add callbacks to a cancelled EngineJob"
            com.bumptech.glide.util.Preconditions.checkArgument(r3, r4)     // Catch: java.lang.Throwable -> L1c
        L36:
            monitor-exit(r2)
            return
        L38:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    @Yue.InterfaceC2947("this")
    public void callCallbackOnLoadFailed(com.bumptech.glide.request.ResourceCallback r2) {
            r1 = this;
            com.bumptech.glide.load.engine.GlideException r0 = r1.exception     // Catch: java.lang.Throwable -> L6
            r2.onLoadFailed(r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r2 = move-exception
            com.bumptech.glide.load.engine.CallbackException r0 = new com.bumptech.glide.load.engine.CallbackException
            r0.<init>(r2)
            throw r0
    }

    @Yue.InterfaceC2947("this")
    public void callCallbackOnResourceReady(com.bumptech.glide.request.ResourceCallback r4) {
            r3 = this;
            com.bumptech.glide.load.engine.EngineResource<?> r0 = r3.engineResource     // Catch: java.lang.Throwable -> La
            com.bumptech.glide.load.DataSource r1 = r3.dataSource     // Catch: java.lang.Throwable -> La
            boolean r2 = r3.isLoadedFromAlternateCacheKey     // Catch: java.lang.Throwable -> La
            r4.onResourceReady(r0, r1, r2)     // Catch: java.lang.Throwable -> La
            return
        La:
            r4 = move-exception
            com.bumptech.glide.load.engine.CallbackException r0 = new com.bumptech.glide.load.engine.CallbackException
            r0.<init>(r4)
            throw r0
    }

    public void cancel() {
            r2 = this;
            boolean r0 = r2.isDone()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            r2.isCancelled = r0
            com.bumptech.glide.load.engine.DecodeJob<R> r0 = r2.decodeJob
            r0.cancel()
            com.bumptech.glide.load.engine.EngineJobListener r0 = r2.engineJobListener
            com.bumptech.glide.load.Key r1 = r2.key
            r0.onEngineJobCancelled(r2, r1)
            return
    }

    public void decrementPendingCallbacks() {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.util.pool.StateVerifier r0 = r3.stateVerifier     // Catch: java.lang.Throwable -> L27
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L27
            boolean r0 = r3.isDone()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "Not yet complete!"
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.atomic.AtomicInteger r0 = r3.pendingCallbacks     // Catch: java.lang.Throwable -> L27
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L27
            if (r0 < 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r2 = "Can't decrement below 0"
            com.bumptech.glide.util.Preconditions.checkArgument(r1, r2)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            com.bumptech.glide.load.engine.EngineResource<?> r0 = r3.engineResource     // Catch: java.lang.Throwable -> L27
            r3.release()     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r0 = move-exception
            goto L31
        L29:
            r0 = 0
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L30
            r0.release()
        L30:
            return
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @Yue.InterfaceC4410
    public com.bumptech.glide.util.pool.StateVerifier getVerifier() {
            r1 = this;
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier
            return r0
    }

    public synchronized void incrementPendingCallbacks(int r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Not yet complete!"
            com.bumptech.glide.util.Preconditions.checkArgument(r0, r1)     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.atomic.AtomicInteger r0 = r2.pendingCallbacks     // Catch: java.lang.Throwable -> L1a
            int r3 = r0.getAndAdd(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L1c
            com.bumptech.glide.load.engine.EngineResource<?> r3 = r2.engineResource     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            r3.acquire()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L1e
        L1c:
            monitor-exit(r2)
            return
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }

    @Yue.InterfaceC6959
    public synchronized com.bumptech.glide.load.engine.EngineJob<R> init(com.bumptech.glide.load.Key r1, boolean r2, boolean r3, boolean r4, boolean r5) {
            r0 = this;
            monitor-enter(r0)
            r0.key = r1     // Catch: java.lang.Throwable -> Ld
            r0.isCacheable = r2     // Catch: java.lang.Throwable -> Ld
            r0.useUnlimitedSourceGeneratorPool = r3     // Catch: java.lang.Throwable -> Ld
            r0.useAnimationPool = r4     // Catch: java.lang.Throwable -> Ld
            r0.onlyRetrieveFromCache = r5     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r0
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public synchronized boolean isCancelled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isCancelled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void notifyCallbacksOfException() {
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.util.pool.StateVerifier r0 = r4.stateVerifier     // Catch: java.lang.Throwable -> Lf
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r4.isCancelled     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r4.release()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            goto L68
        L11:
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r4.cbs     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L60
            boolean r0 = r4.hasLoadFailed     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L58
            r0 = 1
            r4.hasLoadFailed = r0     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.Key r1 = r4.key     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r2 = r4.cbs     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r2 = r2.copy()     // Catch: java.lang.Throwable -> Lf
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Lf
            int r3 = r3 + r0
            r4.incrementPendingCallbacks(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.EngineJobListener r0 = r4.engineJobListener
            r3 = 0
            r0.onEngineJobComplete(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r1 = (com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor) r1
            java.util.concurrent.Executor r2 = r1.executor
            com.bumptech.glide.load.engine.EngineJob$CallLoadFailed r3 = new com.bumptech.glide.load.engine.EngineJob$CallLoadFailed
            com.bumptech.glide.request.ResourceCallback r1 = r1.cb
            r3.<init>(r4, r1)
            r2.execute(r3)
            goto L3b
        L54:
            r4.decrementPendingCallbacks()
            return
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        L60:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        L68:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public void notifyCallbacksOfResult() {
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.util.pool.StateVerifier r0 = r5.stateVerifier     // Catch: java.lang.Throwable -> L14
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L14
            boolean r0 = r5.isCancelled     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.bumptech.glide.load.engine.Resource<?> r0 = r5.resource     // Catch: java.lang.Throwable -> L14
            r0.recycle()     // Catch: java.lang.Throwable -> L14
            r5.release()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            goto L7e
        L16:
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r5.cbs     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L76
            boolean r0 = r5.hasResource     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L6e
            com.bumptech.glide.load.engine.EngineJob$EngineResourceFactory r0 = r5.engineResourceFactory     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.Resource<?> r1 = r5.resource     // Catch: java.lang.Throwable -> L14
            boolean r2 = r5.isCacheable     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.Key r3 = r5.key     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r4 = r5.resourceListener     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.EngineResource r0 = r0.build(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L14
            r5.engineResource = r0     // Catch: java.lang.Throwable -> L14
            r0 = 1
            r5.hasResource = r0     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r1 = r5.cbs     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r1 = r1.copy()     // Catch: java.lang.Throwable -> L14
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L14
            int r2 = r2 + r0
            r5.incrementPendingCallbacks(r2)     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.Key r0 = r5.key     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.EngineResource<?> r2 = r5.engineResource     // Catch: java.lang.Throwable -> L14
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L14
            com.bumptech.glide.load.engine.EngineJobListener r3 = r5.engineJobListener
            r3.onEngineJobComplete(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbackAndExecutor r1 = (com.bumptech.glide.load.engine.EngineJob.ResourceCallbackAndExecutor) r1
            java.util.concurrent.Executor r2 = r1.executor
            com.bumptech.glide.load.engine.EngineJob$CallResourceReady r3 = new com.bumptech.glide.load.engine.EngineJob$CallResourceReady
            com.bumptech.glide.request.ResourceCallback r1 = r1.cb
            r3.<init>(r5, r1)
            r2.execute(r3)
            goto L51
        L6a:
            r5.decrementPendingCallbacks()
            return
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L76:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L14
        L7e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void onLoadFailed(com.bumptech.glide.load.engine.GlideException r1) {
            r0 = this;
            monitor-enter(r0)
            r0.exception = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            r0.notifyCallbacksOfException()
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void onResourceReady(com.bumptech.glide.load.engine.Resource<R> r1, com.bumptech.glide.load.DataSource r2, boolean r3) {
            r0 = this;
            monitor-enter(r0)
            r0.resource = r1     // Catch: java.lang.Throwable -> Lc
            r0.dataSource = r2     // Catch: java.lang.Throwable -> Lc
            r0.isLoadedFromAlternateCacheKey = r3     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            r0.notifyCallbacksOfResult()
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public boolean onlyRetrieveFromCache() {
            r1 = this;
            boolean r0 = r1.onlyRetrieveFromCache
            return r0
    }

    public synchronized void removeCallback(com.bumptech.glide.request.ResourceCallback r2) {
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.util.pool.StateVerifier r0 = r1.stateVerifier     // Catch: java.lang.Throwable -> L1f
            r0.throwIfRecycled()     // Catch: java.lang.Throwable -> L1f
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r0 = r1.cbs     // Catch: java.lang.Throwable -> L1f
            r0.remove(r2)     // Catch: java.lang.Throwable -> L1f
            com.bumptech.glide.load.engine.EngineJob$ResourceCallbacksAndExecutors r2 = r1.cbs     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L2c
            r1.cancel()     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r1.hasResource     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L21
            boolean r2 = r1.hasLoadFailed     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L2c
            goto L21
        L1f:
            r2 = move-exception
            goto L2e
        L21:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.pendingCallbacks     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L2c
            r1.release()     // Catch: java.lang.Throwable -> L1f
        L2c:
            monitor-exit(r1)
            return
        L2e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.Callback
    public void reschedule(com.bumptech.glide.load.engine.DecodeJob<?> r2) {
            r1 = this;
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.getActiveSourceExecutor()
            r0.execute(r2)
            return
    }

    public synchronized void start(com.bumptech.glide.load.engine.DecodeJob<R> r2) {
            r1 = this;
            monitor-enter(r1)
            r1.decodeJob = r2     // Catch: java.lang.Throwable -> Lc
            boolean r0 = r2.willDecodeFromCache()     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.diskCacheExecutor     // Catch: java.lang.Throwable -> Lc
            goto L12
        Lc:
            r2 = move-exception
            goto L17
        Le:
            com.bumptech.glide.load.engine.executor.GlideExecutor r0 = r1.getActiveSourceExecutor()     // Catch: java.lang.Throwable -> Lc
        L12:
            r0.execute(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}
