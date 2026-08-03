.class public final Lio/sentry/android/core/V;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/android/core/B;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicLong;

.field public final b:J

.field public c:Lio/sentry/android/core/U;

.field public final d:Lio/sentry/util/d;

.field public final e:Lio/sentry/util/a;

.field public final f:Lio/sentry/w1;

.field public final g:Z

.field public final h:Z

.field public final i:Lio/sentry/transport/d;


# direct methods
.method public constructor <init>(JZZ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lio/sentry/android/core/V;->a:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Lio/sentry/util/d;

    new-instance v1, Lio/sentry/android/core/T;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lio/sentry/android/core/T;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/util/d;-><init>(Lio/sentry/util/c;)V

    iput-object v0, p0, Lio/sentry/android/core/V;->d:Lio/sentry/util/d;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/V;->e:Lio/sentry/util/a;

    iput-wide p1, p0, Lio/sentry/android/core/V;->b:J

    iput-boolean p3, p0, Lio/sentry/android/core/V;->g:Z

    iput-boolean p4, p0, Lio/sentry/android/core/V;->h:Z

    sget-object p1, Lio/sentry/w1;->a:Lio/sentry/w1;

    iput-object p1, p0, Lio/sentry/android/core/V;->f:Lio/sentry/w1;

    sget-object p1, Lio/sentry/transport/d;->a:Lio/sentry/transport/d;

    iput-object p1, p0, Lio/sentry/android/core/V;->i:Lio/sentry/transport/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lio/sentry/android/core/V;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, Lio/sentry/f;

    invoke-direct {v0}, Lio/sentry/f;-><init>()V

    const-string v1, "navigation"

    iput-object v1, v0, Lio/sentry/f;->e:Ljava/lang/String;

    const-string v1, "state"

    invoke-virtual {v0, v1, p1}, Lio/sentry/f;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "app.lifecycle"

    iput-object p1, v0, Lio/sentry/f;->g:Ljava/lang/String;

    sget-object p1, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    iput-object p1, v0, Lio/sentry/f;->i:Lio/sentry/a2;

    iget-object p1, p0, Lio/sentry/android/core/V;->f:Lio/sentry/w1;

    invoke-virtual {p1, v0}, Lio/sentry/w1;->s(Lio/sentry/f;)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/V;->e:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/V;->c:Lio/sentry/android/core/U;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/core/V;->c:Lio/sentry/android/core/U;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

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

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final d()V
    .locals 8

    invoke-virtual {p0}, Lio/sentry/android/core/V;->b()V

    iget-object v0, p0, Lio/sentry/android/core/V;->i:Lio/sentry/transport/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v2, Lrl;

    const/16 v3, 0x8

    invoke-direct {v2, v3, p0}, Lrl;-><init>(ILjava/lang/Object;)V

    iget-object v3, p0, Lio/sentry/android/core/V;->f:Lio/sentry/w1;

    invoke-virtual {v3, v2}, Lio/sentry/w1;->m(Lio/sentry/s1;)V

    iget-object v2, p0, Lio/sentry/android/core/V;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_0

    iget-wide v6, p0, Lio/sentry/android/core/V;->b:J

    add-long/2addr v4, v6

    cmp-long v4, v4, v0

    if-gtz v4, :cond_2

    :cond_0
    iget-boolean v4, p0, Lio/sentry/android/core/V;->g:Z

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lio/sentry/w1;->j()V

    :cond_1
    invoke-virtual {v3}, Lio/sentry/w1;->l()Lio/sentry/v2;

    move-result-object v4

    invoke-virtual {v4}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v4

    invoke-interface {v4}, Lio/sentry/k1;->o()V

    :cond_2
    invoke-virtual {v3}, Lio/sentry/w1;->l()Lio/sentry/v2;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v3

    invoke-interface {v3}, Lio/sentry/k1;->l()V

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    const-string v0, "foreground"

    invoke-virtual {p0, v0}, Lio/sentry/android/core/V;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final f()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/V;->i:Lio/sentry/transport/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lio/sentry/android/core/V;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    iget-object v0, p0, Lio/sentry/android/core/V;->f:Lio/sentry/w1;

    invoke-virtual {v0}, Lio/sentry/w1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/k1;->d()V

    iget-object v0, p0, Lio/sentry/android/core/V;->e:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/V;->b()V

    new-instance v1, Lio/sentry/android/core/U;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Lio/sentry/android/core/U;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Lio/sentry/android/core/V;->c:Lio/sentry/android/core/U;

    iget-object v1, p0, Lio/sentry/android/core/V;->d:Lio/sentry/util/d;

    invoke-virtual {v1}, Lio/sentry/util/d;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Timer;

    iget-object v2, p0, Lio/sentry/android/core/V;->c:Lio/sentry/android/core/U;

    iget-wide v3, p0, Lio/sentry/android/core/V;->b:J

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    const-string v0, "background"

    invoke-virtual {p0, v0}, Lio/sentry/android/core/V;->a(Ljava/lang/String;)V

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
