.class public final Lio/sentry/android/core/SentryInitProvider;
.super Lio/sentry/android/core/N;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/sentry/android/core/N;-><init>()V

    return-void
.end method


# virtual methods
.method public final attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2

    const-class v0, Lio/sentry/android/core/SentryInitProvider;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "An applicationId is required to fulfill the manifest placeholder."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()Z
    .locals 10

    new-instance v0, Lio/sentry/android/core/q;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/sentry/android/core/q;-><init>(I)V

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    sget-object v1, Lio/sentry/a2;->FATAL:Lio/sentry/a2;

    const-string v3, "App. Context from ContentProvider is null"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3, v4}, Lio/sentry/android/core/q;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_0
    const/4 v3, 0x1

    :try_start_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x21

    if-lt v4, v5, :cond_1

    sget-object v4, Lio/sentry/android/core/H;->d:LBb;

    invoke-virtual {v4, v1}, LBb;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ApplicationInfo;

    goto :goto_0

    :cond_1
    sget-object v4, Lio/sentry/android/core/H;->e:LBb;

    invoke-virtual {v4, v1}, LBb;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ApplicationInfo;

    :goto_0
    if-eqz v4, :cond_2

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    const-string v5, "io.sentry.auto-init"

    invoke-static {v4, v0, v5, v3}, Lio/sentry/android/core/H;->e(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v4

    goto :goto_3

    :cond_3
    :goto_2
    move v4, v3

    goto :goto_4

    :goto_3
    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v6, "Failed to read auto-init from android manifest metadata."

    invoke-virtual {v0, v5, v6, v4}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_4
    if-eqz v4, :cond_8

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".test"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    :try_start_1
    const-string v4, "activity"

    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/ActivityManager;

    invoke-virtual {v4}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/ActivityManager$AppTask;

    invoke-virtual {v5}, Landroid/app/ActivityManager$AppTask;->getTaskInfo()Landroid/app/ActivityManager$RecentTaskInfo;

    move-result-object v5

    invoke-static {v5}, Lio/sentry/android/core/F;->b(Landroid/app/ActivityManager$RecentTaskInfo;)Landroid/content/Intent;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "androidx.compose.ui.tooling.PreviewActivity"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v5, :cond_4

    move v4, v3

    goto :goto_5

    :catchall_1
    :cond_5
    move v4, v2

    :goto_5
    if-nez v4, :cond_8

    new-instance v4, Lio/sentry/android/core/T;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lio/sentry/android/core/T;-><init>(I)V

    const-string v5, "Failed to initialize Sentry\'s SDK"

    const-string v6, "Fatal error during SentryAndroid.init(...)"

    :try_start_2
    sget-object v7, Lio/sentry/android/core/b0;->b:Lio/sentry/util/a;

    invoke-virtual {v7}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v7
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    new-instance v8, Lio/sentry/K0;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    new-instance v9, LQ9;

    invoke-direct {v9, v0, v1, v4}, LQ9;-><init>(Lio/sentry/android/core/q;Landroid/content/Context;Lio/sentry/android/core/T;)V

    invoke-static {v8, v9}, Lio/sentry/z1;->c(Lio/sentry/K0;LQ9;)V

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v1

    invoke-static {}, Lio/sentry/android/core/H;->d()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v4

    invoke-virtual {v4}, Lio/sentry/v2;->isEnableAutoSessionTracking()Z

    move-result v4

    if-eqz v4, :cond_6

    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v2, Lrl;

    const/16 v8, 0x9

    invoke-direct {v2, v8, v4}, Lrl;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v2}, Lio/sentry/Z;->m(Lio/sentry/s1;)V

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {v1}, Lio/sentry/Z;->j()V

    goto :goto_6

    :catchall_2
    move-exception v1

    goto :goto_7

    :cond_6
    :goto_6
    invoke-interface {v1}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/k1;->o()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_7
    :try_start_4
    invoke-virtual {v7}, Lio/sentry/r;->close()V
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_0

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v0

    const-string v1, "AutoInit"

    invoke-virtual {v0, v1}, Lio/sentry/Y1;->a(Ljava/lang/String;)V

    goto :goto_d

    :catch_0
    move-exception v1

    goto :goto_9

    :catch_1
    move-exception v1

    goto :goto_a

    :catch_2
    move-exception v1

    goto :goto_b

    :catch_3
    move-exception v1

    goto :goto_c

    :goto_7
    :try_start_5
    invoke-virtual {v7}, Lio/sentry/r;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v2

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
    :try_end_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6 .. :try_end_6} :catch_0

    :goto_9
    sget-object v2, Lio/sentry/a2;->FATAL:Lio/sentry/a2;

    invoke-virtual {v0, v2, v6, v1}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v5, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_a
    sget-object v2, Lio/sentry/a2;->FATAL:Lio/sentry/a2;

    invoke-virtual {v0, v2, v6, v1}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v5, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_b
    sget-object v2, Lio/sentry/a2;->FATAL:Lio/sentry/a2;

    invoke-virtual {v0, v2, v6, v1}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v5, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_c
    sget-object v2, Lio/sentry/a2;->FATAL:Lio/sentry/a2;

    invoke-virtual {v0, v2, v6, v1}, Lio/sentry/android/core/q;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v5, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_8
    :goto_d
    return v3
.end method

.method public final shutdown()V
    .locals 0

    invoke-static {}, Lio/sentry/z1;->a()V

    return-void
.end method
