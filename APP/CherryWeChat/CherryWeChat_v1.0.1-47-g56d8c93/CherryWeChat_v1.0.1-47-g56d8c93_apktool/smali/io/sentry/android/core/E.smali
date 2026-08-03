.class public final Lio/sentry/android/core/E;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final e:Lio/sentry/android/core/E;


# instance fields
.field public final a:Lio/sentry/util/a;

.field public volatile b:Lio/sentry/android/core/D;

.field public final c:Lio/sentry/android/core/I;

.field public volatile d:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/android/core/E;

    invoke-direct {v0}, Lio/sentry/android/core/E;-><init>()V

    sput-object v0, Lio/sentry/android/core/E;->e:Lio/sentry/android/core/E;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/E;->a:Lio/sentry/util/a;

    new-instance v0, Lio/sentry/android/core/I;

    invoke-direct {v0}, Lio/sentry/android/core/I;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/E;->c:Lio/sentry/android/core/I;

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/E;->d:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    invoke-virtual {p0}, Lio/sentry/android/core/E;->m()V

    return-void
.end method

.method public final d(Lio/sentry/android/core/B;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/E;->a:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/N0;->a:Lio/sentry/N0;

    invoke-virtual {p0, v1}, Lio/sentry/android/core/E;->i(Lio/sentry/ILogger;)V

    iget-object v1, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    iget-object v1, v1, Lio/sentry/android/core/D;->a:Lio/sentry/android/core/C;

    invoke-virtual {v1, p1}, Lio/sentry/android/core/C;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final f(Lio/sentry/ILogger;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    if-eqz v0, :cond_0

    :try_start_0
    sget-object v1, Landroidx/lifecycle/ProcessLifecycleOwner;->i:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v1, v1, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Lao;

    invoke-virtual {v1, v0}, Lao;->a(LXn;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "AppState failed to get Lifecycle and could not install lifecycle observer."

    invoke-interface {p1, v1, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final i(Lio/sentry/ILogger;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->i:Landroidx/lifecycle/ProcessLifecycleOwner;

    new-instance v0, Lio/sentry/android/core/D;

    invoke-direct {v0, p0}, Lio/sentry/android/core/D;-><init>(Lio/sentry/android/core/E;)V

    iput-object v0, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    sget-object v0, Lio/sentry/android/core/internal/util/d;->a:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/d;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lio/sentry/android/core/E;->f(Lio/sentry/ILogger;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/E;->c:Lio/sentry/android/core/I;

    new-instance v1, Ln3;

    const/16 v2, 0x18

    invoke-direct {v1, v2, p0, p1}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v0, Lio/sentry/android/core/I;->a:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_0
    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "AppState could not register lifecycle observer"

    invoke-interface {p1, v1, v2, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_0
    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final l(Lio/sentry/android/core/B;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/E;->a:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    iget-object v1, v1, Lio/sentry/android/core/D;->a:Lio/sentry/android/core/C;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/E;->a:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    iget-object v2, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;

    iget-object v2, v2, Lio/sentry/android/core/D;->a:Lio/sentry/android/core/C;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    const/4 v2, 0x0

    iput-object v2, p0, Lio/sentry/android/core/E;->b:Lio/sentry/android/core/D;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    sget-object v0, Lio/sentry/android/core/internal/util/d;->a:Lio/sentry/android/core/internal/util/d;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/d;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v1, :cond_1

    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->i:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v0, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Lao;

    invoke-virtual {v0, v1}, Lao;->b(LXn;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/E;->c:Lio/sentry/android/core/I;

    new-instance v2, Lio/sentry/S1;

    invoke-direct {v2, p0, v1}, Lio/sentry/S1;-><init>(Lio/sentry/android/core/E;Lio/sentry/android/core/D;)V

    iget-object v0, v0, Lio/sentry/android/core/I;->a:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method
