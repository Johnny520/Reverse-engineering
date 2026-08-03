.class public final Lio/sentry/backpressure/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/backpressure/b;
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Lio/sentry/w1;

.field public c:I

.field public volatile d:Ljava/util/concurrent/Future;

.field public final e:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/v2;)V
    .locals 2

    sget-object v0, Lio/sentry/w1;->a:Lio/sentry/w1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, p0, Lio/sentry/backpressure/a;->c:I

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/backpressure/a;->d:Ljava/util/concurrent/Future;

    new-instance v1, Lio/sentry/util/a;

    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v1, p0, Lio/sentry/backpressure/a;->e:Lio/sentry/util/a;

    iput-object p1, p0, Lio/sentry/backpressure/a;->a:Lio/sentry/v2;

    iput-object v0, p0, Lio/sentry/backpressure/a;->b:Lio/sentry/w1;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lio/sentry/backpressure/a;->c:I

    return v0
.end method

.method public final b(I)V
    .locals 4

    iget-object v0, p0, Lio/sentry/backpressure/a;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/c0;->isClosed()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/sentry/backpressure/a;->e:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    int-to-long v2, p1

    :try_start_0
    invoke-interface {v0, p0, v2, v3}, Lio/sentry/c0;->q(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/backpressure/a;->d:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_0
    return-void
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lio/sentry/backpressure/a;->d:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/sentry/backpressure/a;->e:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    const/4 v2, 0x1

    :try_start_0
    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    :cond_0
    return-void
.end method

.method public final run()V
    .locals 5

    iget-object v0, p0, Lio/sentry/backpressure/a;->b:Lio/sentry/w1;

    invoke-virtual {v0}, Lio/sentry/w1;->e()Z

    move-result v0

    iget-object v1, p0, Lio/sentry/backpressure/a;->a:Lio/sentry/v2;

    if-eqz v0, :cond_1

    iget v0, p0, Lio/sentry/backpressure/a;->c:I

    const/4 v2, 0x0

    if-lez v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Health check positive, reverting to normal sampling."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iput v2, p0, Lio/sentry/backpressure/a;->c:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lio/sentry/backpressure/a;->c:I

    const/16 v2, 0xa

    if-ge v0, v2, :cond_2

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lio/sentry/backpressure/a;->c:I

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget v2, p0, Lio/sentry/backpressure/a;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Health check negative, downsampling with a factor of %d"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    const/16 v0, 0x2710

    invoke-virtual {p0, v0}, Lio/sentry/backpressure/a;->b(I)V

    return-void
.end method

.method public final start()V
    .locals 1

    const/16 v0, 0x1f4

    invoke-virtual {p0, v0}, Lio/sentry/backpressure/a;->b(I)V

    return-void
.end method
