.class public final synthetic Lio/sentry/android/core/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;JLandroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/android/core/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/z;->c:Ljava/lang/Object;

    iput-wide p2, p0, Lio/sentry/android/core/z;->b:J

    iput-object p4, p0, Lio/sentry/android/core/z;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/h;Lio/sentry/android/replay/n;J)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/android/core/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/z;->c:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/z;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lio/sentry/android/core/z;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    iget v0, p0, Lio/sentry/android/core/z;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/z;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lio/sentry/android/replay/capture/h;

    iget-object v0, p0, Lio/sentry/android/core/z;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/n;

    iget-object v1, v4, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v1, :cond_0

    iget-wide v2, p0, Lio/sentry/android/core/z;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/replay/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, v4, Lio/sentry/android/replay/capture/h;->t:Lio/sentry/transport/f;

    invoke-interface {v0}, Lio/sentry/transport/f;->b()J

    move-result-wide v0

    iget-object v2, v4, Lio/sentry/android/replay/capture/h;->r:Lio/sentry/v2;

    invoke-virtual {v2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v2

    iget-wide v2, v2, Lio/sentry/z2;->g:J

    sub-long v2, v0, v2

    iget-object v8, v4, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    const/4 v11, 0x0

    if-eqz v8, :cond_1

    new-instance v9, LIv;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iget-object v0, v8, Lio/sentry/android/replay/j;->h:Ljava/util/ArrayList;

    new-instance v5, Lio/sentry/android/replay/i;

    const/4 v10, 0x0

    move-wide v6, v2

    invoke-direct/range {v5 .. v10}, Lio/sentry/android/replay/i;-><init>(JLjava/lang/Object;Ljava/io/Serializable;I)V

    invoke-static {v0, v5}, Lxa;->e0(Ljava/util/ArrayList;Lfj;)V

    iget-object v0, v9, LIv;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v0, v11

    :goto_0
    iget-object v1, v4, Lio/sentry/android/replay/capture/e;->l:Lio/sentry/android/replay/capture/c;

    sget-object v5, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v6, 0x2

    aget-object v5, v5, v6

    iget-object v5, v1, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    new-instance v6, Lio/sentry/android/replay/capture/b;

    iget-object v7, v1, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/android/replay/capture/e;

    const/4 v8, 0x3

    invoke-direct {v6, v5, v0, v7, v8}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V

    iget-object v0, v1, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/android/replay/capture/e;

    iget-object v1, v0, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v5

    invoke-interface {v5}, Lio/sentry/util/thread/a;->c()Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v0, v0, Lio/sentry/android/replay/capture/e;->e:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v5, Lio/sentry/H0;

    const/4 v7, 0x6

    invoke-direct {v5, v7, v6}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    const-string v6, "CaptureStrategy.runInBackground"

    invoke-static {v0, v1, v6, v5}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_2
    :try_start_0
    invoke-virtual {v6}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v6, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {v1, v5, v6, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    iget-object v0, v4, Lio/sentry/android/replay/capture/h;->v:Ljava/util/ArrayList;

    new-instance v5, LFv;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lio/sentry/android/replay/i;

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lio/sentry/android/replay/i;-><init>(JLjava/lang/Object;Ljava/io/Serializable;I)V

    invoke-static {v0, v1}, Lxa;->e0(Ljava/util/ArrayList;Lfj;)V

    iget-boolean v1, v5, LFv;->a:Z

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_6

    check-cast v2, Lio/sentry/android/replay/capture/k;

    iget-object v4, v2, Lio/sentry/android/replay/capture/k;->a:Lio/sentry/x2;

    iput v1, v4, Lio/sentry/x2;->t:I

    iget-object v2, v2, Lio/sentry/android/replay/capture/k;->b:Lio/sentry/m1;

    iget-object v2, v2, Lio/sentry/m1;->b:Ljava/util/List;

    if-eqz v2, :cond_5

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/rrweb/b;

    instance-of v5, v4, Lio/sentry/rrweb/m;

    if-eqz v5, :cond_4

    check-cast v4, Lio/sentry/rrweb/m;

    iput v1, v4, Lio/sentry/rrweb/m;->d:I

    goto :goto_3

    :cond_5
    move v1, v3

    goto :goto_2

    :cond_6
    invoke-static {}, Lsa;->c0()V

    throw v11

    :cond_7
    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/z;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    iget-object v1, p0, Lio/sentry/android/core/z;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/Configuration;

    iget-object v2, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->b:Lio/sentry/w1;

    if-eqz v2, :cond_b

    iget-object v2, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->orientation:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_9

    const/4 v3, 0x2

    if-eq v2, v3, :cond_8

    const/4 v2, 0x0

    goto :goto_4

    :cond_8
    sget-object v2, Lio/sentry/protocol/e;->LANDSCAPE:Lio/sentry/protocol/e;

    goto :goto_4

    :cond_9
    sget-object v2, Lio/sentry/protocol/e;->PORTRAIT:Lio/sentry/protocol/e;

    :goto_4
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_a
    const-string v2, "undefined"

    :goto_5
    new-instance v3, Lio/sentry/f;

    iget-wide v4, p0, Lio/sentry/android/core/z;->b:J

    invoke-direct {v3, v4, v5}, Lio/sentry/f;-><init>(J)V

    const-string v4, "navigation"

    iput-object v4, v3, Lio/sentry/f;->e:Ljava/lang/String;

    const-string v4, "device.orientation"

    iput-object v4, v3, Lio/sentry/f;->g:Ljava/lang/String;

    const-string v4, "position"

    invoke-virtual {v3, v4, v2}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    iput-object v2, v3, Lio/sentry/f;->i:Lio/sentry/a2;

    new-instance v2, Lio/sentry/H;

    invoke-direct {v2}, Lio/sentry/H;-><init>()V

    const-string v4, "android:configuration"

    invoke-virtual {v2, v4, v1}, Lio/sentry/H;->c(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->b:Lio/sentry/w1;

    invoke-virtual {v0, v3, v2}, Lio/sentry/w1;->f(Lio/sentry/f;Lio/sentry/H;)V

    :cond_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
