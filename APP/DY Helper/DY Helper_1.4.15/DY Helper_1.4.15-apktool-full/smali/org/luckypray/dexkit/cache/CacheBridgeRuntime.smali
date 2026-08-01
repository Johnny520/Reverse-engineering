.class public final Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field private activeCalls:I

.field private final appTag:Ljava/lang/String;

.field private volatile bridge:Lorg/luckypray/dexkit/DexKitBridge;

.field private final bridgeHolder:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

.field private final createBridge:Lp70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70;"
        }
    .end annotation
.end field

.field private final destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private generation:J

.field private final idleTimeoutMillis:Lp70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70;"
        }
    .end annotation
.end field

.field private final lifecycleLock:Ljava/lang/Object;

.field private final notifyBridgeCreated:Lp70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70;"
        }
    .end annotation
.end field

.field private final notifyBridgeDestroyed:Lp70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70;"
        }
    .end annotation
.end field

.field private final notifyBridgeReleased:Lp70;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70;"
        }
    .end annotation
.end field

.field private reaperFuture:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private releaseRequested:Z

.field private final scheduler:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lp70;Lp70;Lp70;Lp70;Lp70;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;",
            "Ljava/util/concurrent/ScheduledThreadPoolExecutor;",
            "Lp70;",
            "Lp70;",
            "Lp70;",
            "Lp70;",
            "Lp70;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->appTag:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p2, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridgeHolder:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 31
    .line 32
    iput-object p3, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->scheduler:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 33
    .line 34
    iput-object p4, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->idleTimeoutMillis:Lp70;

    .line 35
    .line 36
    iput-object p5, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->createBridge:Lp70;

    .line 37
    .line 38
    iput-object p6, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeCreated:Lp70;

    .line 39
    .line 40
    iput-object p7, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeReleased:Lp70;

    .line 41
    .line 42
    iput-object p8, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeDestroyed:Lp70;

    .line 43
    .line 44
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    new-instance p1, Ljava/lang/Object;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->lifecycleLock:Ljava/lang/Object;

    .line 58
    .line 59
    return-void
.end method

.method public static final synthetic access$beginUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->beginUse()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->endUse()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lorg/luckypray/dexkit/DexKitBridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getCreateBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lp70;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->createBridge:Lp70;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLifecycleLock$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->lifecycleLock:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getNotifyBridgeCreated$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lp70;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeCreated:Lp70;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;Lorg/luckypray/dexkit/DexKitBridge;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    return-void
.end method

.method private final beginUse()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->lifecycleLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->ensureUsable()V

    .line 5
    .line 6
    .line 7
    iget-wide v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->generation:J

    .line 8
    .line 9
    const-wide/16 v3, 0x1

    .line 10
    .line 11
    add-long/2addr v1, v3

    .line 12
    iput-wide v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->generation:J

    .line 13
    .line 14
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->reaperFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 26
    iput-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->reaperFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 27
    .line 28
    iget v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->activeCalls:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    iput v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->activeCalls:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p0
.end method

.method private final endUse()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->lifecycleLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->activeCalls:I

    .line 5
    .line 6
    if-lez v1, :cond_4

    .line 7
    .line 8
    add-int/lit8 v1, v1, -0x1

    .line 9
    .line 10
    iput v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->activeCalls:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->isDestroyed()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseBridgeLocked()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-boolean v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseRequested:Z

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iput-boolean v2, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseRequested:Z

    .line 35
    .line 36
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseBridgeLocked()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->moveToWeakPoolLocked()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->scheduleRetireLocked()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    move v1, v2

    .line 48
    :goto_0
    monitor-exit v0

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeReleased:Lp70;

    .line 52
    .line 53
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void

    .line 57
    :cond_4
    :try_start_2
    const-string p0, "activeCalls underflow"

    .line 58
    .line 59
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    :goto_1
    monitor-exit v0

    .line 66
    throw p0
.end method

