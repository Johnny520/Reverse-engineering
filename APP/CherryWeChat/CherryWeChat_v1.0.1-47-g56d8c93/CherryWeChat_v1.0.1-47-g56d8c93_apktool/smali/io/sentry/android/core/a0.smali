.class public final synthetic Lio/sentry/android/core/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/Z;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lio/sentry/android/core/a0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/a0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/a0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lio/sentry/android/core/a0;->a:I

    iput-object p1, p0, Lio/sentry/android/core/a0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/a0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/a0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget v0, p0, Lio/sentry/android/core/a0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/a0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    iget-object v1, p0, Lio/sentry/android/core/a0;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/Z;

    iget-object v2, p0, Lio/sentry/android/core/a0;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->k:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v3

    :try_start_0
    iget-boolean v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->f:Z

    if-nez v4, :cond_4

    iget-boolean v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->g:Z

    if-nez v4, :cond_4

    iget-object v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/h0;

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v4, Lio/sentry/android/core/h0;

    invoke-direct {v4, v0, v1, v2}, Lio/sentry/android/core/h0;-><init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/Z;Lio/sentry/android/core/SentryAndroidOptions;)V

    iput-object v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/h0;

    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h:Landroid/content/IntentFilter;

    const/4 v4, 0x0

    if-nez v1, :cond_1

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    iput-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h:Landroid/content/IntentFilter;

    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->e:[Ljava/lang/String;

    array-length v5, v1

    move v6, v4

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v1, v6

    iget-object v8, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h:Landroid/content/IntentFilter;

    invoke-virtual {v8, v7}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_3

    :cond_1
    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Landroid/os/HandlerThread;

    if-nez v1, :cond_2

    new-instance v1, Landroid/os/HandlerThread;

    const-string v5, "SystemEventsReceiver"

    const/16 v6, 0xa

    invoke-direct {v1, v5, v6}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Landroid/os/HandlerThread;

    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    new-instance v9, Landroid/os/Handler;

    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v9, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->a:Landroid/content/Context;

    iget-object v6, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/h0;

    iget-object v7, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h:Landroid/content/IntentFilter;

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    const-string v8, "The ILogger object is required."

    invoke-static {v8, v1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x21

    if-lt v1, v8, :cond_3

    const/4 v8, 0x0

    const/4 v10, 0x4

    invoke-virtual/range {v5 .. v10}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v5, v6, v7, v1, v9}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    :goto_1
    iget-object v0, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "SystemEventsBreadcrumbsIntegration installed."

    new-array v6, v4, [Ljava/lang/Object;

    invoke-interface {v0, v1, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "SystemEventsBreadcrumbs"

    invoke-static {v0}, Lio/sentry/config/a;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-virtual {v2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "Failed to initialize SystemEventsBreadcrumbsIntegration."

    invoke-interface {v1, v2, v4, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    :goto_2
    invoke-virtual {v3}, Lio/sentry/r;->close()V

    return-void

    :goto_3
    :try_start_3
    invoke-virtual {v3}, Lio/sentry/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/a0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;

    iget-object v1, p0, Lio/sentry/android/core/a0;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/v2;

    iget-object v2, p0, Lio/sentry/android/core/a0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->d:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v3

    :try_start_4
    iget-boolean v4, v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->c:Z

    if-nez v4, :cond_5

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->d(Lio/sentry/v2;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v1, v0

    goto :goto_6

    :cond_5
    :goto_5
    invoke-virtual {v3}, Lio/sentry/r;->close()V

    return-void

    :goto_6
    :try_start_5
    invoke-virtual {v3}, Lio/sentry/r;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v1

    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/core/a0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/g;

    iget-object v1, p0, Lio/sentry/android/core/a0;->c:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lio/sentry/v2;

    iget-object v1, p0, Lio/sentry/android/core/a0;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/Z;

    iget-object v9, v0, Lio/sentry/android/core/g;->m:Ljava/util/ArrayList;

    iget-object v2, v0, Lio/sentry/android/core/g;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_a

    :cond_6
    new-instance v10, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, v0, Lio/sentry/android/core/g;->w:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v11

    :try_start_6
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/d1;

    move-object v3, v2

    new-instance v2, Lio/sentry/e1;

    move-object v4, v3

    iget-object v3, v4, Lio/sentry/d1;->a:Lio/sentry/protocol/t;

    move-object v5, v4

    iget-object v4, v5, Lio/sentry/d1;->b:Lio/sentry/protocol/t;

    move-object v6, v5

    iget-object v5, v6, Lio/sentry/d1;->d:Ljava/io/File;

    move-object v7, v6

    iget-object v6, v7, Lio/sentry/d1;->c:Ljava/util/concurrent/ConcurrentHashMap;

    iget-wide v12, v7, Lio/sentry/d1;->e:D

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-direct/range {v2 .. v8}, Lio/sentry/e1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/t;Ljava/io/File;Ljava/util/Map;Ljava/lang/Double;Lio/sentry/v2;)V

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :catchall_5
    move-exception v0

    move-object v1, v0

    goto :goto_b

    :cond_7
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    invoke-virtual {v11}, Lio/sentry/r;->close()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/e1;

    invoke-interface {v1, v2}, Lio/sentry/Z;->h(Lio/sentry/e1;)Lio/sentry/protocol/t;

    goto :goto_9

    :cond_8
    :goto_a
    return-void

    :goto_b
    :try_start_7
    invoke-virtual {v11}, Lio/sentry/r;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_c

    :catchall_6
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v1

    :pswitch_2
    iget-object v0, p0, Lio/sentry/android/core/a0;->b:Ljava/lang/Object;

    check-cast v0, LFu;

    iget-object v1, p0, Lio/sentry/android/core/a0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    iget-object v2, p0, Lio/sentry/android/core/a0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_d

    :catchall_7
    if-eqz v2, :cond_9

    iget-object v0, v0, LFu;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Failed to execute "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_9
    :goto_d
    return-void

    :pswitch_3
    iget-object v0, p0, Lio/sentry/android/core/a0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    iget-object v1, p0, Lio/sentry/android/core/a0;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v2, p0, Lio/sentry/android/core/a0;->d:Ljava/lang/Object;

    check-cast v2, Lio/sentry/Z;

    :try_start_9
    iget-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "SendCachedEnvelopeIntegration, not trying to send after closing."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_f

    :catchall_8
    move-exception v0

    goto :goto_e

    :cond_a
    iget-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v3

    if-nez v3, :cond_b

    invoke-virtual {v1}, Lio/sentry/v2;->getConnectionStatusProvider()Lio/sentry/O;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->d:Lio/sentry/O;

    invoke-interface {v3, v0}, Lio/sentry/O;->h(Lio/sentry/N;)Z

    iget-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->a:Lio/sentry/x1;

    invoke-virtual {v3, v2, v1}, Lio/sentry/x1;->a(Lio/sentry/Z;Lio/sentry/v2;)Lid;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->g:Lid;

    :cond_b
    iget-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->d:Lio/sentry/O;

    if-eqz v3, :cond_c

    invoke-interface {v3}, Lio/sentry/O;->g()Lio/sentry/M;

    move-result-object v3

    sget-object v5, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    if-ne v3, v5, :cond_c

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "SendCachedEnvelopeIntegration, no connection."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_f

    :cond_c
    invoke-interface {v2}, Lio/sentry/Z;->c()Lio/sentry/transport/p;

    move-result-object v2

    if-eqz v2, :cond_d

    sget-object v3, Lio/sentry/n;->All:Lio/sentry/n;

    invoke-virtual {v2, v3}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "SendCachedEnvelopeIntegration, rate limiting active."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_f

    :cond_d
    iget-object v0, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->g:Lid;

    if-nez v0, :cond_e

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "SendCachedEnvelopeIntegration factory is null."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_f

    :cond_e
    invoke-virtual {v0}, Lid;->a()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    goto :goto_f

    :goto_e
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Failed trying to send cached events."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_f
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
