.class public final Lio/sentry/android/replay/gestures/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/android/replay/e;


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Lio/sentry/android/replay/ReplayIntegration;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/v2;Lio/sentry/android/replay/ReplayIntegration;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->a:Lio/sentry/v2;

    iput-object p2, p0, Lio/sentry/android/replay/gestures/b;->b:Lio/sentry/android/replay/ReplayIntegration;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->c:Ljava/util/ArrayList;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->d:Lio/sentry/util/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/gestures/b;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lio/sentry/android/replay/gestures/b;->d:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Lio/sentry/android/replay/gestures/b;->b(Landroid/view/View;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {v1, v0}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final b(Landroid/view/View;)V
    .locals 3

    invoke-static {p1}, Lio/sentry/config/a;->q(Landroid/view/View;)Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/sentry/android/replay/gestures/b;->a:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Window was null in stopGestureTracking"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/android/replay/gestures/a;

    if-eqz v1, :cond_1

    check-cast v0, Lio/sentry/android/replay/gestures/a;

    iget-object v0, v0, Lio/sentry/android/replay/gestures/a;->a:Landroid/view/Window$Callback;

    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    :cond_1
    return-void
.end method

.method public final d(Landroid/view/View;Z)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/gestures/b;->d:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/replay/gestures/b;->c:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    :try_start_0
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lio/sentry/android/replay/gestures/b;->a:Lio/sentry/v2;

    invoke-static {p1}, Lio/sentry/config/a;->q(Landroid/view/View;)Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "Window is invalid, not tracking gestures"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    instance-of v2, v1, Lio/sentry/android/replay/gestures/a;

    if-nez v2, :cond_2

    new-instance v2, Lio/sentry/android/replay/gestures/a;

    iget-object v3, p0, Lio/sentry/android/replay/gestures/b;->b:Lio/sentry/android/replay/ReplayIntegration;

    invoke-direct {v2, p2, v3, v1}, Lio/sentry/android/replay/gestures/a;-><init>(Lio/sentry/v2;Lio/sentry/android/replay/ReplayIntegration;Landroid/view/Window$Callback;)V

    invoke-virtual {p1, v2}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/gestures/b;->b(Landroid/view/View;)V

    new-instance p2, Lio/sentry/android/replay/B;

    const/4 v2, 0x1

    invoke-direct {p2, p1, v2}, Lio/sentry/android/replay/B;-><init>(Landroid/view/View;I)V

    invoke-static {v1, p2}, Lxa;->e0(Ljava/util/ArrayList;Lfj;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    invoke-static {v0, p1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v0, p1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw p2
.end method
