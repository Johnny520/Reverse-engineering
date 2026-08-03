.class public final Lio/sentry/D2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/i0;


# instance fields
.field public final a:Lio/sentry/protocol/t;

.field public final b:Lio/sentry/G2;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final d:Lio/sentry/v1;

.field public final e:Ljava/lang/String;

.field public f:Lio/sentry/C2;

.field public volatile g:Lio/sentry/B2;

.field public volatile h:Lio/sentry/B2;

.field public volatile i:Ljava/util/Timer;

.field public final j:Lio/sentry/util/a;

.field public final k:Lio/sentry/util/a;

.field public final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final n:Lio/sentry/protocol/C;

.field public final o:Lio/sentry/n0;

.field public final p:Lio/sentry/protocol/c;

.field public final q:Lio/sentry/m;

.field public final r:Lio/sentry/Q2;


# direct methods
.method public constructor <init>(Lio/sentry/P2;Lio/sentry/v1;Lio/sentry/Q2;Lio/sentry/m;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/protocol/t;

    invoke-direct {v0}, Lio/sentry/protocol/t;-><init>()V

    iput-object v0, p0, Lio/sentry/D2;->a:Lio/sentry/protocol/t;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    sget-object v0, Lio/sentry/C2;->c:Lio/sentry/C2;

    iput-object v0, p0, Lio/sentry/D2;->f:Lio/sentry/C2;

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    new-instance v1, Lio/sentry/util/a;

    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v1, p0, Lio/sentry/D2;->j:Lio/sentry/util/a;

    new-instance v2, Lio/sentry/util/a;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v2, p0, Lio/sentry/D2;->k:Lio/sentry/util/a;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lio/sentry/D2;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lio/sentry/D2;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v4, Lio/sentry/protocol/c;

    invoke-direct {v4}, Lio/sentry/protocol/c;-><init>()V

    iput-object v4, p0, Lio/sentry/D2;->p:Lio/sentry/protocol/c;

    new-instance v5, Lio/sentry/G2;

    invoke-direct {v5, p1, p0, p2, p3}, Lio/sentry/G2;-><init>(Lio/sentry/P2;Lio/sentry/D2;Lio/sentry/v1;Lio/sentry/Q2;)V

    iput-object v5, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v6, p1, Lio/sentry/P2;->n:Ljava/lang/String;

    iput-object v6, p0, Lio/sentry/D2;->e:Ljava/lang/String;

    iget-object v6, p1, Lio/sentry/H2;->l:Lio/sentry/n0;

    iput-object v6, p0, Lio/sentry/D2;->o:Lio/sentry/n0;

    iput-object p2, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    iput-object p4, p0, Lio/sentry/D2;->q:Lio/sentry/m;

    iget-object p1, p1, Lio/sentry/P2;->o:Lio/sentry/protocol/C;

    iput-object p1, p0, Lio/sentry/D2;->n:Lio/sentry/protocol/C;

    iput-object p3, p0, Lio/sentry/D2;->r:Lio/sentry/Q2;

    invoke-virtual {p0, v5}, Lio/sentry/D2;->y(Lio/sentry/G2;)V

    invoke-virtual {p2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getContinuousProfiler()Lio/sentry/P;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/P;->s()Lio/sentry/protocol/t;

    move-result-object p1

    sget-object p2, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {p1, p2}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5}, Lio/sentry/G2;->v()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lio/sentry/f1;

    invoke-direct {p2, p1}, Lio/sentry/f1;-><init>(Lio/sentry/protocol/t;)V

    const-string p1, "profile"

    invoke-virtual {v4, p1, p2}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz p4, :cond_1

    invoke-interface {p4, p0}, Lio/sentry/m;->b(Lio/sentry/D2;)V

    :cond_1
    iget-object p1, p3, Lio/sentry/Q2;->g:Ljava/lang/Long;

    if-nez p1, :cond_3

    iget-object p1, p3, Lio/sentry/Q2;->h:Ljava/lang/Long;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    new-instance p1, Ljava/util/Timer;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/Timer;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    iget-object p1, p3, Lio/sentry/Q2;->h:Ljava/lang/Long;

    if-eqz p1, :cond_7

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object p3

    :try_start_0
    iget-object p4, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    if-eqz p4, :cond_6

    invoke-virtual {p0}, Lio/sentry/D2;->v()V

    invoke-virtual {v2, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance p4, Lio/sentry/B2;

    const/4 v1, 0x1

    invoke-direct {p4, p0, v1}, Lio/sentry/B2;-><init>(Lio/sentry/D2;I)V

    iput-object p4, p0, Lio/sentry/D2;->h:Lio/sentry/B2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p4, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    iget-object v1, p0, Lio/sentry/D2;->h:Lio/sentry/B2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p4, v1, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    :try_start_2
    iget-object p4, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {p4}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p4

    invoke-virtual {p4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p4

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v2, "Failed to schedule finish timer"

    invoke-interface {p4, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lio/sentry/D2;->o()Lio/sentry/L2;

    move-result-object p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    sget-object p1, Lio/sentry/L2;->DEADLINE_EXCEEDED:Lio/sentry/L2;

    :goto_1
    iget-object p4, p0, Lio/sentry/D2;->r:Lio/sentry/Q2;

    iget-object p4, p4, Lio/sentry/Q2;->g:Ljava/lang/Long;

    if-eqz p4, :cond_5

    goto :goto_2

    :cond_5
    move p2, v3

    :goto_2
    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/D2;->h(Lio/sentry/L2;ZLio/sentry/H;)V

    iget-object p1, p0, Lio/sentry/D2;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_6
    :goto_3
    invoke-virtual {p3}, Lio/sentry/r;->close()V

    goto :goto_6

    :goto_4
    :try_start_3
    invoke-virtual {p3}, Lio/sentry/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1

    :cond_7
    :goto_6
    invoke-virtual {p0}, Lio/sentry/D2;->k()V

    return-void
.end method


# virtual methods
.method public final a()Lio/sentry/g0;
    .locals 3

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/G2;

    iget-boolean v2, v1, Lio/sentry/G2;->f:Z

    if-nez v2, :cond_0

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Lio/sentry/N2;
    .locals 13

    iget-object v1, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v1}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->isTraceSampling()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v3, v0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v4, v0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v5, v3, Lio/sentry/H2;->m:Lio/sentry/c;

    if-eqz v5, :cond_2

    iget-object v0, p0, Lio/sentry/D2;->k:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v3

    :try_start_0
    iget-boolean v0, v5, Lio/sentry/c;->e:Z

    if-eqz v0, :cond_1

    new-instance v6, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v1}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    const/4 v12, 0x0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v7, "Instance is disabled and this \'configureScope\' call is a no-op."

    new-array v8, v12, [Ljava/lang/Object;

    invoke-interface {v0, v2, v7, v8}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    move-object v2, v6

    goto :goto_1

    :cond_0
    :try_start_1
    iget-object v0, v1, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0, v2}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->D()Lio/sentry/protocol/t;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-virtual {v1}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v7, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v8, "Error in the \'configureScope\' callback."

    invoke-interface {v2, v7, v8, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :goto_1
    iget-object v6, v4, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lio/sentry/protocol/t;

    invoke-virtual {v1}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v8

    iget-object v9, v4, Lio/sentry/H2;->d:Lvx;

    iget-object v10, p0, Lio/sentry/D2;->e:Ljava/lang/String;

    iget-object v11, p0, Lio/sentry/D2;->n:Lio/sentry/protocol/C;

    invoke-virtual/range {v5 .. v11}, Lio/sentry/c;->c(Lio/sentry/protocol/t;Lio/sentry/protocol/t;Lio/sentry/v2;Lvx;Ljava/lang/String;Lio/sentry/protocol/C;)V

    iput-boolean v12, v5, Lio/sentry/c;->e:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_3

    :cond_1
    :goto_2
    invoke-virtual {v3}, Lio/sentry/r;->close()V

    invoke-virtual {v5}, Lio/sentry/c;->d()Lio/sentry/N2;

    move-result-object v0

    return-object v0

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

    :cond_2
    return-object v2
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-boolean v1, v0, Lio/sentry/G2;->f:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v2, "The transaction is already finished. Description %s cannot be set"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, v0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iput-object p1, v0, Lio/sentry/H2;->f:Ljava/lang/String;

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-boolean v1, v0, Lio/sentry/G2;->f:Z

    if-eqz v1, :cond_0

    iget-object p2, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {p2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "The transaction is already finished. Data %s cannot be set"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Lio/sentry/G2;->d(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;)Lio/sentry/g0;
    .locals 6

    new-instance v5, LZd;

    invoke-direct {v5}, LZd;-><init>()V

    const-string v1, "activity.load"

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lio/sentry/D2;->s(Ljava/lang/String;Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;LZd;)Lio/sentry/g0;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-boolean v0, v0, Lio/sentry/G2;->f:Z

    return v0
.end method

.method public final g()Lio/sentry/protocol/t;
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->a:Lio/sentry/protocol/t;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final h(Lio/sentry/L2;ZLio/sentry/H;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-boolean v0, v0, Lio/sentry/G2;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v2, p0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/G2;

    const/4 v3, 0x0

    iput-object v3, v2, Lio/sentry/G2;->i:Lio/sentry/I2;

    invoke-virtual {v2, p1, v0}, Lio/sentry/G2;->q(Lio/sentry/L2;Lio/sentry/H1;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v0, p2, p3}, Lio/sentry/D2;->x(Lio/sentry/L2;Lio/sentry/H1;ZLio/sentry/H;)V

    return-void
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v0, v0, Lio/sentry/H2;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final j(Ljava/lang/Number;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    invoke-virtual {v0, p1, p2}, Lio/sentry/G2;->j(Ljava/lang/Number;Ljava/lang/String;)V

    return-void
.end method

.method public final k()V
    .locals 6

    iget-object v0, p0, Lio/sentry/D2;->j:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/sentry/D2;->r:Lio/sentry/Q2;

    iget-object v1, v1, Lio/sentry/Q2;->g:Ljava/lang/Long;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lio/sentry/D2;->w()V

    iget-object v2, p0, Lio/sentry/D2;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance v2, Lio/sentry/B2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/sentry/B2;-><init>(Lio/sentry/D2;I)V

    iput-object v2, p0, Lio/sentry/D2;->g:Lio/sentry/B2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    iget-object v3, p0, Lio/sentry/D2;->g:Lio/sentry/B2;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_2
    iget-object v2, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v4, "Failed to schedule finish timer"

    invoke-interface {v2, v3, v4, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lio/sentry/D2;->o()Lio/sentry/L2;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lio/sentry/L2;->OK:Lio/sentry/L2;

    :goto_0
    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lio/sentry/D2;->q(Lio/sentry/L2;Lio/sentry/H1;)V

    iget-object v1, p0, Lio/sentry/D2;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
.end method

.method public final l(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/G0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/G2;->l(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/G0;)V

    return-void
.end method

.method public final m()Lio/sentry/H2;
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/G2;->c:Lio/sentry/H2;

    return-object v0
.end method

.method public final n(Lio/sentry/L2;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/sentry/D2;->q(Lio/sentry/L2;Lio/sentry/H1;)V

    return-void
.end method

.method public final o()Lio/sentry/L2;
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v0, v0, Lio/sentry/H2;->g:Lio/sentry/L2;

    return-object v0
.end method

.method public final p()Lio/sentry/H1;
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/G2;->b:Lio/sentry/H1;

    return-object v0
.end method

.method public final q(Lio/sentry/L2;Lio/sentry/H1;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lio/sentry/D2;->x(Lio/sentry/L2;Lio/sentry/H1;ZLio/sentry/H;)V

    return-void
.end method

.method public final r()V
    .locals 2

    invoke-virtual {p0}, Lio/sentry/D2;->o()Lio/sentry/L2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lio/sentry/D2;->q(Lio/sentry/L2;Lio/sentry/H1;)V

    return-void
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;LZd;)Lio/sentry/g0;
    .locals 10

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-boolean v0, v0, Lio/sentry/G2;->f:Z

    sget-object v1, Lio/sentry/U0;->a:Lio/sentry/U0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/D2;->o:Lio/sentry/n0;

    invoke-virtual {v0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-object v1

    :cond_1
    iget-object v0, p0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    iget-object v2, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/v2;->getMaxSpans()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v4, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object v9, p5

    invoke-virtual/range {v4 .. v9}, Lio/sentry/G2;->s(Ljava/lang/String;Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;LZd;)Lio/sentry/g0;

    move-result-object p1

    return-object p1

    :cond_2
    move-object v5, p1

    move-object v6, p2

    invoke-virtual {v2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string p3, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan."

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p1, p2, p3, p4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public final t()V
    .locals 4

    iget-object v0, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v0}, Lio/sentry/v1;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'configureScope\' call is a no-op."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, v0, Lio/sentry/v1;->e:Lio/sentry/l;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v1

    invoke-interface {v1, p0}, Lio/sentry/X;->w(Lio/sentry/i0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Error in the \'configureScope\' callback."

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final u()Lio/sentry/H1;
    .locals 1

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/G2;->a:Lio/sentry/H1;

    return-object v0
.end method

.method public final v()V
    .locals 3

    iget-object v0, p0, Lio/sentry/D2;->j:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/D2;->h:Lio/sentry/B2;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/D2;->h:Lio/sentry/B2;

    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    iget-object v1, p0, Lio/sentry/D2;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/D2;->h:Lio/sentry/B2;
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

.method public final w()V
    .locals 3

    iget-object v0, p0, Lio/sentry/D2;->j:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/D2;->g:Lio/sentry/B2;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/D2;->g:Lio/sentry/B2;

    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    iget-object v1, p0, Lio/sentry/D2;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/D2;->g:Lio/sentry/B2;
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

.method public final x(Lio/sentry/L2;Lio/sentry/H1;ZLio/sentry/H;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/G2;->b:Lio/sentry/H1;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {p2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object p2

    invoke-interface {p2}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object p2

    :cond_1
    iget-object v0, p0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/G2;

    iget-object v1, v1, Lio/sentry/G2;->h:LZd;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_2
    new-instance v0, Lio/sentry/C2;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lio/sentry/C2;-><init>(ZLio/sentry/L2;)V

    iput-object v0, p0, Lio/sentry/D2;->f:Lio/sentry/C2;

    iget-object p1, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-boolean p1, p1, Lio/sentry/G2;->f:Z

    if-nez p1, :cond_d

    iget-object p1, p0, Lio/sentry/D2;->r:Lio/sentry/Q2;

    iget-boolean p1, p1, Lio/sentry/Q2;->f:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/G2;

    iget-boolean v1, v0, Lio/sentry/G2;->f:Z

    if-nez v1, :cond_3

    iget-object v0, v0, Lio/sentry/G2;->b:Lio/sentry/H1;

    if-nez v0, :cond_3

    return-void

    :cond_4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v1, v0, Lio/sentry/G2;->i:Lio/sentry/I2;

    new-instance v2, Lio/sentry/D1;

    invoke-direct {v2, p0, v1, p1}, Lio/sentry/D1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v0, Lio/sentry/G2;->i:Lio/sentry/I2;

    iget-object v1, p0, Lio/sentry/D2;->f:Lio/sentry/C2;

    iget-object v1, v1, Lio/sentry/C2;->b:Lio/sentry/L2;

    invoke-virtual {v0, v1, p2}, Lio/sentry/G2;->q(Lio/sentry/L2;Lio/sentry/H1;)V

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    invoke-virtual {v0}, Lio/sentry/G2;->v()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object v0, v0, Lio/sentry/H2;->d:Lvx;

    if-nez v0, :cond_5

    move-object v0, v1

    goto :goto_2

    :cond_5
    iget-object v0, v0, Lvx;->d:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/Boolean;

    :goto_2
    invoke-virtual {p2, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {p2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p2

    invoke-virtual {p2}, Lio/sentry/v2;->getTransactionProfiler()Lio/sentry/j0;

    move-result-object p2

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v2}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v2

    invoke-interface {p2, p0, v0, v2}, Lio/sentry/j0;->b(Lio/sentry/D2;Ljava/util/List;Lio/sentry/v2;)Lio/sentry/h1;

    move-result-object p2

    goto :goto_3

    :cond_6
    move-object p2, v1

    :goto_3
    iget-object v0, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->isContinuousProfilingEnabled()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getProfileLifecycle()Lio/sentry/g1;

    move-result-object v0

    sget-object v2, Lio/sentry/g1;->TRACE:Lio/sentry/g1;

    if-ne v0, v2, :cond_7

    iget-object v0, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getContinuousProfiler()Lio/sentry/P;

    move-result-object v0

    invoke-interface {v0, v2}, Lio/sentry/P;->c(Lio/sentry/g1;)V

    :cond_7
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_8
    iget-object p1, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {p1}, Lio/sentry/v1;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p1}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Instance is disabled and this \'configureScope\' call is a no-op."

    invoke-interface {p1, v0, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    :cond_9
    :try_start_0
    iget-object v0, p1, Lio/sentry/v1;->e:Lio/sentry/l;

    invoke-virtual {v0, v1}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    new-instance v2, LQ9;

    const/4 v3, 0x4

    invoke-direct {v2, v3, p0, v0}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lio/sentry/X;->u(Lio/sentry/p1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v3, "Error in the \'configureScope\' callback."

    invoke-interface {p1, v2, v3, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    new-instance p1, Lio/sentry/protocol/A;

    invoke-direct {p1, p0}, Lio/sentry/protocol/A;-><init>(Lio/sentry/D2;)V

    iget-object v0, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lio/sentry/D2;->j:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_1
    iget-object v2, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    if-eqz v2, :cond_a

    invoke-virtual {p0}, Lio/sentry/D2;->w()V

    invoke-virtual {p0}, Lio/sentry/D2;->v()V

    iget-object v2, p0, Lio/sentry/D2;->i:Ljava/util/Timer;

    invoke-virtual {v2}, Ljava/util/Timer;->cancel()V

    iput-object v1, p0, Lio/sentry/D2;->i:Ljava/util/Timer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_6

    :cond_a
    :goto_5
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    goto :goto_8

    :goto_6
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw p1

    :cond_b
    :goto_8
    if-eqz p3, :cond_c

    iget-object p3, p0, Lio/sentry/D2;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_c

    iget-object p3, p0, Lio/sentry/D2;->r:Lio/sentry/Q2;

    iget-object p3, p3, Lio/sentry/Q2;->g:Ljava/lang/Long;

    if-eqz p3, :cond_c

    iget-object p1, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {p1}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    iget-object p3, p0, Lio/sentry/D2;->e:Ljava/lang/String;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Dropping idle transaction %s because it has no child spans"

    invoke-interface {p1, p2, p4, p3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_c
    iget-object p3, p1, Lio/sentry/protocol/A;->t:Ljava/util/HashMap;

    iget-object v0, p0, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object v0, v0, Lio/sentry/G2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p3, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    iget-object p3, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {p0}, Lio/sentry/D2;->b()Lio/sentry/N2;

    move-result-object v0

    invoke-virtual {p3, p1, v0, p4, p2}, Lio/sentry/v1;->o(Lio/sentry/protocol/A;Lio/sentry/N2;Lio/sentry/H;Lio/sentry/h1;)Lio/sentry/protocol/t;

    :cond_d
    return-void
.end method

.method public final y(Lio/sentry/G2;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/D2;->d:Lio/sentry/v1;

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/v2;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v1

    invoke-virtual {v0}, Lio/sentry/v1;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getContinuousProfiler()Lio/sentry/P;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/P;->s()Lio/sentry/protocol/t;

    move-result-object v0

    sget-object v2, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {v0, v2}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Lio/sentry/G2;->v()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "profiler_id"

    invoke-virtual {v0}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lio/sentry/G2;->d(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    invoke-interface {v1}, Lio/sentry/util/thread/a;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v2, "thread.id"

    invoke-virtual {p1, v2, v0}, Lio/sentry/G2;->d(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "thread.name"

    invoke-interface {v1}, Lio/sentry/util/thread/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/sentry/G2;->d(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
