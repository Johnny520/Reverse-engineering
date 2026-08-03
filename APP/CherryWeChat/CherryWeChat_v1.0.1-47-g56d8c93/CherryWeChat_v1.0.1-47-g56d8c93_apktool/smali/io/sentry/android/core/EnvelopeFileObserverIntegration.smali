.class public abstract Lio/sentry/android/core/EnvelopeFileObserverIntegration;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/o0;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/core/EnvelopeFileObserverIntegration$OutboxEnvelopeFileObserverIntegration;
    }
.end annotation


# instance fields
.field public a:Lio/sentry/android/core/P;

.field public b:Lio/sentry/ILogger;

.field public c:Z

.field public final d:Lio/sentry/util/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->c:Z

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->d:Lio/sentry/util/a;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->d:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    iget-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->a:Lio/sentry/android/core/P;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/FileObserver;->stopWatching()V

    iget-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->b:Lio/sentry/ILogger;

    if-eqz v0, :cond_0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "EnvelopeFileObserverIntegration removed."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

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

.method public final d(Lio/sentry/v2;Ljava/lang/String;)V
    .locals 8

    new-instance v0, Lio/sentry/a1;

    invoke-virtual {p1}, Lio/sentry/v2;->getEnvelopeReader()Lio/sentry/Q;

    move-result-object v2

    invoke-virtual {p1}, Lio/sentry/v2;->getSerializer()Lio/sentry/e0;

    move-result-object v3

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    invoke-virtual {p1}, Lio/sentry/v2;->getFlushTimeoutMillis()J

    move-result-wide v5

    invoke-virtual {p1}, Lio/sentry/v2;->getMaxQueueSize()I

    move-result v7

    sget-object v1, Lio/sentry/w1;->a:Lio/sentry/w1;

    invoke-direct/range {v0 .. v7}, Lio/sentry/a1;-><init>(Lio/sentry/Z;Lio/sentry/Q;Lio/sentry/e0;Lio/sentry/ILogger;JI)V

    new-instance v1, Lio/sentry/android/core/P;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    invoke-virtual {p1}, Lio/sentry/v2;->getFlushTimeoutMillis()J

    move-result-wide v4

    move-object v2, v0

    move-object v0, v1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lio/sentry/android/core/P;-><init>(Ljava/lang/String;Lio/sentry/a1;Lio/sentry/ILogger;J)V

    iput-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->a:Lio/sentry/android/core/P;

    :try_start_0
    invoke-virtual {v0}, Landroid/os/FileObserver;->startWatching()V

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "EnvelopeFileObserverIntegration installed."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p2, v0, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p2, "EnvelopeFileObserver"

    invoke-static {p2}, Lio/sentry/config/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p2, v0

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Failed to initialize EnvelopeFileObserverIntegration."

    invoke-interface {p1, v0, v1, p2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final p(Lio/sentry/v2;)V
    .locals 5

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->b:Lio/sentry/ILogger;

    invoke-virtual {p1}, Lio/sentry/v2;->getOutboxPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->b:Lio/sentry/ILogger;

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->b:Lio/sentry/ILogger;

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Registering EnvelopeFileObserverIntegration for path: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p1}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v1

    new-instance v2, Lio/sentry/android/core/a0;

    const/4 v3, 0x3

    invoke-direct {v2, p0, p1, v0, v3}, Lio/sentry/android/core/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->b:Lio/sentry/ILogger;

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v2, "Failed to start EnvelopeFileObserverIntegration on executor thread."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
