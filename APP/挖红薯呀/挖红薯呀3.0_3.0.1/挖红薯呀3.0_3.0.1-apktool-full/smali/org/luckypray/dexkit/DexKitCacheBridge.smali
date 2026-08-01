.class public final Lorg/luckypray/dexkit/DexKitCacheBridge;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$QueryFailureEvent;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;,
        Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

.field private static final cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private static cachePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

.field private static final cacheRef:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;",
            ">;"
        }
    .end annotation
.end field

.field private static idleTimeoutMillis:J

.field private static final listeners:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;",
            ">;"
        }
    .end annotation
.end field

.field private static final reaperScheduler:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cacheRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 17
    .line 18
    new-instance v2, Lin;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v0, v3, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->reaperScheduler:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 31
    .line 32
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 38
    .line 39
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 45
    .line 46
    const-wide/16 v2, 0x1388

    .line 47
    .line 48
    sput-wide v2, Lorg/luckypray/dexkit/DexKitCacheBridge;->idleTimeoutMillis:J

    .line 49
    .line 50
    new-instance v0, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x3

    .line 54
    invoke-direct {v0, v2, v1, v3, v1}, Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;-><init>(ZLorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;ILpl;)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cachePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 58
    .line 59
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge;->reaperScheduler$lambda$1(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getCache(Lorg/luckypray/dexkit/DexKitCacheBridge;)Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCache()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getCacheLock$p()Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getReaperScheduler$p()Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->reaperScheduler:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final addListener(Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final clearAllCache()V
    .locals 5

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getWriteHoldCount()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getReadHoldCount()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v3

    .line 20
    :goto_0
    move v4, v3

    .line 21
    :goto_1
    if-ge v4, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 34
    .line 35
    .line 36
    :try_start_0
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 37
    .line 38
    invoke-direct {v4}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCache()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {v4}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->clearAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :goto_2
    if-ge v3, v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception v4

    .line 58
    :goto_3
    if-ge v3, v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 67
    .line 68
    .line 69
    throw v4
.end method

.method public static final clearCache(Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cacheLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getWriteHoldCount()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getReadHoldCount()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v3

    .line 23
    :goto_0
    move v4, v3

    .line 24
    :goto_1
    if-ge v4, v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 37
    .line 38
    .line 39
    :try_start_0
    sget-object v4, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeKeys;

    .line 40
    .line 41
    invoke-virtual {v4, p0}, Lorg/luckypray/dexkit/cache/CacheBridgeKeys;->cachePrefixOf(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ":"

    .line 54
    .line 55
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object v4, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 63
    .line 64
    invoke-direct {v4}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCache()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v4}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->getAllKeys()Ljava/util/Collection;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/lang/Iterable;

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v5, p0, v3}, Lr41;->S(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_2

    .line 95
    .line 96
    sget-object v6, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 97
    .line 98
    invoke-direct {v6}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCache()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-interface {v6, v5}, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;->remove(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    goto :goto_4

    .line 108
    :cond_3
    :goto_3
    if-ge v3, v2, :cond_4

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v3, v3, 0x1

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :goto_4
    if-ge v3, v2, :cond_5

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 123
    .line 124
    .line 125
    add-int/lit8 v3, v3, 0x1

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 129
    .line 130
    .line 131
    throw p0
.end method

.method public static final clearListeners()V
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final create(Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCache()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 27
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;

    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$create$3;

    invoke-direct {v1, p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$create$3;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    invoke-virtual {v0, p0, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->obtainBridge(Ljava/lang/String;Lhw;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    .line 8
    .line 9
    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCache()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;

    .line 13
    .line 14
    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$create$1;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$create$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->obtainBridge(Ljava/lang/String;Lhw;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final create(Ljava/lang/String;[[B)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->INSTANCE:Lorg/luckypray/dexkit/DexKitCacheBridge;

    invoke-direct {v0}, Lorg/luckypray/dexkit/DexKitCacheBridge;->getCache()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 25
    sget-object v0, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->INSTANCE:Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;

    new-instance v1, Lorg/luckypray/dexkit/DexKitCacheBridge$create$2;

    invoke-direct {v1, p0, p1}, Lorg/luckypray/dexkit/DexKitCacheBridge$create$2;-><init>(Ljava/lang/String;[[B)V

    invoke-virtual {v0, p0, v1}, Lorg/luckypray/dexkit/cache/CacheBridgeRegistry;->obtainBridge(Ljava/lang/String;Lhw;)Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;

    move-result-object p0

    return-object p0
.end method

.method private final getCache()Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;
    .locals 0

    .line 1
    sget-object p0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cacheRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Wrapper must be init(cache) first"

    .line 13
    .line 14
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static final getCachePolicy()Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cachePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getCachePolicy$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getIdleTimeoutMillis()J
    .locals 2

    .line 1
    sget-wide v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->idleTimeoutMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic getIdleTimeoutMillis$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final init(Lorg/luckypray/dexkit/DexKitCacheBridge$Cache;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cacheRef:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    :goto_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p0, "DexKitCacheBridge.init(cache) can only be called once"

    .line 22
    .line 23
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final notifyListeners(Lsw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lorg/luckypray/dexkit/DexKitCacheBridge;->access$getListeners$p()Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :catchall_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method private static final reaperScheduler$lambda$1(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    const-string v1, "DexKit-Reaper"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final removeListener(Lorg/luckypray/dexkit/DexKitCacheBridge$CacheBridgeListener;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge;->listeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final setCachePolicy(Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p0, Lorg/luckypray/dexkit/DexKitCacheBridge;->cachePolicy:Lorg/luckypray/dexkit/DexKitCacheBridge$CachePolicy;

    .line 5
    .line 6
    return-void
.end method

.method public static final setIdleTimeoutMillis(J)V
    .locals 0

    .line 1
    sput-wide p0, Lorg/luckypray/dexkit/DexKitCacheBridge;->idleTimeoutMillis:J

    .line 2
    .line 3
    return-void
.end method
