.class public abstract Lorg/luckypray/dexkit/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:J

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ScheduledThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 8
    .line 9
    new-instance v1, Lorg/luckypray/dexkit/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lorg/luckypray/dexkit/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lorg/luckypray/dexkit/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 34
    .line 35
    const-wide/16 v0, 0x1388

    .line 36
    .line 37
    sput-wide v0, Lorg/luckypray/dexkit/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:J

    .line 38
    .line 39
    sget-object v0, Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;->NONE:Lorg/luckypray/dexkit/DexKitCacheBridge$CacheFailurePolicy;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    return-void
.end method
