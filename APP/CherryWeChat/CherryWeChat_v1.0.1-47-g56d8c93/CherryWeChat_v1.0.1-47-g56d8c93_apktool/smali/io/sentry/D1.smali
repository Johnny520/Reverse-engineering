.class public final synthetic Lio/sentry/D1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/o1;
.implements Lio/sentry/I2;
.implements Lio/sentry/p1;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/D1;->a:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/D1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/D1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/F2;)V
    .locals 7

    iget-object v0, p0, Lio/sentry/D1;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/F1;

    iget-object v1, p0, Lio/sentry/D1;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/R1;

    iget-object v2, p0, Lio/sentry/D1;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/H;

    const/4 v3, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {v1}, Lio/sentry/R1;->c()Lio/sentry/protocol/s;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lio/sentry/E2;->Crashed:Lio/sentry/E2;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    sget-object v5, Lio/sentry/E2;->Crashed:Lio/sentry/E2;

    if-eq v5, v0, :cond_1

    invoke-virtual {v1}, Lio/sentry/R1;->d()Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    const/4 v3, 0x1

    :cond_2
    iget-object v5, v1, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    if-eqz v5, :cond_3

    iget-object v5, v5, Lio/sentry/protocol/n;->f:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v5, :cond_3

    const-string v6, "user-agent"

    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v1, v1, Lio/sentry/C1;->d:Lio/sentry/protocol/n;

    iget-object v1, v1, Lio/sentry/protocol/n;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v1, v4

    :goto_1
    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lio/sentry/hints/a;

    if-eqz v5, :cond_4

    check-cast v2, Lio/sentry/hints/a;

    invoke-interface {v2}, Lio/sentry/hints/a;->e()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lio/sentry/E2;->Abnormal:Lio/sentry/E2;

    :cond_4
    invoke-virtual {p1, v0, v1, v3, v4}, Lio/sentry/F2;->c(Lio/sentry/E2;Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lio/sentry/F2;->g:Lio/sentry/E2;

    sget-object v1, Lio/sentry/E2;->Ok:Lio/sentry/E2;

    if-eq v0, v1, :cond_5

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/F2;->b(Ljava/util/Date;)V

    :cond_5
    return-void

    :cond_6
    iget-object p1, v0, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v1, "Session is null on scope.withSession"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lio/sentry/i0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/D1;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/gestures/f;

    iget-object v1, p0, Lio/sentry/D1;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    iget-object v2, p0, Lio/sentry/D1;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/i0;

    if-nez p1, :cond_0

    invoke-interface {v1, v2}, Lio/sentry/X;->w(Lio/sentry/i0;)V

    return-void

    :cond_0
    iget-object p1, v0, Lio/sentry/android/core/internal/gestures/f;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-interface {v2}, Lio/sentry/i0;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Transaction \'%s\' won\'t be bound to the Scope since there\'s one already in there."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public d(Lio/sentry/G2;)V
    .locals 10

    iget-object v0, p0, Lio/sentry/D1;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/D2;

    iget-object v1, p0, Lio/sentry/D1;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/I2;

    iget-object v2, p0, Lio/sentry/D1;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lio/sentry/I2;->d(Lio/sentry/G2;)V

    :cond_0
    iget-object p1, v0, Lio/sentry/D2;->r:Lio/sentry/Q2;

    iget-object p1, p1, Lio/sentry/Q2;->i:Lio/sentry/android/core/e;

    if-eqz p1, :cond_7

    iget-object v1, p1, Lio/sentry/android/core/e;->a:Lio/sentry/android/core/ActivityLifecycleIntegration;

    iget-object v3, p1, Lio/sentry/android/core/e;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ref/WeakReference;

    iget-object p1, p1, Lio/sentry/android/core/e;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Activity;

    if-eqz v3, :cond_6

    iget-object p1, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->q:LFu;

    iget-object v1, v0, Lio/sentry/D2;->a:Lio/sentry/protocol/t;

    const-string v4, "none"

    iget-object v5, p1, LFu;->f:Ljava/io/Serializable;

    check-cast v5, Lio/sentry/util/a;

    invoke-virtual {v5}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v5

    :try_start_0
    invoke-virtual {p1}, LFu;->h()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_2

    :cond_1
    :goto_0
    invoke-virtual {v5}, Lio/sentry/r;->close()V

    goto/16 :goto_3

    :cond_2
    :try_start_1
    new-instance v6, Lio/sentry/android/core/b;

    const/4 v7, 0x1

    invoke-direct {v6, p1, v3, v7}, Lio/sentry/android/core/b;-><init>(LFu;Landroid/app/Activity;I)V

    const/4 v7, 0x0

    invoke-virtual {p1, v6, v7}, LFu;->i(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object v6, p1, LFu;->d:Ljava/lang/Object;

    check-cast v6, Ljava/util/WeakHashMap;

    invoke-virtual {v6, v3}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/android/core/c;

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, LFu;->c()Lio/sentry/android/core/c;

    move-result-object v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    iget v7, v6, Lio/sentry/android/core/c;->a:I

    iget v8, v3, Lio/sentry/android/core/c;->a:I

    sub-int/2addr v7, v8

    iget v8, v6, Lio/sentry/android/core/c;->b:I

    iget v9, v3, Lio/sentry/android/core/c;->b:I

    sub-int/2addr v8, v9

    iget v6, v6, Lio/sentry/android/core/c;->c:I

    iget v3, v3, Lio/sentry/android/core/c;->c:I

    sub-int/2addr v6, v3

    new-instance v3, Lio/sentry/android/core/c;

    invoke-direct {v3, v7, v8, v6}, Lio/sentry/android/core/c;-><init>(III)V

    move-object v7, v3

    :goto_1
    if-eqz v7, :cond_1

    iget v3, v7, Lio/sentry/android/core/c;->c:I

    iget v6, v7, Lio/sentry/android/core/c;->b:I

    iget v7, v7, Lio/sentry/android/core/c;->a:I

    if-nez v7, :cond_5

    if-nez v6, :cond_5

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    new-instance v8, Lio/sentry/protocol/j;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v8, v7, v4}, Lio/sentry/protocol/j;-><init>(Ljava/lang/Number;Ljava/lang/String;)V

    new-instance v7, Lio/sentry/protocol/j;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v7, v6, v4}, Lio/sentry/protocol/j;-><init>(Ljava/lang/Number;Ljava/lang/String;)V

    new-instance v6, Lio/sentry/protocol/j;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v6, v3, v4}, Lio/sentry/protocol/j;-><init>(Ljava/lang/Number;Ljava/lang/String;)V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, "frames_total"

    invoke-virtual {v3, v4, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "frames_slow"

    invoke-virtual {v3, v4, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "frames_frozen"

    invoke-virtual {v3, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, LFu;->c:Ljava/io/Serializable;

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_2
    invoke-virtual {v5}, Lio/sentry/r;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    :cond_6
    iget-object v1, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v4, "Unable to track activity frames as the Activity %s has been destroyed."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v3, v4, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    :goto_3
    iget-object p1, v0, Lio/sentry/D2;->q:Lio/sentry/m;

    if-eqz p1, :cond_8

    invoke-interface {p1, v0}, Lio/sentry/m;->e(Lio/sentry/i0;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_8
    return-void
.end method