.method private final moveToWeakPoolLocked()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->isDestroyed()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;

    .line 8
    .line 9
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->appTag:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridgeHolder:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->moveToWeak(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;

    .line 18
    .line 19
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->appTag:Ljava/lang/String;

    .line 20
    .line 21
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridgeHolder:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 22
    .line 23
    invoke-virtual {v0, v1, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->removeStrong(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final releaseBridgeLocked()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridge:Lorg/luckypray/dexkit/DexKitBridge;

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0
.end method

.method private final scheduleRetireLocked()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->generation:J

    .line 2
    .line 3
    iget-object v2, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->scheduler:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 4
    .line 5
    new-instance v3, Led;

    .line 6
    .line 7
    invoke-direct {v3, p0, v0, v1}, Led;-><init>(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->idleTimeoutMillis:Lp70;

    .line 11
    .line 12
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 23
    .line 24
    invoke-virtual {v2, v3, v0, v1, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->reaperFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 29
    .line 30
    return-void
.end method

.method private static final scheduleRetireLocked$lambda$7(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->lifecycleLock:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->isDestroyed()Z

    .line 8
    .line 9
    .line 10
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_1
    iget v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->activeCalls:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :cond_1
    :try_start_2
    iget-wide v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->generation:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 22
    .line 23
    cmp-long p1, v1, p1

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :cond_2
    const/4 p1, 0x0

    .line 30
    :try_start_3
    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->reaperFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 31
    .line 32
    iget-boolean p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseRequested:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :cond_3
    :try_start_4
    sget-object p1, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;

    .line 39
    .line 40
    iget-object p2, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->appTag:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridgeHolder:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 43
    .line 44
    invoke-virtual {p1, p2, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->removeStrong(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_6

    .line 49
    .line 50
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->isDestroyed()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseBridgeLocked()Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->appTag:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v2, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridgeHolder:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 64
    .line 65
    invoke-virtual {p1, v1, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->putWeak(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit v0

    .line 69
    if-eqz p2, :cond_5

    .line 70
    .line 71
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeReleased:Lp70;

    .line 72
    .line 73
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_5
    return-void

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    goto :goto_1

    .line 79
    :cond_6
    :goto_0
    monitor-exit v0

    .line 80
    return-void

    .line 81
    :goto_1
    monitor-exit v0

    .line 82
    throw p0
.end method

.method public static synthetic α(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->scheduleRetireLocked$lambda$7(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final acquireBridge(La80;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "La80;",
            ")TR;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$beginUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getLifecycleLock$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    :try_start_1
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lorg/luckypray/dexkit/DexKitBridge;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getCreateBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lp70;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Lorg/luckypray/dexkit/DexKitBridge;

    .line 28
    .line 29
    invoke-static {p0, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$setBridge$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;Lorg/luckypray/dexkit/DexKitBridge;)V

    .line 30
    .line 31
    .line 32
    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    :goto_0
    :try_start_2
    monitor-exit v0

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$getNotifyBridgeCreated$p(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)Lp70;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception p1

    .line 51
    goto :goto_3

    .line 52
    :cond_1
    :goto_1
    invoke-interface {p1, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :goto_2
    :try_start_3
    monitor-exit v0

    .line 61
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :goto_3
    invoke-static {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->access$endUse(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->lifecycleLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->ensureUsable()V

    .line 5
    .line 6
    .line 7
    iget-wide v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->generation:J

    .line 8
    .line 9
    const-wide/16 v3, 0x1

    .line 10
    .line 11
    add-long/2addr v1, v3

    .line 12
    iput-wide v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->generation:J

    .line 13
    .line 14
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->reaperFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 26
    iput-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->reaperFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 27
    .line 28
    iget v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->activeCalls:I

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iput-boolean v2, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseRequested:Z

    .line 33
    .line 34
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseBridgeLocked()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->moveToWeakPoolLocked()V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseRequested:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    :goto_1
    monitor-exit v0

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeReleased:Lp70;

    .line 49
    .line 50
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void

    .line 54
    :goto_2
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public final destroy()V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->lifecycleLock:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-wide v3, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->generation:J

    .line 15
    .line 16
    const-wide/16 v5, 0x1

    .line 17
    .line 18
    add-long/2addr v3, v5

    .line 19
    iput-wide v3, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->generation:J

    .line 20
    .line 21
    iput-boolean v2, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseRequested:Z

    .line 22
    .line 23
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->reaperFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->reaperFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 35
    .line 36
    iget v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->activeCalls:I

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    invoke-direct {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->releaseBridgeLocked()Z

    .line 41
    .line 42
    .line 43
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :cond_1
    monitor-exit v0

    .line 45
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;

    .line 46
    .line 47
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->appTag:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->bridgeHolder:Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 50
    .line 51
    invoke-virtual {v0, v1, v3}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->removeStrong(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;)Z

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->appTag:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->removeWeak(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeReleased:Lp70;

    .line 62
    .line 63
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->notifyBridgeDestroyed:Lp70;

    .line 67
    .line 68
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :goto_1
    monitor-exit v0

    .line 73
    throw p0

    .line 74
    :cond_3
    return-void
.end method

.method public final ensureUsable()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->isDestroyed()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "RecyclableBridge is destroyed"

    .line 9
    .line 10
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final isDestroyed()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
