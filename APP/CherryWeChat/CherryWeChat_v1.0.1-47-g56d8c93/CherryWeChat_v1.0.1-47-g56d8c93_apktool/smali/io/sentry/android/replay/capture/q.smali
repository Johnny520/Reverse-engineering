.class public final Lio/sentry/android/replay/capture/q;
.super Lio/sentry/android/replay/capture/e;
.source ""


# instance fields
.field public final r:Lio/sentry/v2;

.field public final s:Lio/sentry/Z;

.field public final t:Lio/sentry/transport/f;


# direct methods
.method public constructor <init>(Lio/sentry/v2;Lio/sentry/Z;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/sentry/android/replay/capture/e;-><init>(Lio/sentry/v2;Lio/sentry/Z;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/q;->r:Lio/sentry/v2;

    iput-object p2, p0, Lio/sentry/android/replay/capture/q;->s:Lio/sentry/Z;

    iput-object p3, p0, Lio/sentry/android/replay/capture/q;->t:Lio/sentry/transport/f;

    return-void
.end method


# virtual methods
.method public final b(ZLht;)V
    .locals 3

    iget-object p2, p0, Lio/sentry/android/replay/capture/q;->r:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/z2;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Replay is already running in \'session\' mode, not capturing for event"

    invoke-interface {p2, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object p2, p0, Lio/sentry/android/replay/capture/e;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final c(Lio/sentry/android/replay/w;)V
    .locals 5

    new-instance v0, Lio/sentry/android/replay/capture/p;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/p;-><init>(Lio/sentry/android/replay/capture/q;I)V

    const-string v1, "onConfigurationChanged"

    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/q;->n(Ljava/lang/String;Lfj;)V

    sget-object v0, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->i:Lio/sentry/android/replay/capture/c;

    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/android/replay/capture/d;

    iget-object v3, v0, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/android/replay/capture/e;

    const/4 v4, 0x1

    invoke-direct {v2, v1, p1, v3, v4}, Lio/sentry/android/replay/capture/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V

    iget-object p1, v0, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/android/replay/capture/e;

    iget-object v0, p1, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/util/thread/a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lio/sentry/android/replay/capture/e;->e:LcA;

    invoke-virtual {p1}, LcA;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lio/sentry/H0;

    const/4 v3, 0x4

    invoke-direct {v1, v3, v2}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    const-string v2, "CaptureStrategy.runInBackground"

    invoke-static {p1, v0, v2, v1}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v2}, Lio/sentry/android/replay/capture/d;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final d()V
    .locals 2

    new-instance v0, Lio/sentry/android/replay/capture/p;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/sentry/android/replay/capture/p;-><init>(Lio/sentry/android/replay/capture/q;I)V

    const-string v1, "pause"

    invoke-virtual {p0, v1, v0}, Lio/sentry/android/replay/capture/q;->n(Ljava/lang/String;Lfj;)V

    return-void
.end method

.method public final e()Lio/sentry/android/replay/capture/n;
    .locals 0

    return-object p0
.end method

.method public final f(ILio/sentry/protocol/t;Lio/sentry/w2;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lio/sentry/android/replay/capture/e;->f(ILio/sentry/protocol/t;Lio/sentry/w2;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/q;->s:Lio/sentry/Z;

    if-eqz p1, :cond_0

    new-instance p2, Lrl;

    const/16 p3, 0xc

    invoke-direct {p2, p3, p0}, Lrl;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, p2}, Lio/sentry/Z;->m(Lio/sentry/s1;)V

    :cond_0
    return-void
.end method

.method public final g(Lio/sentry/android/replay/n;)V
    .locals 6

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/e;->k()Lio/sentry/android/replay/w;

    move-result-object v5

    iget-object v0, p0, Lio/sentry/android/replay/capture/q;->t:Lio/sentry/transport/f;

    invoke-interface {v0}, Lio/sentry/transport/f;->b()J

    move-result-wide v3

    new-instance v0, Lio/sentry/android/replay/capture/o;

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lio/sentry/android/replay/capture/o;-><init>(Lio/sentry/android/replay/capture/q;Lio/sentry/android/replay/n;JLio/sentry/android/replay/w;)V

    iget-object p1, v1, Lio/sentry/android/replay/capture/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v2, v1, Lio/sentry/android/replay/capture/q;->r:Lio/sentry/v2;

    const-string v3, "SessionCaptureStrategy.add_frame"

    invoke-static {p1, v2, v3, v0}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final n(Ljava/lang/String;Lfj;)V
    .locals 9

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/e;->k()Lio/sentry/android/replay/w;

    move-result-object v6

    iget-object v8, p0, Lio/sentry/android/replay/capture/q;->r:Lio/sentry/v2;

    if-nez v6, :cond_0

    invoke-virtual {v8}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "Recorder config is not set, not creating segment for task: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p2, v0, p1, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/q;->t:Lio/sentry/transport/f;

    invoke-interface {v0}, Lio/sentry/transport/f;->b()J

    move-result-wide v0

    sget-object v2, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    iget-object v2, p0, Lio/sentry/android/replay/capture/e;->j:Lio/sentry/android/replay/capture/c;

    iget-object v2, v2, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/Date;

    if-nez v4, :cond_1

    return-void

    :cond_1
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long v2, v0, v2

    invoke-virtual {p0}, Lio/sentry/android/replay/capture/e;->i()Lio/sentry/protocol/t;

    move-result-object v5

    const-string v0, "SessionCaptureStrategy."

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lio/sentry/android/replay/capture/f;

    move-object v1, p0

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/capture/f;-><init>(Lio/sentry/android/replay/capture/q;JLjava/util/Date;Lio/sentry/protocol/t;Lio/sentry/android/replay/w;Lfj;)V

    iget-object p2, v1, Lio/sentry/android/replay/capture/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p2, v8, p1, v0}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final stop()V
    .locals 6

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/android/replay/j;->f()Ljava/io/File;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    new-instance v2, Lio/sentry/android/replay/t;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v0, v3}, Lio/sentry/android/replay/t;-><init>(Lio/sentry/android/replay/capture/e;Ljava/io/Serializable;I)V

    const-string v0, "stop"

    invoke-virtual {p0, v0, v2}, Lio/sentry/android/replay/capture/q;->n(Ljava/lang/String;Lfj;)V

    iget-object v0, p0, Lio/sentry/android/replay/capture/q;->s:Lio/sentry/Z;

    if-eqz v0, :cond_1

    new-instance v2, Lio/sentry/android/core/T;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lio/sentry/android/core/T;-><init>(I)V

    invoke-interface {v0, v2}, Lio/sentry/Z;->m(Lio/sentry/s1;)V

    :cond_1
    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/sentry/android/replay/j;->close()V

    :cond_2
    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    invoke-virtual {p0, v1}, Lio/sentry/android/replay/capture/e;->m(Ljava/util/Date;)V

    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    sget-object v1, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    iget-object v1, p0, Lio/sentry/android/replay/capture/e;->m:Lio/sentry/android/replay/capture/c;

    iget-object v2, v1, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    new-instance v3, Lio/sentry/android/replay/capture/b;

    iget-object v4, v1, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/android/replay/capture/e;

    const/4 v5, 0x0

    invoke-direct {v3, v2, v0, v4, v5}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/e;I)V

    iget-object v0, v1, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/android/replay/capture/e;

    iget-object v1, v0, Lio/sentry/android/replay/capture/e;->a:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v2

    invoke-interface {v2}, Lio/sentry/util/thread/a;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, v0, Lio/sentry/android/replay/capture/e;->e:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lio/sentry/H0;

    const/4 v4, 0x1

    invoke-direct {v2, v4, v3}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    const-string v3, "CaptureStrategy.runInBackground"

    invoke-static {v0, v1, v3, v2}, Lio/sentry/config/a;->H(Ljava/util/concurrent/ExecutorService;Lio/sentry/v2;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void

    :cond_3
    :try_start_0
    invoke-virtual {v3}, Lio/sentry/android/replay/capture/b;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-void
.end method
