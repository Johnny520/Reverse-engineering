.class public final Lio/fastkv/FastKVConfig;
.super Ljava/lang/Object;


# static fields
.field static internalLimit:I

.field static volatile sExecutor:Ljava/util/concurrent/Executor;

.field static sLogger:Lio/fastkv/interfaces/FastLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/fastkv/DefaultLogger;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/fastkv/DefaultLogger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/fastkv/FastKVConfig;->sLogger:Lio/fastkv/interfaces/FastLogger;

    .line 7
    .line 8
    const/16 v0, 0x1000

    .line 9
    .line 10
    sput v0, Lio/fastkv/FastKVConfig;->internalLimit:I

    .line 11
    .line 12
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

.method public static getExecutor()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    sget-object v0, Lio/fastkv/FastKVConfig;->sExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lio/fastkv/FastKVConfig;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lio/fastkv/FastKVConfig;->sExecutor:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lio/fastkv/FastKVConfig;->sExecutor:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    goto :goto_2

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1

    .line 25
    :cond_1
    :goto_2
    sget-object v0, Lio/fastkv/FastKVConfig;->sExecutor:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    return-object v0
.end method

.method public static setExecutor(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sput-object p0, Lio/fastkv/FastKVConfig;->sExecutor:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public static setInternalLimit(I)V
    .locals 1

    .line 1
    const/16 v0, 0x800

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const v0, 0xffff

    .line 6
    .line 7
    .line 8
    if-gt p0, v0, :cond_0

    .line 9
    .line 10
    sput p0, Lio/fastkv/FastKVConfig;->internalLimit:I

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static setLogger(Lio/fastkv/interfaces/FastLogger;)V
    .locals 0

    .line 1
    sput-object p0, Lio/fastkv/FastKVConfig;->sLogger:Lio/fastkv/interfaces/FastLogger;

    .line 2
    .line 3
    return-void
.end method
