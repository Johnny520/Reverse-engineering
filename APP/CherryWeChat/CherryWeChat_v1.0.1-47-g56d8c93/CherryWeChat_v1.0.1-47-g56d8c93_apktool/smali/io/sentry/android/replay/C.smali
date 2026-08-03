.class public final Lio/sentry/android/replay/C;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;
.implements Lio/sentry/android/replay/e;


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Lio/sentry/android/replay/ReplayIntegration;

.field public final c:Lio/sentry/android/replay/ReplayIntegration;

.field public final d:Lio/sentry/B0;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Ljava/util/ArrayList;

.field public final h:Landroid/graphics/Point;

.field public final i:Lio/sentry/util/a;

.field public final j:Lio/sentry/util/a;

.field public volatile k:Liq;


# direct methods
.method public constructor <init>(Lio/sentry/v2;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/B0;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/C;->a:Lio/sentry/v2;

    iput-object p2, p0, Lio/sentry/android/replay/C;->b:Lio/sentry/android/replay/ReplayIntegration;

    iput-object p3, p0, Lio/sentry/android/replay/C;->c:Lio/sentry/android/replay/ReplayIntegration;

    iput-object p4, p0, Lio/sentry/android/replay/C;->d:Lio/sentry/B0;

    iput-object p5, p0, Lio/sentry/android/replay/C;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/C;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/C;->g:Ljava/util/ArrayList;

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/C;->h:Landroid/graphics/Point;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/C;->i:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/C;->j:Lio/sentry/util/a;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/android/replay/C;->l()V

    iget-object v0, p0, Lio/sentry/android/replay/C;->d:Lio/sentry/B0;

    iget-object v1, p0, Lio/sentry/android/replay/C;->k:Liq;

    iget-object v0, v0, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/C;->o()V

    return-void
.end method

.method public final d(Landroid/view/View;Z)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/C;->i:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    iget-object p2, p0, Lio/sentry/android/replay/C;->g:Ljava/util/ArrayList;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lio/sentry/android/replay/C;->k:Liq;

    if-eqz p2, :cond_0

    iget-object p2, p2, Liq;->d:Ljava/lang/Object;

    check-cast p2, Lio/sentry/android/replay/v;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lio/sentry/android/replay/v;->a(Landroid/view/View;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/C;->f(Landroid/view/View;)V

    goto :goto_2

    :cond_1
    iget-object p2, p0, Lio/sentry/android/replay/C;->k:Liq;

    if-eqz p2, :cond_2

    iget-object p2, p2, Liq;->d:Ljava/lang/Object;

    check-cast p2, Lio/sentry/android/replay/v;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Lio/sentry/android/replay/v;->c(Landroid/view/View;)V

    :cond_2
    iget-object p2, p0, Lio/sentry/android/replay/C;->g:Ljava/util/ArrayList;

    new-instance v2, Lio/sentry/android/replay/B;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lio/sentry/android/replay/B;-><init>(Landroid/view/View;I)V

    invoke-static {p2, v2}, Lxa;->e0(Ljava/util/ArrayList;Lfj;)V

    iget-object p2, p0, Lio/sentry/android/replay/C;->g:Ljava/util/ArrayList;

    invoke-static {p2}, Lra;->m0(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    goto :goto_1

    :cond_3
    move-object p2, v1

    :goto_1
    if-eqz p2, :cond_5

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lio/sentry/android/replay/C;->k:Liq;

    if-eqz p1, :cond_4

    iget-object p1, p1, Liq;->d:Ljava/lang/Object;

    check-cast p1, Lio/sentry/android/replay/v;

    if-eqz p1, :cond_4

    invoke-virtual {p1, p2}, Lio/sentry/android/replay/v;->a(Landroid/view/View;)V

    :cond_4
    invoke-virtual {p0, p2}, Lio/sentry/android/replay/C;->f(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    :goto_2
    invoke-static {v0, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_3
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v0, p1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final f(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lio/sentry/android/replay/C;->h:Landroid/graphics/Point;

    iget v2, v1, Landroid/graphics/Point;->x:I

    if-eq v0, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v2, v1, Landroid/graphics/Point;->y:I

    if-eq v0, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Point;->set(II)V

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget-object v1, p0, Lio/sentry/android/replay/C;->c:Lio/sentry/android/replay/ReplayIntegration;

    invoke-virtual {v1, v0, p1}, Lio/sentry/android/replay/ReplayIntegration;->u(II)V

    return-void

    :cond_0
    new-instance v0, Lio/sentry/android/replay/A;

    invoke-direct {v0, p0, p1}, Lio/sentry/android/replay/A;-><init>(Lio/sentry/android/replay/C;Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/C;->k:Liq;

    if-eqz v0, :cond_2

    iget-object v1, v0, Liq;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/replay/v;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v3, v1, Lio/sentry/android/replay/v;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v3, v1, Lio/sentry/android/replay/v;->f:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1, v3}, Lio/sentry/android/replay/v;->c(Landroid/view/View;)V

    :cond_1
    iget-object v0, v0, Liq;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    :cond_2
    return-void
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/C;->h:Landroid/graphics/Point;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/Point;->set(II)V

    iget-object v0, p0, Lio/sentry/android/replay/C;->i:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/C;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    iget-object v3, p0, Lio/sentry/android/replay/C;->k:Liq;

    if-eqz v3, :cond_0

    iget-object v3, v3, Liq;->d:Ljava/lang/Object;

    check-cast v3, Lio/sentry/android/replay/v;

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v3, v2}, Lio/sentry/android/replay/v;->c(Landroid/view/View;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lio/sentry/android/replay/C;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final m()V
    .locals 8

    iget-object v0, p0, Lio/sentry/android/replay/C;->k:Liq;

    if-eqz v0, :cond_4

    iget-object v1, v0, Liq;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/B0;

    iget-object v2, v0, Liq;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/v2;

    invoke-virtual {v2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v3

    iget-boolean v3, v3, Lio/sentry/z2;->l:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v6, "Resuming the capture runnable."

    new-array v7, v4, [Ljava/lang/Object;

    invoke-interface {v3, v5, v6, v7}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v3, v0, Liq;->d:Ljava/lang/Object;

    check-cast v3, Lio/sentry/android/replay/v;

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    iget-object v6, v3, Lio/sentry/android/replay/v;->f:Ljava/lang/ref/WeakReference;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    iget-object v3, v3, Lio/sentry/android/replay/v;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_3
    iget-object v3, v0, Liq;->f:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    iget-object v3, v1, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v3, Landroid/os/Handler;

    invoke-virtual {v3, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, v1, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v2, "Failed to post the capture runnable, main looper is not ready."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public final o()V
    .locals 6

    iget-object v0, p0, Lio/sentry/android/replay/C;->k:Liq;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v3, v0, Liq;->d:Ljava/lang/Object;

    check-cast v3, Lio/sentry/android/replay/v;

    if-eqz v3, :cond_3

    iget-object v4, v3, Lio/sentry/android/replay/v;->i:Landroid/graphics/Bitmap;

    iget-object v5, v3, Lio/sentry/android/replay/v;->f:Ljava/lang/ref/WeakReference;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v5, v2

    :goto_0
    invoke-virtual {v3, v5}, Lio/sentry/android/replay/v;->c(Landroid/view/View;)V

    iget-object v5, v3, Lio/sentry/android/replay/v;->f:Ljava/lang/ref/WeakReference;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->clear()V

    :cond_1
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    iget-object v3, v3, Lio/sentry/android/replay/v;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_3
    iput-object v2, v0, Liq;->d:Ljava/lang/Object;

    iget-object v0, v0, Liq;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    :cond_4
    iget-object v0, p0, Lio/sentry/android/replay/C;->j:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iput-object v2, p0, Lio/sentry/android/replay/C;->k:Liq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lio/sentry/android/replay/C;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v2
.end method
