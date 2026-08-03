.class public final Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/o0;
.implements Ljava/io/Closeable;
.implements Lio/sentry/android/core/B;


# instance fields
.field public final a:Landroid/content/Context;

.field public volatile b:Lio/sentry/android/core/h0;

.field public c:Lio/sentry/android/core/SentryAndroidOptions;

.field public d:Lio/sentry/w1;

.field public final e:[Ljava/lang/String;

.field public volatile f:Z

.field public volatile g:Z

.field public volatile h:Landroid/content/IntentFilter;

.field public volatile i:Landroid/os/HandlerThread;

.field public final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final k:Lio/sentry/util/a;

.field public l:Lio/sentry/android/core/g0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 20

    move-object/from16 v0, p0

    const-string v18, "android.os.action.DEVICE_IDLE_MODE_CHANGED"

    const-string v19, "android.os.action.POWER_SAVE_MODE_CHANGED"

    const-string v1, "android.intent.action.ACTION_SHUTDOWN"

    const-string v2, "android.intent.action.AIRPLANE_MODE"

    const-string v3, "android.intent.action.BATTERY_CHANGED"

    const-string v4, "android.intent.action.CAMERA_BUTTON"

    const-string v5, "android.intent.action.CONFIGURATION_CHANGED"

    const-string v6, "android.intent.action.DATE_CHANGED"

    const-string v7, "android.intent.action.DEVICE_STORAGE_LOW"

    const-string v8, "android.intent.action.DEVICE_STORAGE_OK"

    const-string v9, "android.intent.action.DOCK_EVENT"

    const-string v10, "android.intent.action.DREAMING_STARTED"

    const-string v11, "android.intent.action.DREAMING_STOPPED"

    const-string v12, "android.intent.action.INPUT_METHOD_CHANGED"

    const-string v13, "android.intent.action.LOCALE_CHANGED"

    const-string v14, "android.intent.action.SCREEN_OFF"

    const-string v15, "android.intent.action.SCREEN_ON"

    const-string v16, "android.intent.action.TIMEZONE_CHANGED"

    const-string v17, "android.intent.action.TIME_SET"

    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    iput-boolean v2, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->f:Z

    iput-boolean v2, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->g:Z

    const/4 v3, 0x0

    iput-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h:Landroid/content/IntentFilter;

    iput-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Landroid/os/HandlerThread;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v2, Lio/sentry/util/a;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v2, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->k:Lio/sentry/util/a;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    iput-object v2, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->a:Landroid/content/Context;

    iput-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->e:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->k:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->f:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h:Landroid/content/IntentFilter;

    iget-object v2, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Landroid/os/HandlerThread;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->quit()Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iput-object v1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i:Landroid/os/HandlerThread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    sget-object v0, Lio/sentry/android/core/E;->e:Lio/sentry/android/core/E;

    invoke-virtual {v0, p0}, Lio/sentry/android/core/E;->l(Lio/sentry/android/core/B;)V

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v0

    new-instance v1, Lio/sentry/S1;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    invoke-virtual {p0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->l()V

    :goto_1
    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "SystemEventsBreadcrumbsIntegration removed."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void

    :goto_2
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->d:Lio/sentry/w1;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->g:Z

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->d:Lio/sentry/w1;

    iget-object v1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p0, v0, v1}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i(Lio/sentry/w1;Lio/sentry/android/core/SentryAndroidOptions;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v0

    new-instance v1, Lio/sentry/S1;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->l()V

    return-void
.end method

.method public final i(Lio/sentry/w1;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->g:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/h0;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v0

    new-instance v1, Lio/sentry/android/core/a0;

    invoke-direct {v1, p0, p1, p2}, Lio/sentry/android/core/a0;-><init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/Z;Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-interface {v0, v1}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->k:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->g:Z

    iget-object v1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/h0;

    const/4 v2, 0x0

    iput-object v2, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->b:Lio/sentry/android/core/h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

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

.method public final p(Lio/sentry/v2;)V
    .locals 3

    instance-of v0, p1, Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "SentryAndroidOptions is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    sget-object v0, Lio/sentry/w1;->a:Lio/sentry/w1;

    iput-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->d:Lio/sentry/w1;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object v1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "SystemEventsBreadcrumbsIntegration enabled: %s"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lio/sentry/android/core/E;->e:Lio/sentry/android/core/E;

    invoke-virtual {p1, p0}, Lio/sentry/android/core/E;->d(Lio/sentry/android/core/B;)V

    invoke-static {}, Lio/sentry/android/core/H;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->d:Lio/sentry/w1;

    iget-object v0, p0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p0, p1, v0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->i(Lio/sentry/w1;Lio/sentry/android/core/SentryAndroidOptions;)V

    :cond_1
    return-void
.end method
