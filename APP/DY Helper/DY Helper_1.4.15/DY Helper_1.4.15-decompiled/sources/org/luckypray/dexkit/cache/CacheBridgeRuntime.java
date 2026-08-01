package org.luckypray.dexkit.cache;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBridgeRuntime {
    private int activeCalls;
    private final java.lang.String appTag;
    private volatile org.luckypray.dexkit.DexKitBridge bridge;
    private final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge bridgeHolder;
    private final p000.p70 createBridge;
    private final java.util.concurrent.atomic.AtomicBoolean destroyed;
    private long generation;
    private final p000.p70 idleTimeoutMillis;
    private final java.lang.Object lifecycleLock;
    private final p000.p70 notifyBridgeCreated;
    private final p000.p70 notifyBridgeDestroyed;
    private final p000.p70 notifyBridgeReleased;
    private java.util.concurrent.ScheduledFuture<?> reaperFuture;
    private boolean releaseRequested;
    private final java.util.concurrent.ScheduledThreadPoolExecutor scheduler;

    public CacheBridgeRuntime(java.lang.String r1, org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r2, java.util.concurrent.ScheduledThreadPoolExecutor r3, p000.p70 r4, p000.p70 r5, p000.p70 r6, p000.p70 r7, p000.p70 r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.appTag = r1
            r0.bridgeHolder = r2
            r0.scheduler = r3
            r0.idleTimeoutMillis = r4
            r0.createBridge = r5
            r0.notifyBridgeCreated = r6
            r0.notifyBridgeReleased = r7
            r0.notifyBridgeDestroyed = r8
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.destroyed = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.lifecycleLock = r1
            return
    }

    public static final /* synthetic */ void access$beginUse(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            r0.beginUse()
            return
    }

    public static final /* synthetic */ void access$endUse(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            r0.endUse()
            return
    }

    public static final /* synthetic */ org.luckypray.dexkit.DexKitBridge access$getBridge$p(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            org.luckypray.dexkit.DexKitBridge r0 = r0.bridge
            return r0
    }

    public static final /* synthetic */ p000.p70 access$getCreateBridge$p(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            p70 r0 = r0.createBridge
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$getLifecycleLock$p(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            java.lang.Object r0 = r0.lifecycleLock
            return r0
    }

    public static final /* synthetic */ p000.p70 access$getNotifyBridgeCreated$p(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            p70 r0 = r0.notifyBridgeCreated
            return r0
    }

    public static final /* synthetic */ void access$setBridge$p(org.luckypray.dexkit.cache.CacheBridgeRuntime r0, org.luckypray.dexkit.DexKitBridge r1) {
            r0.bridge = r1
            return
    }

    private final void beginUse() {
            r5 = this;
            java.lang.Object r0 = r5.lifecycleLock
            monitor-enter(r0)
            r5.ensureUsable()     // Catch: java.lang.Throwable -> L16
            long r1 = r5.generation     // Catch: java.lang.Throwable -> L16
            r3 = 1
            long r1 = r1 + r3
            r5.generation = r1     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.ScheduledFuture<?> r1 = r5.reaperFuture     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            r2 = 0
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r5 = move-exception
            goto L23
        L18:
            r1 = 0
            r5.reaperFuture = r1     // Catch: java.lang.Throwable -> L16
            int r1 = r5.activeCalls     // Catch: java.lang.Throwable -> L16
            int r1 = r1 + 1
            r5.activeCalls = r1     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        L23:
            monitor-exit(r0)
            throw r5
    }

    private final void endUse() {
            r3 = this;
            java.lang.Object r0 = r3.lifecycleLock
            monitor-enter(r0)
            int r1 = r3.activeCalls     // Catch: java.lang.Throwable -> L1a
            if (r1 <= 0) goto L38
            int r1 = r1 + (-1)
            r3.activeCalls = r1     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Lf
            monitor-exit(r0)
            return
        Lf:
            boolean r1 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            boolean r1 = r3.releaseBridgeLocked()     // Catch: java.lang.Throwable -> L1a
            goto L2f
        L1a:
            r3 = move-exception
            goto L40
        L1c:
            boolean r1 = r3.releaseRequested     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            if (r1 == 0) goto L2b
            r3.releaseRequested = r2     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r3.releaseBridgeLocked()     // Catch: java.lang.Throwable -> L1a
            r3.moveToWeakPoolLocked()     // Catch: java.lang.Throwable -> L1a
            goto L2f
        L2b:
            r3.scheduleRetireLocked()     // Catch: java.lang.Throwable -> L1a
            r1 = r2
        L2f:
            monitor-exit(r0)
            if (r1 == 0) goto L37
            p70 r3 = r3.notifyBridgeReleased
            r3.invoke()
        L37:
            return
        L38:
            java.lang.String r3 = "activeCalls underflow"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L40:
            monitor-exit(r0)
            throw r3
    }

    private final void moveToWeakPoolLocked() {
            r2 = this;
            boolean r0 = r2.isDestroyed()
            if (r0 != 0) goto L10
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            java.lang.String r1 = r2.appTag
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r2.bridgeHolder
            r0.moveToWeak(r1, r2)
            return
        L10:
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            java.lang.String r1 = r2.appTag
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r2.bridgeHolder
            r0.removeStrong(r1, r2)
            return
    }

    private final boolean releaseBridgeLocked() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r1.bridge
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            r0.close()
            r0 = 0
            r1.bridge = r0
            r1 = 1
            return r1
    }

    private final void scheduleRetireLocked() {
            r5 = this;
            long r0 = r5.generation
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r5.scheduler
            ed r3 = new ed
            r3.<init>(r5, r0)
            p70 r0 = r5.idleTimeoutMillis
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r2.schedule(r3, r0, r4)
            r5.reaperFuture = r0
            return
    }

    private static final void scheduleRetireLocked$lambda$7(org.luckypray.dexkit.cache.CacheBridgeRuntime r3, long r4) {
            r3.getClass()
            java.lang.Object r0 = r3.lifecycleLock
            monitor-enter(r0)
            boolean r1 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto Le
            monitor-exit(r0)
            return
        Le:
            int r1 = r3.activeCalls     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L14
            monitor-exit(r0)
            return
        L14:
            long r1 = r3.generation     // Catch: java.lang.Throwable -> L4c
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L1c
            monitor-exit(r0)
            return
        L1c:
            r4 = 0
            r3.reaperFuture = r4     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r3.releaseRequested     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L25
            monitor-exit(r0)
            return
        L25:
            org.luckypray.dexkit.cache.CacheBridgeRegistry r4 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r3.appTag     // Catch: java.lang.Throwable -> L4c
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = r3.bridgeHolder     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r4.removeStrong(r5, r1)     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L4e
            boolean r5 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L38
            goto L4e
        L38:
            boolean r5 = r3.releaseBridgeLocked()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r3.appTag     // Catch: java.lang.Throwable -> L4c
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r3.bridgeHolder     // Catch: java.lang.Throwable -> L4c
            r4.putWeak(r1, r2)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)
            if (r5 == 0) goto L4b
            p70 r3 = r3.notifyBridgeReleased
            r3.invoke()
        L4b:
            return
        L4c:
            r3 = move-exception
            goto L50
        L4e:
            monitor-exit(r0)
            return
        L50:
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ void m4260(org.luckypray.dexkit.cache.CacheBridgeRuntime r0, long r1) {
            scheduleRetireLocked$lambda$7(r0, r1)
            return
    }

    public final <R> R acquireBridge(p000.a80 r4) {
            r3 = this;
            r4.getClass()
            access$beginUse(r3)
            java.lang.Object r0 = access$getLifecycleLock$p(r3)     // Catch: java.lang.Throwable -> L31
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L31
            org.luckypray.dexkit.DexKitBridge r1 = access$getBridge$p(r3)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L25
            p70 r1 = access$getCreateBridge$p(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L23
            r2 = r1
            org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2     // Catch: java.lang.Throwable -> L23
            access$setBridge$p(r3, r2)     // Catch: java.lang.Throwable -> L23
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1     // Catch: java.lang.Throwable -> L23
            r2 = 1
            goto L26
        L23:
            r4 = move-exception
            goto L3b
        L25:
            r2 = 0
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L33
            p70 r0 = access$getNotifyBridgeCreated$p(r3)     // Catch: java.lang.Throwable -> L31
            r0.invoke()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r4 = move-exception
            goto L3d
        L33:
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L31
            access$endUse(r3)
            return r4
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L3d:
            access$endUse(r3)
            throw r4
    }

    public final void close() {
            r5 = this;
            java.lang.Object r0 = r5.lifecycleLock
            monitor-enter(r0)
            r5.ensureUsable()     // Catch: java.lang.Throwable -> L16
            long r1 = r5.generation     // Catch: java.lang.Throwable -> L16
            r3 = 1
            long r1 = r1 + r3
            r5.generation = r1     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.ScheduledFuture<?> r1 = r5.reaperFuture     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 == 0) goto L18
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r5 = move-exception
            goto L35
        L18:
            r1 = 0
            r5.reaperFuture = r1     // Catch: java.lang.Throwable -> L16
            int r1 = r5.activeCalls     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L29
            r5.releaseRequested = r2     // Catch: java.lang.Throwable -> L16
            boolean r2 = r5.releaseBridgeLocked()     // Catch: java.lang.Throwable -> L16
            r5.moveToWeakPoolLocked()     // Catch: java.lang.Throwable -> L16
            goto L2c
        L29:
            r1 = 1
            r5.releaseRequested = r1     // Catch: java.lang.Throwable -> L16
        L2c:
            monitor-exit(r0)
            if (r2 == 0) goto L34
            p70 r5 = r5.notifyBridgeReleased
            r5.invoke()
        L34:
            return
        L35:
            monitor-exit(r0)
            throw r5
    }

    public final void destroy() {
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.destroyed
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.lifecycleLock
            monitor-enter(r0)
            long r3 = r7.generation     // Catch: java.lang.Throwable -> L1e
            r5 = 1
            long r3 = r3 + r5
            r7.generation = r3     // Catch: java.lang.Throwable -> L1e
            r7.releaseRequested = r2     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.ScheduledFuture<?> r1 = r7.reaperFuture     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            r1.cancel(r2)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L47
        L20:
            r1 = 0
            r7.reaperFuture = r1     // Catch: java.lang.Throwable -> L1e
            int r1 = r7.activeCalls     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L2b
            boolean r2 = r7.releaseBridgeLocked()     // Catch: java.lang.Throwable -> L1e
        L2b:
            monitor-exit(r0)
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            java.lang.String r1 = r7.appTag
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r3 = r7.bridgeHolder
            r0.removeStrong(r1, r3)
            java.lang.String r1 = r7.appTag
            r0.removeWeak(r1)
            if (r2 == 0) goto L41
            p70 r0 = r7.notifyBridgeReleased
            r0.invoke()
        L41:
            p70 r7 = r7.notifyBridgeDestroyed
            r7.invoke()
            return
        L47:
            monitor-exit(r0)
            throw r7
        L49:
            return
    }

    public final void ensureUsable() {
            r0 = this;
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "RecyclableBridge is destroyed"
            p000.C1080.m7279(r0)
            return
    }

    public final boolean isDestroyed() {
            r0 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.destroyed
            boolean r0 = r0.get()
            return r0
    }
}
