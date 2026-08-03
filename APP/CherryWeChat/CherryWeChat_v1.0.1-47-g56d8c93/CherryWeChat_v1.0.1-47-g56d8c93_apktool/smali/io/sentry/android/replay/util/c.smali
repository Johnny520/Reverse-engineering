.class public final synthetic Lio/sentry/android/replay/util/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/sentry/android/replay/util/c;->a:I

    iput-object p2, p0, Lio/sentry/android/replay/util/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/replay/util/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lio/sentry/android/replay/util/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/replay/util/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Lio/sentry/android/replay/util/c;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/c;

    iget-object v0, v0, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    const-string v2, ".scope-cache"

    const-string v3, "contexts.json"

    invoke-static {v0, v1, v2, v3}, Lio/sentry/cache/a;->d(Lio/sentry/v2;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/replay/util/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Lio/sentry/android/replay/util/c;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    iget-object v0, v0, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Serialization task failed"

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/replay/util/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Lio/sentry/android/replay/util/c;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "transaction.json"

    if-nez v1, :cond_0

    invoke-virtual {v0, v2}, Lio/sentry/cache/f;->f(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    const-string v3, ".scope-cache"

    invoke-static {v0, v1, v3, v2}, Lio/sentry/cache/a;->d(Lio/sentry/v2;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void

    :pswitch_2
    iget-object v0, p0, Lio/sentry/android/replay/util/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Lio/sentry/android/replay/util/c;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/t;

    iget-object v0, v0, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    const-string v2, ".scope-cache"

    const-string v3, "replay.json"

    invoke-static {v0, v1, v2, v3}, Lio/sentry/cache/a;->d(Lio/sentry/v2;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/sentry/android/replay/util/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Lio/sentry/android/replay/util/c;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/f;

    :try_start_1
    iget-object v2, v0, Lio/sentry/cache/f;->b:Lio/sentry/util/d;

    invoke-virtual {v2}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/cache/tape/e;

    invoke-virtual {v2, v1}, Lio/sentry/cache/tape/e;->q(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    iget-object v0, v0, Lio/sentry/cache/f;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Failed to add breadcrumb to file queue"

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void

    :pswitch_4
    iget-object v0, p0, Lio/sentry/android/replay/util/c;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/S1;

    iget-object v1, p0, Lio/sentry/android/replay/util/c;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/v2;

    :try_start_2
    invoke-virtual {v0}, Lio/sentry/S1;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Failed to execute task ReplayIntegration.finalize_previous_replay"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
