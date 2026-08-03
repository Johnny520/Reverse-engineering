.class public final Lio/sentry/U1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/c0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/io/Serializable;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 11
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Lio/sentry/J;

    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, v2}, Lio/sentry/J;-><init>(I)V

    .line 13
    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lio/sentry/U1;-><init>(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lio/sentry/v2;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/y;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lio/sentry/U1;->b:Ljava/io/Serializable;

    .line 17
    iput-object p1, p0, Lio/sentry/U1;->c:Ljava/lang/Object;

    .line 18
    iput-object p1, p0, Lio/sentry/U1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/y;[B)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Lio/sentry/U1;->b:Ljava/io/Serializable;

    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lio/sentry/U1;->c:Ljava/lang/Object;

    .line 23
    iput-object p1, p0, Lio/sentry/U1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/y;[BLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    .line 26
    iput-object p2, p0, Lio/sentry/U1;->b:Ljava/io/Serializable;

    .line 27
    iput-object p3, p0, Lio/sentry/U1;->c:Ljava/lang/Object;

    .line 28
    iput-object p4, p0, Lio/sentry/U1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v2;)V
    .locals 3

    .line 8
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Lio/sentry/J;

    const/4 v2, 0x1

    .line 9
    invoke-direct {v1, v2}, Lio/sentry/J;-><init>(I)V

    .line 10
    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    invoke-direct {p0, v0, p1}, Lio/sentry/U1;-><init>(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lio/sentry/v2;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lio/sentry/v2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lio/sentry/util/a;

    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 4
    iput-object v0, p0, Lio/sentry/U1;->b:Ljava/io/Serializable;

    .line 5
    new-instance v0, Lt8;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lt8;-><init>(I)V

    iput-object v0, p0, Lio/sentry/U1;->c:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Lio/sentry/U1;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public g(J)V
    .locals 3

    iget-object v0, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-object v1, p0, Lio/sentry/U1;->b:Ljava/io/Serializable;

    check-cast v1, Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p1, p2, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_2
    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :goto_0
    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public isClosed()Z
    .locals 2

    iget-object v0, p0, Lio/sentry/U1;->b:Ljava/io/Serializable;

    check-cast v0, Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method public m()V
    .locals 3

    iget-object v0, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Lio/sentry/S1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public q(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;
    .locals 3

    iget-object v0, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/16 v2, 0x10f

    if-ge v1, v2, :cond_0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, p3, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lio/sentry/U1;->d:Ljava/lang/Object;

    check-cast p2, Lio/sentry/v2;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Task "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " rejected from "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p2, p3, p1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    new-instance p1, Lio/sentry/T1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method

.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 5

    iget-object v0, p0, Lio/sentry/U1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/16 v2, 0x10f

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lio/sentry/U1;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/v2;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Task "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " rejected from "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v1, v2, p1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    new-instance p1, Lio/sentry/T1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
