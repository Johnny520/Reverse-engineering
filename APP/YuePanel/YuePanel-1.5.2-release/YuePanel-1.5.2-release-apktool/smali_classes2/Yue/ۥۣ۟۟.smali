.class public abstract LYue/ۥۣ۟۟;
.super LYue/ۥۢۥۡۡ;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:Z

.field public ۥ۟۟۠ۧ:Ljava/util/concurrent/ScheduledExecutorService;

.field public ۥ۟۟۠ۨ:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public ۥ۟۟ۡ:J

.field public ۥ۟۟ۡ۟:Z

.field public final ۥ۟۟ۡ۠:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, LYue/ۥۢۥۡۡ;-><init>()V

    const-class v0, LYue/ۥۣ۟۟;

    invoke-static {v0}, LYue/ۥ۠ۨۡۦ;->ۥۣ۟۟۟(Ljava/lang/Class;)LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ:J

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۟:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ۥ۟۟ۢۢ(LYue/ۥۣ۟۟;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ۥۣ۟۟ۢ(LYue/ۥۣ۟۟;)J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ:J

    return-wide v0
.end method

.method public static synthetic ۥ۟۟ۢۤ(LYue/ۥۣ۟۟;LYue/ۥۢۥۡ۠;J)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣ۟۟;->ۥ۟۟ۢۦ(LYue/ۥۢۥۡ۠;J)V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟ۢۥ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    iput-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۢۦ(LYue/ۥۢۥۡ۠;J)V
    .locals 2

    instance-of v0, p1, LYue/ۥۢۥۡۥ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p1, LYue/ۥۢۥۡۥ;

    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۡۨ()J

    move-result-wide v0

    cmp-long p2, v0, p2

    if-gez p2, :cond_1

    iget-object p2, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    const-string p3, "Closing connection due to no pong received: {}"

    invoke-interface {p2, p3, p1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 p2, 0x3ee

    const-string p3, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection"

    invoke-virtual {p1, p2, p3}, LYue/ۥۢۥۡۥ;->ۥ۟۟ۢ(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->isOpen()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, LYue/ۥۢۥۡۥ;->ۥ۟۟۠ۦ()V

    goto :goto_0

    :cond_2
    iget-object p2, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    const-string p3, "Trying to ping a non open connection: {}"

    invoke-interface {p2, p3, p1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۢۧ()I
    .locals 4

    iget-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v2, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ:J

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    long-to-int v1, v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public abstract ۥ۟۟ۢۨ()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e2\u06e5\u06e1\u06e0;",
            ">;"
        }
    .end annotation
.end method

.method public ۥۣ۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۦ:Z

    return v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۥ:Z

    return v0
.end method

.method public final ۥۣ۟۟۠()V
    .locals 8

    invoke-virtual {p0}, LYue/ۥۣ۟۟;->ۥ۟۟ۢۥ()V

    new-instance v0, LYue/ۥۡۢ۠ۢ;

    const-string v1, "connectionLostChecker"

    invoke-direct {v0, v1}, LYue/ۥۡۢ۠ۢ;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, LYue/ۥۣ۟۟$ۥ;

    invoke-direct {v2, p0}, LYue/ۥۣ۟۟$ۥ;-><init>(LYue/ۥۣ۟۟;)V

    iget-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    iget-wide v5, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v3, v5

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public ۥۣ۟۟ۡ(I)V
    .locals 5

    iget-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    iput-wide v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ:J

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-gtz p1, :cond_0

    iget-object p1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    const-string v1, "Connection lost timer stopped"

    invoke-interface {p1, v1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟۟;->ۥ۟۟ۢۥ()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-boolean p1, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۟:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    const-string v1, "Connection lost timer restarted"

    invoke-interface {p1, v1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p0}, LYue/ۥۣ۟۟;->ۥ۟۟ۢۨ()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۥۡ۠;

    instance-of v2, v1, LYue/ۥۢۥۡۥ;

    if-eqz v2, :cond_1

    check-cast v1, LYue/ۥۢۥۡۥ;

    invoke-virtual {v1}, LYue/ۥۢۥۡۥ;->ۥۣ۟۟۟()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    iget-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    const-string v2, "Exception during connection lost restart"

    invoke-interface {v1, v2, p1}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {p0}, LYue/ۥۣ۟۟;->ۥۣ۟۟۠()V

    :cond_3
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public ۥۣ۟۟ۢ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۦ:Z

    return-void
.end method

.method public ۥۣۣ۟۟(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۥ:Z

    return-void
.end method

.method public ۥۣ۟۟ۤ()V
    .locals 5

    iget-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    iget-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    const-string v2, "Connection lost timer deactivated"

    invoke-interface {v1, v2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    const-string v2, "Connection lost timer started"

    invoke-interface {v1, v2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۟:Z

    invoke-virtual {p0}, LYue/ۥۣ۟۟;->ۥۣ۟۟۠()V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ۥۣ۟۟ۥ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۧ:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v1, :cond_0

    iget-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟ۡ۟:Z

    iget-object v1, p0, LYue/ۥۣ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    const-string v2, "Connection lost timer stopped"

    invoke-interface {v1, v2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟۟;->ۥ۟۟ۢۥ()V

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
