package org.luckypray.dexkit.cache;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCacheBridgeRuntime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0014J-\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0014J\r\u0010#\u001a\u00020\r¢\u0006\u0004\b#\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;", "", "", "appTag", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "bridgeHolder", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "scheduler", "Lkotlin/Function0;", "", "idleTimeoutMillis", "Lorg/luckypray/dexkit/DexKitBridge;", "createBridge", "LYue/ۥۣۢ۠ۤ;", "notifyBridgeCreated", "notifyBridgeReleased", "notifyBridgeDestroyed", "<init>", "(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/util/concurrent/ScheduledThreadPoolExecutor;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)V", "beginUse", "()V", "endUse", "", "releaseBridgeLocked", "()Z", "scheduleRetireLocked", "moveToWeakPoolLocked", "isDestroyed", "ensureUsable", "R", "Lkotlin/Function1;", "block", "acquireBridge", "(LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;", "close", "destroy", "Ljava/lang/String;", "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "LYue/ۥۣ۠۠ۨ;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lifecycleLock", "Ljava/lang/Object;", "", "activeCalls", "I", "generation", "J", "releaseRequested", "Z", "Ljava/util/concurrent/ScheduledFuture;", "reaperFuture", "Ljava/util/concurrent/ScheduledFuture;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class CacheBridgeRuntime {
    private int activeCalls;

    @Yue.InterfaceC4418
    private final java.lang.String appTag;

    @Yue.InterfaceC4543
    private volatile org.luckypray.dexkit.DexKitBridge bridge;

    @Yue.InterfaceC4418
    private final org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge bridgeHolder;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2823<org.luckypray.dexkit.DexKitBridge> createBridge;

    @Yue.InterfaceC4418
    private final java.util.concurrent.atomic.AtomicBoolean destroyed;
    private long generation;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2823<java.lang.Long> idleTimeoutMillis;

    @Yue.InterfaceC4418
    private final java.lang.Object lifecycleLock;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2823<Yue.C6593> notifyBridgeCreated;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2823<Yue.C6593> notifyBridgeDestroyed;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC2823<Yue.C6593> notifyBridgeReleased;

    @Yue.InterfaceC4543
    private java.util.concurrent.ScheduledFuture<?> reaperFuture;
    private boolean releaseRequested;

    @Yue.InterfaceC4418
    private final java.util.concurrent.ScheduledThreadPoolExecutor scheduler;

    public CacheBridgeRuntime(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r3, @Yue.InterfaceC4418 java.util.concurrent.ScheduledThreadPoolExecutor r4, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.Long> r5, @Yue.InterfaceC4418 Yue.InterfaceC2823<org.luckypray.dexkit.DexKitBridge> r6, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r7, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r8, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r9) {
            r1 = this;
            java.lang.String r0 = "appTag"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "bridgeHolder"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "scheduler"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "idleTimeoutMillis"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "createBridge"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "notifyBridgeCreated"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "notifyBridgeReleased"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "notifyBridgeDestroyed"
            Yue.C3329.m13906(r9, r0)
            r1.<init>()
            r1.appTag = r2
            r1.bridgeHolder = r3
            r1.scheduler = r4
            r1.idleTimeoutMillis = r5
            r1.createBridge = r6
            r1.notifyBridgeCreated = r7
            r1.notifyBridgeReleased = r8
            r1.notifyBridgeDestroyed = r9
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r1.destroyed = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.lifecycleLock = r2
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

    public static final /* synthetic */ Yue.InterfaceC2823 access$getCreateBridge$p(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            Yue.ۥۣ۠۠ۨ<org.luckypray.dexkit.DexKitBridge> r0 = r0.createBridge
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$getLifecycleLock$p(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            java.lang.Object r0 = r0.lifecycleLock
            return r0
    }

    public static final /* synthetic */ Yue.InterfaceC2823 access$getNotifyBridgeCreated$p(org.luckypray.dexkit.cache.CacheBridgeRuntime r0) {
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r0.notifyBridgeCreated
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
            r1 = move-exception
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
            throw r1
    }

    private final void endUse() {
            r3 = this;
            java.lang.Object r0 = r3.lifecycleLock
            monitor-enter(r0)
            int r1 = r3.activeCalls     // Catch: java.lang.Throwable -> L1a
            if (r1 <= 0) goto L3a
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
            r1 = move-exception
            goto L46
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
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            if (r1 == 0) goto L39
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r3.notifyBridgeReleased
            r0.invoke()
        L39:
            return
        L3a:
            java.lang.String r1 = "activeCalls underflow"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L46:
            monitor-exit(r0)
            throw r1
    }

    private final void moveToWeakPoolLocked() {
            r3 = this;
            boolean r0 = r3.isDestroyed()
            if (r0 != 0) goto L10
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            java.lang.String r1 = r3.appTag
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r3.bridgeHolder
            r0.moveToWeak(r1, r2)
            goto L19
        L10:
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            java.lang.String r1 = r3.appTag
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r3.bridgeHolder
            r0.removeStrong(r1, r2)
        L19:
            return
    }

    private final boolean releaseBridgeLocked() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r1.bridge
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0.close()
            r0 = 0
            r1.bridge = r0
            r0 = 1
            return r0
    }

    private final void scheduleRetireLocked() {
            r5 = this;
            long r0 = r5.generation
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r5.scheduler
            Yue.ۥۣ۟ۦ r3 = new Yue.ۥۣ۟ۦ
            r3.<init>(r5, r0)
            Yue.ۥۣ۠۠ۨ<java.lang.Long> r0 = r5.idleTimeoutMillis
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r2.schedule(r3, r0, r4)
            r5.reaperFuture = r0
            return
    }

    private static final void scheduleRetireLocked$lambda$7(org.luckypray.dexkit.cache.CacheBridgeRuntime r3, long r4) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r3, r0)
            java.lang.Object r0 = r3.lifecycleLock
            monitor-enter(r0)
            boolean r1 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L10
            monitor-exit(r0)
            return
        L10:
            int r1 = r3.activeCalls     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L16
            monitor-exit(r0)
            return
        L16:
            long r1 = r3.generation     // Catch: java.lang.Throwable -> L4e
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L1e
            monitor-exit(r0)
            return
        L1e:
            r4 = 0
            r3.reaperFuture = r4     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r3.releaseRequested     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L27
            monitor-exit(r0)
            return
        L27:
            org.luckypray.dexkit.cache.CacheBridgeRegistry r4 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r3.appTag     // Catch: java.lang.Throwable -> L4e
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = r3.bridgeHolder     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4.removeStrong(r5, r1)     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            boolean r5 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3a
            goto L50
        L3a:
            boolean r5 = r3.releaseBridgeLocked()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r3.appTag     // Catch: java.lang.Throwable -> L4e
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r3.bridgeHolder     // Catch: java.lang.Throwable -> L4e
            r4.putWeak(r1, r2)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)
            if (r5 == 0) goto L4d
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r3 = r3.notifyBridgeReleased
            r3.invoke()
        L4d:
            return
        L4e:
            r3 = move-exception
            goto L52
        L50:
            monitor-exit(r0)
            return
        L52:
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m30785(org.luckypray.dexkit.cache.CacheBridgeRuntime r0, long r1) {
            scheduleRetireLocked$lambda$7(r0, r1)
            return
    }

    public final <R> R acquireBridge(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super org.luckypray.dexkit.DexKitBridge, ? extends R> r5) {
            r4 = this;
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r5, r0)
            access$beginUse(r4)
            r0 = 1
            java.lang.Object r1 = access$getLifecycleLock$p(r4)     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3a
            org.luckypray.dexkit.DexKitBridge r2 = access$getBridge$p(r4)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L28
            Yue.ۥۣ۠۠ۨ r2 = access$getCreateBridge$p(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L26
            r3 = r2
            org.luckypray.dexkit.DexKitBridge r3 = (org.luckypray.dexkit.DexKitBridge) r3     // Catch: java.lang.Throwable -> L26
            access$setBridge$p(r4, r3)     // Catch: java.lang.Throwable -> L26
            org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2     // Catch: java.lang.Throwable -> L26
            r3 = r0
            goto L29
        L26:
            r5 = move-exception
            goto L4a
        L28:
            r3 = 0
        L29:
            Yue.C3249.m13687(r0)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            Yue.C3249.m13686(r0)     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3c
            Yue.ۥۣ۠۠ۨ r1 = access$getNotifyBridgeCreated$p(r4)     // Catch: java.lang.Throwable -> L3a
            r1.invoke()     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r5 = move-exception
            goto L52
        L3c:
            java.lang.Object r5 = r5.invoke(r2)     // Catch: java.lang.Throwable -> L3a
            Yue.C3249.m13687(r0)
            access$endUse(r4)
            Yue.C3249.m13686(r0)
            return r5
        L4a:
            Yue.C3249.m13687(r0)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            Yue.C3249.m13686(r0)     // Catch: java.lang.Throwable -> L3a
            throw r5     // Catch: java.lang.Throwable -> L3a
        L52:
            Yue.C3249.m13687(r0)
            access$endUse(r4)
            Yue.C3249.m13686(r0)
            throw r5
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
            r1 = move-exception
            goto L37
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
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            if (r2 == 0) goto L36
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r5.notifyBridgeReleased
            r0.invoke()
        L36:
            return
        L37:
            monitor-exit(r0)
            throw r1
    }

    public final void destroy() {
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.destroyed
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L4b
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
            r1 = move-exception
            goto L49
        L20:
            r1 = 0
            r7.reaperFuture = r1     // Catch: java.lang.Throwable -> L1e
            int r1 = r7.activeCalls     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L2b
            boolean r2 = r7.releaseBridgeLocked()     // Catch: java.lang.Throwable -> L1e
        L2b:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            org.luckypray.dexkit.cache.CacheBridgeRegistry r0 = org.luckypray.dexkit.cache.CacheBridgeRegistry.INSTANCE
            java.lang.String r1 = r7.appTag
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r3 = r7.bridgeHolder
            r0.removeStrong(r1, r3)
            java.lang.String r1 = r7.appTag
            r0.removeWeak(r1)
            if (r2 == 0) goto L43
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r7.notifyBridgeReleased
            r0.invoke()
        L43:
            Yue.ۥۣ۠۠ۨ<Yue.ۥۣۢ۠ۤ> r0 = r7.notifyBridgeDestroyed
            r0.invoke()
            goto L4b
        L49:
            monitor-exit(r0)
            throw r1
        L4b:
            return
    }

    public final void ensureUsable() {
            r2 = this;
            boolean r0 = r2.isDestroyed()
            r0 = r0 ^ 1
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclableBridge is destroyed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean isDestroyed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.destroyed
            boolean r0 = r0.get()
            return r0
    }
}
