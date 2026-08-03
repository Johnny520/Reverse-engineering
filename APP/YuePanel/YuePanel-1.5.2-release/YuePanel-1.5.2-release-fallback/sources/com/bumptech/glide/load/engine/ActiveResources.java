package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
final class ActiveResources {

    @Yue.InterfaceC6959
    final java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference> activeEngineResources;

    @Yue.InterfaceC4544
    private volatile com.bumptech.glide.load.engine.ActiveResources.DequeuedResourceCallback cb;
    private final boolean isActiveResourceRetentionAllowed;
    private volatile boolean isShutdown;
    private com.bumptech.glide.load.engine.EngineResource.ResourceListener listener;
    private final java.util.concurrent.Executor monitorClearedResourcesExecutor;
    private final java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.EngineResource<?>> resourceReferenceQueue;



    @Yue.InterfaceC6959
    public interface DequeuedResourceCallback {
        void onResourceDequeued();
    }

    @Yue.InterfaceC6959
    public static final class ResourceWeakReference extends java.lang.ref.WeakReference<com.bumptech.glide.load.engine.EngineResource<?>> {
        final boolean isCacheable;
        final com.bumptech.glide.load.Key key;

        @Yue.InterfaceC4544
        com.bumptech.glide.load.engine.Resource<?> resource;

        public ResourceWeakReference(@Yue.InterfaceC4410 com.bumptech.glide.load.Key r1, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.EngineResource<?> r2, @Yue.InterfaceC4410 java.lang.ref.ReferenceQueue<? super com.bumptech.glide.load.engine.EngineResource<?>> r3, boolean r4) {
                r0 = this;
                r0.<init>(r2, r3)
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                com.bumptech.glide.load.Key r1 = (com.bumptech.glide.load.Key) r1
                r0.key = r1
                boolean r1 = r2.isMemoryCacheable()
                if (r1 == 0) goto L1e
                if (r4 == 0) goto L1e
                com.bumptech.glide.load.engine.Resource r1 = r2.getResource()
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                com.bumptech.glide.load.engine.Resource r1 = (com.bumptech.glide.load.engine.Resource) r1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                r0.resource = r1
                boolean r1 = r2.isMemoryCacheable()
                r0.isCacheable = r1
                return
        }

        public void reset() {
                r1 = this;
                r0 = 0
                r1.resource = r0
                r1.clear()
                return
        }
    }

    public ActiveResources(boolean r2) {
            r1 = this;
            com.bumptech.glide.load.engine.ActiveResources$1 r0 = new com.bumptech.glide.load.engine.ActiveResources$1
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r1.<init>(r2, r0)
            return
    }

    @Yue.InterfaceC6959
    public ActiveResources(boolean r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.activeEngineResources = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r1.resourceReferenceQueue = r0
            r1.isActiveResourceRetentionAllowed = r2
            r1.monitorClearedResourcesExecutor = r3
            com.bumptech.glide.load.engine.ActiveResources$2 r2 = new com.bumptech.glide.load.engine.ActiveResources$2
            r2.<init>(r1)
            r3.execute(r2)
            return
    }

    public synchronized void activate(com.bumptech.glide.load.Key r4, com.bumptech.glide.load.engine.EngineResource<?> r5) {
            r3 = this;
            monitor-enter(r3)
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r0 = new com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference     // Catch: java.lang.Throwable -> L18
            java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.EngineResource<?>> r1 = r3.resourceReferenceQueue     // Catch: java.lang.Throwable -> L18
            boolean r2 = r3.isActiveResourceRetentionAllowed     // Catch: java.lang.Throwable -> L18
            r0.<init>(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> L18
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference> r5 = r3.activeEngineResources     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r5.put(r4, r0)     // Catch: java.lang.Throwable -> L18
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r4 = (com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) r4     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L1a
            r4.reset()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r4 = move-exception
            goto L1c
        L1a:
            monitor-exit(r3)
            return
        L1c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    public void cleanReferenceQueue() {
            r1 = this;
        L0:
            boolean r0 = r1.isShutdown
            if (r0 != 0) goto L1f
            java.lang.ref.ReferenceQueue<com.bumptech.glide.load.engine.EngineResource<?>> r0 = r1.resourceReferenceQueue     // Catch: java.lang.InterruptedException -> L17
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> L17
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r0 = (com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) r0     // Catch: java.lang.InterruptedException -> L17
            r1.cleanupActiveReference(r0)     // Catch: java.lang.InterruptedException -> L17
            com.bumptech.glide.load.engine.ActiveResources$DequeuedResourceCallback r0 = r1.cb     // Catch: java.lang.InterruptedException -> L17
            if (r0 == 0) goto L0
            r0.onResourceDequeued()     // Catch: java.lang.InterruptedException -> L17
            goto L0
        L17:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L0
        L1f:
            return
    }

    public void cleanupActiveReference(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference r8) {
            r7 = this;
            monitor-enter(r7)
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference> r0 = r7.activeEngineResources     // Catch: java.lang.Throwable -> L26
            com.bumptech.glide.load.Key r1 = r8.key     // Catch: java.lang.Throwable -> L26
            r0.remove(r1)     // Catch: java.lang.Throwable -> L26
            boolean r0 = r8.isCacheable     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L28
            com.bumptech.glide.load.engine.Resource<?> r2 = r8.resource     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L11
            goto L28
        L11:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L26
            com.bumptech.glide.load.engine.EngineResource r0 = new com.bumptech.glide.load.engine.EngineResource
            com.bumptech.glide.load.Key r5 = r8.key
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r6 = r7.listener
            r3 = 1
            r4 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.bumptech.glide.load.engine.EngineResource$ResourceListener r1 = r7.listener
            com.bumptech.glide.load.Key r8 = r8.key
            r1.onResourceReleased(r8, r0)
            return
        L26:
            r8 = move-exception
            goto L2a
        L28:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L26
            return
        L2a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L26
            throw r8
    }

    public synchronized void deactivate(com.bumptech.glide.load.Key r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference> r0 = r1.activeEngineResources     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> Lf
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r2 = (com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) r2     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r2.reset()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    @Yue.InterfaceC4544
    public synchronized com.bumptech.glide.load.engine.EngineResource<?> get(com.bumptech.glide.load.Key r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference> r0 = r1.activeEngineResources     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1a
            com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference r2 = (com.bumptech.glide.load.engine.ActiveResources.ResourceWeakReference) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto Le
            monitor-exit(r1)
            r2 = 0
            return r2
        Le:
            java.lang.Object r0 = r2.get()     // Catch: java.lang.Throwable -> L1a
            com.bumptech.glide.load.engine.EngineResource r0 = (com.bumptech.glide.load.engine.EngineResource) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            r1.cleanupActiveReference(r2)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L1e
        L1c:
            monitor-exit(r1)
            return r0
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    @Yue.InterfaceC6959
    public void setDequeuedResourceCallback(com.bumptech.glide.load.engine.ActiveResources.DequeuedResourceCallback r1) {
            r0 = this;
            r0.cb = r1
            return
    }

    public void setListener(com.bumptech.glide.load.engine.EngineResource.ResourceListener r2) {
            r1 = this;
            monitor-enter(r2)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L7
            r1.listener = r2     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto Lc
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0     // Catch: java.lang.Throwable -> L7
        Lc:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @Yue.InterfaceC6959
    public void shutdown() {
            r2 = this;
            r0 = 1
            r2.isShutdown = r0
            java.util.concurrent.Executor r0 = r2.monitorClearedResourcesExecutor
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto Le
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(r0)
        Le:
            return
    }
}
