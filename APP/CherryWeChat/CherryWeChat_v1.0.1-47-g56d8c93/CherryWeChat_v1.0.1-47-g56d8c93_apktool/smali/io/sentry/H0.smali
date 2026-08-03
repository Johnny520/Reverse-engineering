.class public final Lio/sentry/H0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/sentry/H0;->a:I

    iput-object p2, p0, Lio/sentry/H0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lio/sentry/H0;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lio/sentry/H0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    move-object v0, v2

    check-cast v0, Lio/sentry/logger/b;

    :cond_0
    invoke-virtual {v0}, Lio/sentry/logger/b;->c()V

    iget-object v2, v0, Lio/sentry/logger/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v2

    const/16 v3, 0x64

    if-ge v2, v3, :cond_0

    sget-object v2, Lio/sentry/logger/b;->f:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v2

    :try_start_0
    iget-object v3, v0, Lio/sentry/logger/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Lio/sentry/logger/b;->d(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v2}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0

    :pswitch_0
    check-cast v2, Lio/sentry/android/replay/capture/b;

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;

    return-void

    :pswitch_1
    check-cast v2, Lio/sentry/android/replay/capture/b;

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;

    return-void

    :pswitch_2
    check-cast v2, Lio/sentry/android/replay/capture/d;

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/d;->a()Ljava/lang/Object;

    return-void

    :pswitch_3
    check-cast v2, Lio/sentry/android/replay/capture/b;

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;

    return-void

    :pswitch_4
    check-cast v2, Lio/sentry/android/replay/capture/d;

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/d;->a()Ljava/lang/Object;

    return-void

    :pswitch_5
    check-cast v2, Lio/sentry/android/replay/capture/b;

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;

    return-void

    :pswitch_6
    check-cast v2, Lio/sentry/v2;

    invoke-virtual {v2}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "Cache dir is not set, not moving the previous session."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, Lio/sentry/v2;->isEnableAutoSessionTracking()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Session tracking is disabled, bailing from previous session mover."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lio/sentry/v2;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    move-result-object v1

    instance-of v2, v1, Lio/sentry/cache/c;

    if-eqz v2, :cond_4

    sget-object v2, Lio/sentry/cache/c;->i:Ljava/nio/charset/Charset;

    new-instance v2, Ljava/io/File;

    const-string v3, "session.json"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/io/File;

    const-string v4, "previous_session.json"

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v1, Lio/sentry/cache/c;

    invoke-virtual {v1, v2, v3}, Lio/sentry/cache/c;->c(Ljava/io/File;Ljava/io/File;)V

    iget-object v0, v1, Lio/sentry/cache/c;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_4
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
