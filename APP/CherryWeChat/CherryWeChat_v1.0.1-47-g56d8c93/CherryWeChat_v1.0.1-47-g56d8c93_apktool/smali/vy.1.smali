.class public final Lvy;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lvy;->a:I

    iput-object p2, p0, Lvy;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    iget-object v0, v0, Lio/sentry/android/core/internal/util/b;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    iget-object v0, v0, Lio/sentry/android/core/internal/util/b;->f:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v2, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/core/internal/util/b;

    const/4 v3, 0x0

    iput-object v3, v2, Lio/sentry/android/core/internal/util/b;->h:Landroid/net/NetworkCapabilities;

    iget-object v2, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/core/internal/util/b;

    iput-object v3, v2, Lio/sentry/android/core/internal/util/b;->i:Landroid/net/Network;

    iget-object v2, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/core/internal/util/b;

    iget-object v3, v2, Lio/sentry/android/core/internal/util/b;->d:Lio/sentry/android/core/internal/util/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Lio/sentry/android/core/internal/util/b;->j:J

    iget-object v2, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/core/internal/util/b;

    iget-object v2, v2, Lio/sentry/android/core/internal/util/b;->b:Lio/sentry/v2;

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v4, "Cache cleared - network lost/unavailable"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v2, v3, v4, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/internal/util/b;

    iget-object v1, v1, Lio/sentry/android/core/internal/util/b;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/N;

    sget-object v3, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    invoke-interface {v2, v3}, Lio/sentry/N;->i(Lio/sentry/M;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final onAvailable(Landroid/net/Network;)V
    .locals 3

    iget v0, p0, Lvy;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    iput-object p1, v0, Lio/sentry/android/core/internal/util/b;->i:Landroid/net/Network;

    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    iget-object v0, v0, Lio/sentry/android/core/internal/util/b;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/android/core/internal/util/b;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/android/core/internal/util/b;->o:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v2, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    goto :goto_3

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    :cond_1
    :goto_3
    return-void

    :pswitch_0
    new-instance p1, LS4;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LS4;-><init>(Lvy;Z)V

    invoke-static {}, LvD;->f()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 7

    iget v0, p0, Lvy;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    iget-object v0, v0, Lio/sentry/android/core/internal/util/b;->i:Landroid/net/Network;

    invoke-virtual {p1, v0}, Landroid/net/Network;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_a

    :cond_0
    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    iget-object v0, v0, Lio/sentry/android/core/internal/util/b;->h:Landroid/net/NetworkCapabilities;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    if-eq v3, v2, :cond_3

    goto :goto_4

    :cond_3
    if-nez v0, :cond_4

    if-nez p2, :cond_4

    goto/16 :goto_8

    :cond_4
    sget-object v2, Lio/sentry/android/core/internal/util/b;->q:[I

    array-length v3, v2

    move v4, v1

    :goto_2
    if-ge v4, v3, :cond_6

    aget v5, v2, v4

    if-eqz v5, :cond_5

    invoke-virtual {v0, v5}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v6

    invoke-virtual {p2, v5}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v5

    if-eq v6, v5, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    sget-object v2, Lio/sentry/android/core/internal/util/b;->p:[I

    array-length v3, v2

    :goto_3
    if-ge v1, v3, :cond_9

    aget v4, v2, v1

    invoke-virtual {v0, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v5

    invoke-virtual {p2, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v4

    if-eq v5, v4, :cond_8

    :goto_4
    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    invoke-virtual {v0, p2}, Lio/sentry/android/core/internal/util/b;->t(Landroid/net/NetworkCapabilities;)V

    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/b;->m()Lio/sentry/M;

    move-result-object v0

    iget-object v1, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/internal/util/b;

    iget-object v1, v1, Lio/sentry/android/core/internal/util/b;->f:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/core/internal/util/b;

    iget-object v2, v2, Lio/sentry/android/core/internal/util/b;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/N;

    invoke-interface {v3, v0}, Lio/sentry/N;->i(Lio/sentry/M;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Lio/sentry/r;->close()V

    goto :goto_8

    :goto_6
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw p1

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_9
    :goto_8
    sget-object v0, Lio/sentry/android/core/internal/util/b;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_2
    sget-object v1, Lio/sentry/android/core/internal/util/b;->o:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v2, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_9

    :catchall_2
    move-exception p1

    goto :goto_b

    :cond_a
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    :goto_a
    return-void

    :goto_b
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_c

    :catchall_3
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 3

    iget v0, p0, Lvy;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvy;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/b;

    iget-object v0, v0, Lio/sentry/android/core/internal/util/b;->i:Landroid/net/Network;

    invoke-virtual {p1, v0}, Landroid/net/Network;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lvy;->a()V

    sget-object v0, Lio/sentry/android/core/internal/util/b;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/android/core/internal/util/b;->o:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v2, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    :goto_1
    return-void

    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    :pswitch_0
    new-instance p1, LS4;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LS4;-><init>(Lvy;Z)V

    invoke-static {}, LvD;->f()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onUnavailable()V
    .locals 3

    iget v0, p0, Lvy;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/net/ConnectivityManager$NetworkCallback;->onUnavailable()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lvy;->a()V

    sget-object v0, Lio/sentry/android/core/internal/util/b;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/android/core/internal/util/b;->o:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v2}, Landroid/net/ConnectivityManager$NetworkCallback;->onUnavailable()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
