.class public final Lio/sentry/v1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/Z;


# instance fields
.field public final a:Lio/sentry/X;

.field public final b:Lio/sentry/X;

.field public final c:Lio/sentry/X;

.field public final d:Lio/sentry/m;

.field public final e:Lio/sentry/l;


# direct methods
.method public constructor <init>(Lio/sentry/X;Lio/sentry/X;Lio/sentry/X;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/l;

    invoke-direct {v0, p3, p2, p1}, Lio/sentry/l;-><init>(Lio/sentry/X;Lio/sentry/X;Lio/sentry/X;)V

    iput-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    iput-object p1, p0, Lio/sentry/v1;->a:Lio/sentry/X;

    iput-object p2, p0, Lio/sentry/v1;->b:Lio/sentry/X;

    iput-object p3, p0, Lio/sentry/v1;->c:Lio/sentry/X;

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    const-string p2, "SentryOptions is required."

    invoke-static {p2, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/sentry/v2;->getDsn()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lio/sentry/v2;->getDsn()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lio/sentry/v2;->getCompositePerformanceCollector()Lio/sentry/m;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/v1;->d:Lio/sentry/m;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Z)V
    .locals 8

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v2, "Instance is disabled and this \'close\' call is a no-op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getIntegrations()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/o0;

    instance-of v3, v2, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v3, :cond_1

    :try_start_1
    move-object v3, v2

    check-cast v3, Ljava/io/Closeable;

    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :try_start_2
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v4

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v6, "Failed to close the integration {}."

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v4, v5, v6, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_1
    move-exception p1

    goto/16 :goto_6

    :cond_2
    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string v2, "Error in the \'configureScope\' callback."

    iget-object v3, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    const-string v4, "Instance is disabled and this \'configureScope\' call is a no-op."

    if-nez v0, :cond_3

    :try_start_3
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v5, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    new-array v6, v1, [Ljava/lang/Object;

    invoke-interface {v0, v5, v4, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :try_start_4
    invoke-virtual {v3, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v5, v6, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    sget-object v0, Lio/sentry/u1;->ISOLATION:Lio/sentry/u1;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    new-array v7, v1, [Ljava/lang/Object;

    invoke-interface {v5, v6, v4, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :cond_4
    :try_start_6
    invoke-virtual {v3, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v5

    invoke-interface {v5}, Lio/sentry/X;->clear()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v5

    :try_start_7
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    sget-object v7, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v6, v7, v2, v5}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    move-result-object v5

    invoke-interface {v5}, Lio/sentry/backpressure/b;->close()V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getTransactionProfiler()Lio/sentry/j0;

    move-result-object v5

    invoke-interface {v5}, Lio/sentry/j0;->close()V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getContinuousProfiler()Lio/sentry/P;

    move-result-object v5

    const/4 v6, 0x1

    invoke-interface {v5, v6}, Lio/sentry/P;->a(Z)V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getCompositePerformanceCollector()Lio/sentry/m;

    move-result-object v5

    invoke-interface {v5}, Lio/sentry/m;->close()V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getConnectionStatusProvider()Lio/sentry/O;

    move-result-object v5

    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v5

    if-eqz p1, :cond_5

    new-instance v6, Ln3;

    const/16 v7, 0x14

    invoke-direct {v6, v7, p0, v5}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v6}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/v2;->getShutdownTimeoutMillis()J

    move-result-wide v6

    invoke-interface {v5, v6, v7}, Lio/sentry/c0;->g(J)V

    :goto_3
    sget-object v5, Lio/sentry/u1;->CURRENT:Lio/sentry/u1;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v6

    if-nez v6, :cond_6

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    new-array v7, v1, [Ljava/lang/Object;

    invoke-interface {v5, v6, v4, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_4

    :cond_6
    :try_start_8
    invoke-virtual {v3, v5}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v5

    invoke-interface {v5}, Lio/sentry/X;->J()Lio/sentry/b0;

    move-result-object v5

    invoke-interface {v5, p1}, Lio/sentry/b0;->a(Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v5

    :try_start_9
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    sget-object v7, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v6, v7, v2, v5}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v5, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    new-array v6, v1, [Ljava/lang/Object;

    invoke-interface {v0, v5, v4, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_5

    :cond_7
    :try_start_a
    invoke-virtual {v3, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->J()Lio/sentry/b0;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b0;->a(Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v0

    :try_start_b
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v5

    invoke-virtual {v5}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v6, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v5, v6, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    sget-object v0, Lio/sentry/u1;->GLOBAL:Lio/sentry/u1;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v4, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_7

    :cond_8
    :try_start_c
    invoke-virtual {v3, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->J()Lio/sentry/b0;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/b0;->a(Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_7

    :catchall_6
    move-exception p1

    :try_start_d
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto :goto_7

    :goto_6
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error while closing the Scopes."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_7
    return-void
.end method

.method public final b(J)V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Instance is disabled and this \'flush\' call is a no-op."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/b0;->b(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Error in the \'client.flush\'."

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c()Lio/sentry/transport/p;
    .locals 1

    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b0;->c()Lio/sentry/transport/p;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Lio/sentry/S;
    .locals 4

    .line 2
    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Disabled Scopes cloned."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :cond_0
    new-instance v0, Lio/sentry/L;

    const-string v1, "scopes clone"

    invoke-virtual {p0, v1}, Lio/sentry/v1;->q(Ljava/lang/String;)Lio/sentry/Z;

    move-result-object v1

    check-cast v1, Lio/sentry/v1;

    invoke-direct {v0, v1}, Lio/sentry/L;-><init>(Lio/sentry/v1;)V

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/v1;->clone()Lio/sentry/S;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lio/sentry/i0;
    .locals 4

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'getTransaction\' call is a no-op."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0}, Lio/sentry/l;->d()Lio/sentry/i0;

    move-result-object v0

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b0;->e()Z

    move-result v0

    return v0
.end method

.method public final f(Lio/sentry/f;Lio/sentry/H;)V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v0, "Instance is disabled and this \'addBreadcrumb\' call is a no-op."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0, p1, p2}, Lio/sentry/l;->f(Lio/sentry/f;Lio/sentry/H;)V

    return-void
.end method

.method public final g(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 3

    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Instance is disabled and this \'captureEnvelope\' call is a no-op."

    invoke-interface {p1, p2, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v1}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lio/sentry/b0;->g(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    return-object v0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error while capturing envelope."

    invoke-interface {p2, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final h(Lio/sentry/e1;)Lio/sentry/protocol/t;
    .locals 6

    const-string v0, "profilingContinuousData is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'captureTransaction\' call is a no-op."

    invoke-interface {p1, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v1}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v1

    invoke-interface {v1, p1}, Lio/sentry/b0;->h(Lio/sentry/e1;)Lio/sentry/protocol/t;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v1

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error while capturing profile chunk with id: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lio/sentry/e1;->c:Lio/sentry/protocol/t;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, p1, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final i()V
    .locals 4

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'endSession\' call is a no-op."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0}, Lio/sentry/l;->i()Lio/sentry/F2;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v2, Lio/sentry/hints/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v2}, Lio/sentry/config/a;->e(Ljava/lang/Object;)Lio/sentry/H;

    move-result-object v2

    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Lio/sentry/b0;->d(Lio/sentry/F2;Lio/sentry/H;)V

    :cond_1
    return-void
.end method

.method public final isEnabled()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/b0;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public final j()V
    .locals 5

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Instance is disabled and this \'startSession\' call is a no-op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0}, Lio/sentry/l;->j()Lio/sentry/internal/debugmeta/c;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, v2, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/F2;

    if-eqz v1, :cond_1

    new-instance v3, Lio/sentry/hints/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Lio/sentry/config/a;->e(Ljava/lang/Object;)Lio/sentry/H;

    move-result-object v3

    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v4

    invoke-interface {v4, v1, v3}, Lio/sentry/b0;->d(Lio/sentry/F2;Lio/sentry/H;)V

    :cond_1
    new-instance v1, Lio/sentry/hints/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Lio/sentry/config/a;->e(Ljava/lang/Object;)Lio/sentry/H;

    move-result-object v1

    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v0

    iget-object v2, v2, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/F2;

    invoke-interface {v0, v2, v1}, Lio/sentry/b0;->d(Lio/sentry/F2;Lio/sentry/H;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Session could not be started."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Lio/sentry/P2;Lio/sentry/Q2;)Lio/sentry/i0;
    .locals 4

    iget-object v0, p2, LZd;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lio/sentry/H2;->i:Ljava/lang/String;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    sget-object v2, Lio/sentry/W0;->a:Lio/sentry/W0;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Instance is disabled and this \'startTransaction\' returns a no-op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getIgnoredSpanOrigins()Ljava/util/List;

    move-result-object v0

    iget-object v3, p1, Lio/sentry/H2;->i:Ljava/lang/String;

    invoke-static {v3, v0}, Lio/sentry/util/i;->a(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object p1, p1, Lio/sentry/H2;->i:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Returning no-op for span origin %s as the SDK has been configured to ignore it"

    invoke-interface {v0, v1, v3, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getInstrumenter()Lio/sentry/n0;

    move-result-object v0

    iget-object v3, p1, Lio/sentry/H2;->l:Lio/sentry/n0;

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object p1, p1, Lio/sentry/H2;->l:Lio/sentry/n0;

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/v2;->getInstrumenter()Lio/sentry/n0;

    move-result-object v3

    filled-new-array {p1, v3}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s"

    invoke-interface {v0, v1, v3, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->isTracingEnabled()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "Tracing is disabled and this \'startTransaction\' returns a no-op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object v0, p1, Lio/sentry/H2;->m:Lio/sentry/c;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lio/sentry/c;->d:Ljava/lang/Double;

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0}, Lio/sentry/l;->E()Lio/sentry/l;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/c;

    iget-object v0, v0, Lio/sentry/c;->d:Ljava/lang/Double;

    if-nez v0, :cond_5

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :goto_1
    new-instance v1, Lio/sentry/l;

    invoke-direct {v1, p1, v0}, Lio/sentry/l;-><init>(Lio/sentry/P2;Ljava/lang/Double;)V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getInternalTracesSampler()Lio/sentry/O2;

    move-result-object v0

    invoke-virtual {v0, v1}, Lio/sentry/O2;->a(Lio/sentry/l;)Lvx;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/H2;->a(Lvx;)V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/v2;->getSpanFactory()Lio/sentry/h0;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/v1;->d:Lio/sentry/m;

    invoke-interface {v1, p1, p0, p2, v2}, Lio/sentry/h0;->a(Lio/sentry/P2;Lio/sentry/v1;Lio/sentry/Q2;Lio/sentry/m;)Lio/sentry/i0;

    move-result-object v2

    iget-object p1, v0, Lvx;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, v0, Lvx;->d:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getTransactionProfiler()Lio/sentry/j0;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/j0;->isRunning()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {p1}, Lio/sentry/j0;->start()V

    invoke-interface {p1, v2}, Lio/sentry/j0;->u(Lio/sentry/i0;)V

    goto :goto_2

    :cond_6
    iget-boolean v0, p2, Lio/sentry/Q2;->e:Z

    if-eqz v0, :cond_7

    invoke-interface {p1, v2}, Lio/sentry/j0;->u(Lio/sentry/i0;)V

    :cond_7
    :goto_2
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->isContinuousProfilingEnabled()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getProfileLifecycle()Lio/sentry/g1;

    move-result-object p1

    sget-object v0, Lio/sentry/g1;->TRACE:Lio/sentry/g1;

    if-ne p1, v0, :cond_8

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getContinuousProfiler()Lio/sentry/P;

    move-result-object p1

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/v2;->getInternalTracesSampler()Lio/sentry/O2;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lio/sentry/P;->h(Lio/sentry/g1;Lio/sentry/O2;)V

    :cond_8
    :goto_3
    sget-object p1, Lio/sentry/r1;->ON:Lio/sentry/r1;

    iget-object p2, p2, LZd;->c:Ljava/lang/Object;

    check-cast p2, Lio/sentry/r1;

    if-ne p1, p2, :cond_9

    invoke-interface {v2}, Lio/sentry/g0;->t()V

    :cond_9
    return-object v2
.end method

.method public final l()Lio/sentry/v2;
    .locals 1

    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    iget-object v0, v0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->l()Lio/sentry/v2;

    move-result-object v0

    return-object v0
.end method

.method public final m(Lio/sentry/s1;)V
    .locals 3

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Instance is disabled and this \'configureScope\' call is a no-op."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/sentry/s1;->b(Lio/sentry/X;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error in the \'configureScope\' callback."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final o(Lio/sentry/protocol/A;Lio/sentry/N2;Lio/sentry/H;Lio/sentry/h1;)Lio/sentry/protocol/t;
    .locals 7

    iget-object v3, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    iget-object v0, p1, Lio/sentry/protocol/A;->s:Ljava/util/ArrayList;

    sget-object v6, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string p3, "Instance is disabled and this \'captureTransaction\' call is a no-op."

    new-array p4, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, p3, p4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v6

    :cond_0
    iget-object v1, p1, Lio/sentry/protocol/A;->r:Ljava/lang/Double;

    if-eqz v1, :cond_5

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v4, p1, Lio/sentry/C1;->b:Lio/sentry/protocol/c;

    invoke-virtual {v4}, Lio/sentry/protocol/c;->h()Lio/sentry/H2;

    move-result-object v4

    if-nez v4, :cond_1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    iget-object v4, v4, Lio/sentry/H2;->d:Lvx;

    :goto_0
    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, v4, Lvx;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object p1, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p4, "Transaction %s was dropped due to sampling decision."

    invoke-interface {p2, p3, p4, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/backpressure/b;->a()I

    move-result p1

    if-lez p1, :cond_3

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p1

    sget-object p2, Lio/sentry/clientreport/d;->BACKPRESSURE:Lio/sentry/clientreport/d;

    sget-object p3, Lio/sentry/n;->Transaction:Lio/sentry/n;

    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p1

    sget-object p3, Lio/sentry/n;->Span:Lio/sentry/n;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p4

    add-int/lit8 p4, p4, 0x1

    int-to-long v0, p4

    invoke-interface {p1, p2, p3, v0, v1}, Lio/sentry/clientreport/f;->c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    return-object v6

    :cond_3
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p1

    sget-object p2, Lio/sentry/clientreport/d;->SAMPLE_RATE:Lio/sentry/clientreport/d;

    sget-object p3, Lio/sentry/n;->Transaction:Lio/sentry/n;

    invoke-interface {p1, p2, p3}, Lio/sentry/clientreport/f;->b(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object p1

    sget-object p3, Lio/sentry/n;->Span:Lio/sentry/n;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p4

    add-int/lit8 p4, p4, 0x1

    int-to-long v0, p4

    invoke-interface {p1, p2, p3, v0, v1}, Lio/sentry/clientreport/f;->c(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    return-object v6

    :cond_4
    :try_start_0
    invoke-virtual {v3}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    :try_start_1
    invoke-interface/range {v0 .. v5}, Lio/sentry/b0;->i(Lio/sentry/protocol/A;Lio/sentry/N2;Lio/sentry/X;Lio/sentry/H;Lio/sentry/h1;)Lio/sentry/protocol/t;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, p1

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object p3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Error while capturing transaction with id: "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p3, p4, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v6

    :cond_5
    move-object v1, p1

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    iget-object p3, v1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Transaction: %s is not finished and this \'captureTransaction\' call is a no-op."

    invoke-interface {p1, p2, p4, p3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v6
.end method

.method public final p(Lio/sentry/x2;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 3

    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Instance is disabled and this \'captureReplay\' call is a no-op."

    invoke-interface {p1, p2, v2, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v2

    invoke-interface {v2, p1, v0, p2}, Lio/sentry/b0;->f(Lio/sentry/x2;Lio/sentry/X;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error while capturing replay"

    invoke-interface {p2, v0, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final q(Ljava/lang/String;)Lio/sentry/Z;
    .locals 3

    new-instance p1, Lio/sentry/v1;

    iget-object v0, p0, Lio/sentry/v1;->a:Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->clone()Lio/sentry/X;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/v1;->b:Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->clone()Lio/sentry/X;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/v1;->c:Lio/sentry/X;

    invoke-direct {p1, v0, v1, v2}, Lio/sentry/v1;-><init>(Lio/sentry/X;Lio/sentry/X;Lio/sentry/X;)V

    return-object p1
.end method

.method public final r(Lio/sentry/R1;Lio/sentry/H;)Lio/sentry/protocol/t;
    .locals 5

    iget-object v0, p0, Lio/sentry/v1;->e:Lio/sentry/l;

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {p0}, Lio/sentry/v1;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v0, "Instance is disabled and this \'captureEvent\' call is a no-op."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Lio/sentry/l;->p(Lio/sentry/R1;)V

    invoke-virtual {v0}, Lio/sentry/l;->J()Lio/sentry/b0;

    move-result-object v2

    invoke-interface {v2, p1, v0, p2}, Lio/sentry/b0;->j(Lio/sentry/R1;Lio/sentry/X;Lio/sentry/H;)Lio/sentry/protocol/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/l;->v(Lio/sentry/protocol/t;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p2

    invoke-virtual {p0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error while capturing event with id: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lio/sentry/C1;->a:Lio/sentry/protocol/t;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, p1, p2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method
