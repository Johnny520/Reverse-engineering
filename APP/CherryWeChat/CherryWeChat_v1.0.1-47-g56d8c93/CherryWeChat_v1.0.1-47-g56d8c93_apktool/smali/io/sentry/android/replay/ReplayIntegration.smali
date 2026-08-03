.class public final Lio/sentry/android/replay/ReplayIntegration;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/o0;
.implements Ljava/io/Closeable;
.implements Lio/sentry/k1;
.implements Lio/sentry/N;
.implements Lio/sentry/transport/o;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final synthetic q:I


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/sentry/transport/d;

.field public c:Lio/sentry/v2;

.field public d:Lio/sentry/w1;

.field public e:Lio/sentry/android/replay/C;

.field public f:Lio/sentry/android/replay/gestures/b;

.field public final g:LcA;

.field public final h:LcA;

.field public final i:LcA;

.field public final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public l:Lio/sentry/android/replay/capture/n;

.field public m:Lio/sentry/j1;

.field public final n:Lio/sentry/B0;

.field public final o:Lio/sentry/util/a;

.field public final p:Lio/sentry/android/replay/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lio/sentry/Y1;->d()Lio/sentry/Y1;

    move-result-object v0

    const-string v1, "maven:io.sentry:sentry-android-replay"

    const-string v2, "8.21.1"

    invoke-virtual {v0, v1, v2}, Lio/sentry/Y1;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lio/sentry/transport/d;->a:Lio/sentry/transport/d;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->b:Lio/sentry/transport/d;

    sget-object p1, Lio/sentry/android/replay/a;->d:Lio/sentry/android/replay/a;

    new-instance v0, LcA;

    invoke-direct {v0, p1}, LcA;-><init>(LUi;)V

    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->g:LcA;

    sget-object p1, Lio/sentry/android/replay/a;->f:Lio/sentry/android/replay/a;

    new-instance v0, LcA;

    invoke-direct {v0, p1}, LcA;-><init>(LUi;)V

    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->h:LcA;

    sget-object p1, Lio/sentry/android/replay/a;->e:Lio/sentry/android/replay/a;

    new-instance v0, LcA;

    invoke-direct {v0, p1}, LcA;-><init>(LUi;)V

    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->i:LcA;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object p1, Lio/sentry/K0;->b:Lio/sentry/K0;

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->m:Lio/sentry/j1;

    new-instance p1, Lio/sentry/B0;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lio/sentry/B0;-><init>(IZ)V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->n:Lio/sentry/B0;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->o:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/android/replay/p;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lio/sentry/android/replay/q;->INITIAL:Lio/sentry/android/replay/q;

    iput-object v0, p1, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    sget-object v3, Lio/sentry/android/replay/q;->CLOSED:Lio/sentry/android/replay/q;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lio/sentry/v2;->getConnectionStatusProvider()Lio/sentry/O;

    move-result-object v1

    invoke-interface {v1, p0}, Lio/sentry/O;->n(Lio/sentry/N;)V

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/sentry/w1;->c()Lio/sentry/transport/p;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, v1, Lio/sentry/transport/p;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_5

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->stop()V

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/sentry/android/replay/C;->close()V

    :cond_3
    iput-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->h:LcA;

    invoke-virtual {v1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/replay/s;

    invoke-virtual {v1}, Lio/sentry/android/replay/s;->close()V

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->i:LcA;

    invoke-virtual {v1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v3, :cond_4

    move-object v3, v2

    :cond_4
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    goto :goto_3

    :cond_5
    :goto_1
    :try_start_2
    invoke-virtual {v3}, Lio/sentry/v2;->getShutdownTimeoutMillis()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v3, v4, v5}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catch_0
    :try_start_3
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_6
    :goto_2
    :try_start_4
    monitor-exit v1

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    sget-object v3, Lio/sentry/android/replay/q;->CLOSED:Lio/sentry/android/replay/q;

    iput-object v3, v1, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_3
    :try_start_5
    monitor-exit v1

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_7
    :goto_4
    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_5
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v2

    invoke-static {v0, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->v()V

    return-void
.end method

.method public final f(Ljava/lang/Boolean;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->r()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v1, Lio/sentry/android/replay/capture/e;

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/e;->i()Lio/sentry/protocol/t;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, p1

    :goto_1
    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Replay id is not set, not capturing for event"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz v0, :cond_4

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    new-instance v1, Lht;

    const/4 v3, 0x2

    invoke-direct {v1, v3, p0}, Lht;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Lio/sentry/android/replay/capture/n;->b(ZLht;)V

    :cond_4
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lio/sentry/android/replay/capture/n;->e()Lio/sentry/android/replay/capture/n;

    move-result-object v2

    :cond_5
    iput-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    :cond_6
    :goto_2
    return-void
.end method

.method public final i(Lio/sentry/M;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    instance-of v0, v0, Lio/sentry/android/replay/capture/q;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->v()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->w()V

    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->w()V

    return-void
.end method

.method public final m(Lio/sentry/transport/p;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    instance-of v0, v0, Lio/sentry/android/replay/capture/q;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/sentry/n;->All:Lio/sentry/n;

    invoke-virtual {p1, v0}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lio/sentry/n;->Replay:Lio/sentry/n;

    invoke-virtual {p1, v0}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->w()V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->v()V

    return-void
.end method

.method public final o()V
    .locals 13

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    sget-object v3, Lio/sentry/android/replay/q;->STARTED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v3}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v0

    const/4 v4, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v0, :cond_1

    move-object v0, v2

    :cond_1
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v5, "Session replay is already being recorded, not starting a new one"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v3, v5, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v1, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_4

    :cond_2
    :try_start_2
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->g:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/util/g;

    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v5, :cond_3

    move-object v5, v2

    :cond_3
    invoke-virtual {v5}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v5

    iget-object v5, v5, Lio/sentry/z2;->a:Ljava/lang/Double;

    const/4 v6, 0x1

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v0}, Lio/sentry/util/g;->c()D

    move-result-wide v9

    cmpg-double v0, v7, v9

    if-ltz v0, :cond_4

    move v0, v6

    goto :goto_0

    :cond_4
    move v0, v4

    :goto_0
    if-nez v0, :cond_8

    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v5, :cond_5

    move-object v5, v2

    :cond_5
    invoke-virtual {v5}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v5

    iget-object v5, v5, Lio/sentry/z2;->b:Ljava/lang/Double;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmpl-double v5, v7, v9

    if-lez v5, :cond_6

    move v5, v6

    goto :goto_1

    :cond_6
    move v5, v4

    :goto_1
    if-nez v5, :cond_8

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v0, :cond_7

    move-object v0, v2

    :cond_7
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v5, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v3, v5, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v1, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :cond_8
    :try_start_3
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    iput-object v3, v5, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    if-eqz v0, :cond_a

    new-instance v0, Lio/sentry/android/replay/capture/q;

    iget-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v3, :cond_9

    move-object v3, v2

    :cond_9
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    iget-object v7, p0, Lio/sentry/android/replay/ReplayIntegration;->b:Lio/sentry/transport/d;

    iget-object v8, p0, Lio/sentry/android/replay/ReplayIntegration;->i:LcA;

    invoke-virtual {v8}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, v3, v5, v7, v8}, Lio/sentry/android/replay/capture/q;-><init>(Lio/sentry/v2;Lio/sentry/Z;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V

    goto :goto_3

    :cond_a
    new-instance v7, Lio/sentry/android/replay/capture/h;

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v0, :cond_b

    move-object v8, v2

    goto :goto_2

    :cond_b
    move-object v8, v0

    :goto_2
    iget-object v9, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    iget-object v10, p0, Lio/sentry/android/replay/ReplayIntegration;->b:Lio/sentry/transport/d;

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->g:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lio/sentry/util/g;

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->i:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct/range {v7 .. v12}, Lio/sentry/android/replay/capture/h;-><init>(Lio/sentry/v2;Lio/sentry/w1;Lio/sentry/transport/d;Lio/sentry/util/g;Ljava/util/concurrent/ScheduledExecutorService;)V

    move-object v0, v7

    :goto_3
    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v0, :cond_c

    iget-object v0, v0, Lio/sentry/android/replay/C;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    :cond_c
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz v0, :cond_d

    new-instance v3, Lio/sentry/protocol/t;

    invoke-direct {v3}, Lio/sentry/protocol/t;-><init>()V

    invoke-interface {v0, v4, v3, v2}, Lio/sentry/android/replay/capture/n;->f(ILio/sentry/protocol/t;Lio/sentry/w2;)V

    :cond_d
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->h:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/replay/s;

    iget-object v0, v0, Lio/sentry/android/replay/s;->c:Lio/sentry/android/core/C;

    iget-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    invoke-virtual {v0, v3}, Lio/sentry/android/core/C;->add(Ljava/lang/Object;)Z

    :cond_e
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->h:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/replay/s;

    iget-object v0, v0, Lio/sentry/android/replay/s;->c:Lio/sentry/android/core/C;

    iget-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/gestures/b;

    invoke-virtual {v0, v3}, Lio/sentry/android/core/C;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v1, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_4
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final p(Lio/sentry/v2;)V
    .locals 7

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/z2;->a:Ljava/lang/Double;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    cmpl-double v0, v3, v1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/z2;->b:Ljava/lang/Double;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    cmpl-double v0, v3, v1

    if-lez v0, :cond_4

    :goto_0
    sget-object v0, Lio/sentry/w1;->a:Lio/sentry/w1;

    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    new-instance v1, Lio/sentry/android/replay/C;

    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->i:LcA;

    invoke-virtual {v2}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->n:Lio/sentry/B0;

    move-object v4, p0

    move-object v3, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/sentry/android/replay/C;-><init>(Lio/sentry/v2;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/B0;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v1, v3, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    new-instance p1, Lio/sentry/android/replay/gestures/b;

    invoke-direct {p1, v2, p0}, Lio/sentry/android/replay/gestures/b;-><init>(Lio/sentry/v2;Lio/sentry/android/replay/ReplayIntegration;)V

    iput-object p1, v3, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/gestures/b;

    iget-object p1, v3, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v2}, Lio/sentry/v2;->getConnectionStatusProvider()Lio/sentry/O;

    move-result-object p1

    invoke-interface {p1, p0}, Lio/sentry/O;->h(Lio/sentry/N;)Z

    invoke-virtual {v0}, Lio/sentry/w1;->c()Lio/sentry/transport/p;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p1, Lio/sentry/transport/p;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string p1, "Replay"

    invoke-static {p1}, Lio/sentry/config/a;->a(Ljava/lang/String;)V

    iget-object p1, v3, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    const/4 v0, 0x0

    if-nez p1, :cond_2

    move-object p1, v0

    :cond_2
    invoke-virtual {p1}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object p1

    iget-object v1, v3, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v1, :cond_3

    move-object v1, v0

    :cond_3
    new-instance v0, Lio/sentry/S1;

    const/16 v2, 0x8

    invoke-direct {v0, v2, p0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    :try_start_0
    new-instance v2, Lio/sentry/android/replay/util/c;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v0, v1}, Lio/sentry/android/replay/util/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v2}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_4
    move-object v3, p0

    move-object v2, p1

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Session replay is disabled, no sample rate specified"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/v2;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_5

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "replay_"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz v6, :cond_1

    check-cast v6, Lio/sentry/android/replay/capture/e;

    invoke-virtual {v6}, Lio/sentry/android/replay/capture/e;->i()Lio/sentry/protocol/t;

    move-result-object v6

    if-nez v6, :cond_2

    :cond_1
    sget-object v6, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    :cond_2
    invoke-virtual {v6}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {p1}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-static {v5, p1, v2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v4}, Lio/sentry/config/a;->f(Ljava/io/File;)Z

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final r()Z
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    iget-object v0, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    sget-object v1, Lio/sentry/android/replay/q;->STARTED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    iget-object v0, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    sget-object v1, Lio/sentry/android/replay/q;->STOPPED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final s(Landroid/graphics/Bitmap;)V
    .locals 4

    new-instance v0, LIv;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    if-eqz v1, :cond_0

    new-instance v2, Lio/sentry/android/replay/l;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lio/sentry/android/replay/l;-><init>(LIv;I)V

    invoke-virtual {v1, v2}, Lio/sentry/w1;->m(Lio/sentry/s1;)V

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz v1, :cond_1

    new-instance v2, Lio/sentry/android/replay/n;

    invoke-direct {v2, p1, v0, p0}, Lio/sentry/android/replay/n;-><init>(Landroid/graphics/Bitmap;LIv;Lio/sentry/android/replay/ReplayIntegration;)V

    invoke-interface {v1, v2}, Lio/sentry/android/replay/capture/n;->g(Lio/sentry/android/replay/n;)V

    :cond_1
    return-void
.end method

.method public final stop()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    sget-object v3, Lio/sentry/android/replay/q;->STOPPED:Lio/sentry/android/replay/q;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->h:LcA;

    invoke-virtual {v1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/replay/s;

    iget-object v1, v1, Lio/sentry/android/replay/s;->c:Lio/sentry/android/core/C;

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    invoke-virtual {v1, v4}, Lio/sentry/android/core/C;->remove(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->h:LcA;

    invoke-virtual {v1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/replay/s;

    iget-object v1, v1, Lio/sentry/android/replay/s;->c:Lio/sentry/android/core/C;

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/gestures/b;

    invoke-virtual {v1, v4}, Lio/sentry/android/core/C;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/sentry/android/replay/C;->l()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    :goto_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/sentry/android/replay/C;->o()V

    :cond_3
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/gestures/b;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lio/sentry/android/replay/gestures/b;->a()V

    :cond_4
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Lio/sentry/android/replay/capture/n;->stop()V

    :cond_5
    iput-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    iput-object v3, v1, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :cond_6
    :goto_1
    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final t()Lio/sentry/j1;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->m:Lio/sentry/j1;

    return-object v0
.end method

.method public final u(II)V
    .locals 18

    move-object/from16 v1, p0

    iget-object v0, v1, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Lio/sentry/android/replay/ReplayIntegration;->r()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_c

    :cond_0
    iget-object v0, v1, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    move-object v0, v2

    :cond_1
    invoke-virtual {v0}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/z2;->j:Z

    if-eqz v0, :cond_11

    iget-object v0, v1, Lio/sentry/android/replay/ReplayIntegration;->a:Landroid/content/Context;

    iget-object v3, v1, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v3, :cond_2

    move-object v3, v2

    :cond_2
    invoke-virtual {v3}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v3

    move/from16 v4, p2

    int-to-float v4, v4

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    div-float v5, v4, v5

    iget-object v6, v3, Lio/sentry/z2;->e:Lio/sentry/y2;

    iget v7, v6, Lio/sentry/y2;->sizeScale:F

    mul-float/2addr v5, v7

    invoke-static {v5}, LDc;->q(F)I

    move-result v5

    rem-int/lit8 v7, v5, 0x10

    const/16 v8, 0x8

    if-gt v7, v8, :cond_3

    sub-int/2addr v5, v7

    :goto_0
    move v11, v5

    move/from16 v5, p1

    goto :goto_1

    :cond_3
    rsub-int/lit8 v7, v7, 0x10

    add-int/2addr v5, v7

    goto :goto_0

    :goto_1
    int-to-float v5, v5

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float v0, v5, v0

    iget v7, v6, Lio/sentry/y2;->sizeScale:F

    mul-float/2addr v0, v7

    invoke-static {v0}, LDc;->q(F)I

    move-result v0

    rem-int/lit8 v7, v0, 0x10

    if-gt v7, v8, :cond_4

    sub-int/2addr v0, v7

    :goto_2
    move v10, v0

    goto :goto_3

    :cond_4
    rsub-int/lit8 v7, v7, 0x10

    add-int/2addr v0, v7

    goto :goto_2

    :goto_3
    new-instance v13, Lio/sentry/android/replay/w;

    int-to-float v0, v10

    div-float v12, v0, v5

    int-to-float v0, v11

    div-float/2addr v0, v4

    iget v14, v3, Lio/sentry/z2;->f:I

    iget v15, v6, Lio/sentry/y2;->bitRate:I

    move-object v9, v13

    move v13, v0

    invoke-direct/range {v9 .. v15}, Lio/sentry/android/replay/w;-><init>(IIFFII)V

    move-object v13, v9

    iget-object v0, v1, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Lio/sentry/android/replay/ReplayIntegration;->r()Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_c

    :cond_5
    iget-object v0, v1, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz v0, :cond_6

    invoke-interface {v0, v13}, Lio/sentry/android/replay/capture/n;->c(Lio/sentry/android/replay/w;)V

    :cond_6
    iget-object v0, v1, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v0, :cond_10

    iget-object v3, v0, Lio/sentry/android/replay/C;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_b

    :cond_7
    iget-object v3, v0, Lio/sentry/android/replay/C;->k:Liq;

    if-nez v3, :cond_9

    iget-object v3, v0, Lio/sentry/android/replay/C;->j:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v3

    :try_start_0
    iget-object v4, v0, Lio/sentry/android/replay/C;->k:Liq;

    if-nez v4, :cond_8

    new-instance v4, Liq;

    iget-object v5, v0, Lio/sentry/android/replay/C;->a:Lio/sentry/v2;

    iget-object v6, v0, Lio/sentry/android/replay/C;->d:Lio/sentry/B0;

    invoke-direct {v4, v5, v6}, Liq;-><init>(Lio/sentry/v2;Lio/sentry/B0;)V

    iput-object v4, v0, Lio/sentry/android/replay/C;->k:Liq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_5

    :cond_8
    :goto_4
    invoke-static {v3, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    goto :goto_6

    :goto_5
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v3, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v0

    :cond_9
    :goto_6
    iget-object v3, v0, Lio/sentry/android/replay/C;->k:Liq;

    if-nez v3, :cond_a

    goto :goto_7

    :cond_a
    iput-object v13, v3, Liq;->e:Ljava/lang/Object;

    :goto_7
    iget-object v3, v0, Lio/sentry/android/replay/C;->k:Liq;

    if-nez v3, :cond_b

    goto :goto_8

    :cond_b
    new-instance v12, Lio/sentry/android/replay/v;

    iget-object v14, v0, Lio/sentry/android/replay/C;->a:Lio/sentry/v2;

    iget-object v15, v0, Lio/sentry/android/replay/C;->d:Lio/sentry/B0;

    iget-object v4, v0, Lio/sentry/android/replay/C;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v5, v0, Lio/sentry/android/replay/C;->b:Lio/sentry/android/replay/ReplayIntegration;

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    invoke-direct/range {v12 .. v17}, Lio/sentry/android/replay/v;-><init>(Lio/sentry/android/replay/w;Lio/sentry/v2;Lio/sentry/B0;Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/android/replay/ReplayIntegration;)V

    iput-object v12, v3, Liq;->d:Ljava/lang/Object;

    :goto_8
    iget-object v3, v0, Lio/sentry/android/replay/C;->g:Ljava/util/ArrayList;

    invoke-static {v3}, Lra;->m0(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    :cond_c
    if-eqz v2, :cond_d

    iget-object v3, v0, Lio/sentry/android/replay/C;->k:Liq;

    if-eqz v3, :cond_d

    iget-object v3, v3, Liq;->d:Ljava/lang/Object;

    check-cast v3, Lio/sentry/android/replay/v;

    if-eqz v3, :cond_d

    invoke-virtual {v3, v2}, Lio/sentry/android/replay/v;->a(Landroid/view/View;)V

    :cond_d
    iget-object v2, v0, Lio/sentry/android/replay/C;->d:Lio/sentry/B0;

    iget-object v3, v0, Lio/sentry/android/replay/C;->k:Liq;

    iget-object v2, v2, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    if-nez v3, :cond_e

    goto :goto_9

    :cond_e
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :goto_9
    iget-object v2, v0, Lio/sentry/android/replay/C;->d:Lio/sentry/B0;

    iget-object v3, v0, Lio/sentry/android/replay/C;->k:Liq;

    iget-object v2, v2, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    const/4 v4, 0x0

    if-nez v3, :cond_f

    move v2, v4

    goto :goto_a

    :cond_f
    const-wide/16 v5, 0x64

    invoke-virtual {v2, v3, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v2

    :goto_a
    if-nez v2, :cond_10

    iget-object v0, v0, Lio/sentry/android/replay/C;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Failed to post the capture runnable, main looper is shutting down."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_10
    :goto_b
    iget-object v0, v1, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    iget-object v0, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    sget-object v2, Lio/sentry/android/replay/q;->PAUSED:Lio/sentry/android/replay/q;

    if-ne v0, v2, :cond_11

    iget-object v0, v1, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lio/sentry/android/replay/C;->i()V

    :cond_11
    :goto_c
    return-void
.end method

.method public final v()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    sget-object v3, Lio/sentry/android/replay/q;->PAUSED:Lio/sentry/android/replay/q;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/sentry/android/replay/C;->i()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lio/sentry/android/replay/capture/n;->d()V

    :cond_2
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    iput-object v3, v1, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_1
    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final w()V
    .locals 6

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    sget-object v3, Lio/sentry/android/replay/q;->RESUMED:Lio/sentry/android/replay/q;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/v2;

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lio/sentry/v2;->getConnectionStatusProvider()Lio/sentry/O;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/O;->g()Lio/sentry/M;

    move-result-object v1

    sget-object v4, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    if-eq v1, v4, :cond_6

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/sentry/w1;->c()Lio/sentry/transport/p;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v5, Lio/sentry/n;->All:Lio/sentry/n;

    invoke-virtual {v1, v5}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v1

    if-ne v1, v4, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/w1;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/sentry/w1;->c()Lio/sentry/transport/p;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v5, Lio/sentry/n;->Replay:Lio/sentry/n;

    invoke-virtual {v1, v5}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v1

    if-ne v1, v4, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->p:Lio/sentry/android/replay/p;

    iput-object v3, v1, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->l:Lio/sentry/android/replay/capture/n;

    if-eqz v1, :cond_4

    check-cast v1, Lio/sentry/android/replay/capture/e;

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/capture/e;->m(Ljava/util/Date;)V

    :cond_4
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/android/replay/C;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/sentry/android/replay/C;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :cond_6
    :goto_0
    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :cond_7
    :goto_1
    invoke-static {v0, v2}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, LQj;->k(Lio/sentry/r;Ljava/lang/Throwable;)V

    throw v2
.end method
