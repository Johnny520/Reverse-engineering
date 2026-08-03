.class public final Lio/sentry/transport/n;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source ""

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:I

.field public b:Lio/sentry/H1;

.field public final c:Lio/sentry/ILogger;

.field public final d:Lio/sentry/I1;

.field public final e:Lio/sentry/B0;


# direct methods
.method public constructor <init>(ILio/sentry/J;Lio/sentry/transport/a;Lio/sentry/ILogger;Lio/sentry/I1;)V
    .locals 9

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x1

    const-wide/16 v3, 0x0

    move v2, v1

    move-object v0, p0

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    const/4 p2, 0x0

    iput-object p2, v0, Lio/sentry/transport/n;->b:Lio/sentry/H1;

    new-instance p2, Lio/sentry/B0;

    const/4 p3, 0x7

    const/4 v1, 0x0

    invoke-direct {p2, p3, v1}, Lio/sentry/B0;-><init>(IZ)V

    iput-object p2, v0, Lio/sentry/transport/n;->e:Lio/sentry/B0;

    iput p1, v0, Lio/sentry/transport/n;->a:I

    iput-object p4, v0, Lio/sentry/transport/n;->c:Lio/sentry/ILogger;

    iput-object p5, v0, Lio/sentry/transport/n;->d:Lio/sentry/I1;

    return-void
.end method


# virtual methods
.method public final afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/transport/n;->e:Lio/sentry/B0;

    const/4 v1, 0x1

    :try_start_0
    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, v0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast p1, Lio/sentry/transport/q;

    sget p2, Lio/sentry/transport/q;->a:I

    invoke-virtual {p1, v1}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, v0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast p2, Lio/sentry/transport/q;

    sget v0, Lio/sentry/transport/q;->a:I

    invoke-virtual {p2, v1}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    throw p1
.end method

.method public final synthetic close()V
    .locals 5

    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    move-result-object v0

    if-ne p0, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->isTerminated()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    const/4 v1, 0x0

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-virtual {p0, v3, v4, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    if-nez v1, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 3

    iget-object v0, p0, Lio/sentry/transport/n;->e:Lio/sentry/B0;

    iget-object v1, v0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v1, Lio/sentry/transport/q;

    invoke-static {v1}, Lio/sentry/transport/q;->a(Lio/sentry/transport/q;)I

    move-result v1

    iget v2, p0, Lio/sentry/transport/n;->a:I

    if-ge v1, v2, :cond_0

    iget-object v0, v0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/q;

    invoke-static {v0}, Lio/sentry/transport/q;->b(Lio/sentry/transport/q;)V

    invoke-super {p0, p1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lio/sentry/transport/n;->d:Lio/sentry/I1;

    invoke-interface {p1}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/transport/n;->b:Lio/sentry/H1;

    sget-object p1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lio/sentry/transport/n;->c:Lio/sentry/ILogger;

    const-string v2, "Submit cancelled"

    invoke-interface {v1, p1, v2, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lio/sentry/transport/m;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
