.class public final synthetic Lio/sentry/android/core/internal/util/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/sentry/android/core/internal/util/b;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/internal/util/b;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/core/internal/util/a;->a:I

    iput-object p1, p0, Lio/sentry/android/core/internal/util/a;->b:Lio/sentry/android/core/internal/util/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, Lio/sentry/android/core/internal/util/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/internal/util/a;->b:Lio/sentry/android/core/internal/util/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/sentry/android/core/internal/util/b;->t(Landroid/net/NetworkCapabilities;)V

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/b;->m()Lio/sentry/M;

    move-result-object v2

    sget-object v3, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    if-ne v2, v3, :cond_1

    iget-object v3, v0, Lio/sentry/android/core/internal/util/b;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v3, Lio/sentry/android/core/internal/util/b;->n:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v3

    :try_start_0
    sget-object v4, Lio/sentry/android/core/internal/util/b;->o:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v5, v1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Lio/sentry/r;->close()V

    goto :goto_3

    :goto_1
    :try_start_1
    invoke-virtual {v3}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0

    :cond_1
    :goto_3
    iget-object v1, v0, Lio/sentry/android/core/internal/util/b;->f:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_2
    iget-object v3, v0, Lio/sentry/android/core/internal/util/b;->e:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/N;

    invoke-interface {v4, v2}, Lio/sentry/N;->i(Lio/sentry/M;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_5

    :cond_2
    invoke-virtual {v1}, Lio/sentry/r;->close()V

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/b;->l()V

    return-void

    :goto_5
    :try_start_3
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/internal/util/a;->b:Lio/sentry/android/core/internal/util/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/sentry/android/core/internal/util/b;->s(Z)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/core/internal/util/a;->b:Lio/sentry/android/core/internal/util/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/sentry/android/core/internal/util/b;->s(Z)V

    sget-object v1, Lio/sentry/android/core/internal/util/b;->n:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_4
    sget-object v2, Lio/sentry/android/core/internal/util/b;->o:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    sget-object v1, Lio/sentry/android/core/internal/util/b;->l:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_5
    sput-object v2, Lio/sentry/android/core/internal/util/b;->m:Landroid/net/ConnectivityManager;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    sget-object v1, Lio/sentry/android/core/E;->e:Lio/sentry/android/core/E;

    invoke-virtual {v1, v0}, Lio/sentry/android/core/E;->l(Lio/sentry/android/core/B;)V

    return-void

    :catchall_4
    move-exception v0

    :try_start_6
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v0

    :catchall_6
    move-exception v0

    :try_start_7
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_8

    :catchall_7
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v0

    :pswitch_2
    iget-object v0, p0, Lio/sentry/android/core/internal/util/a;->b:Lio/sentry/android/core/internal/util/b;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/b;->l()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
