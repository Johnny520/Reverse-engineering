.class public final Lio/sentry/android/core/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/P;
.implements Lio/sentry/transport/o;


# instance fields
.field public final a:Lio/sentry/ILogger;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Lio/sentry/c0;

.field public final e:Lio/sentry/android/core/I;

.field public f:Z

.field public final g:Lio/sentry/android/core/internal/util/o;

.field public h:Lio/sentry/android/core/p;

.field public i:Z

.field public j:Lio/sentry/Z;

.field public k:Ljava/util/concurrent/Future;

.field public l:Lio/sentry/m;

.field public final m:Ljava/util/ArrayList;

.field public n:Lio/sentry/protocol/t;

.field public o:Lio/sentry/protocol/t;

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public q:Lio/sentry/H1;

.field public volatile r:Z

.field public s:Z

.field public t:Z

.field public u:I

.field public final v:Lio/sentry/util/a;

.field public final w:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/I;Lio/sentry/android/core/internal/util/o;Lio/sentry/ILogger;Ljava/lang/String;ILio/sentry/c0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/g;->f:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/core/g;->h:Lio/sentry/android/core/p;

    iput-boolean v0, p0, Lio/sentry/android/core/g;->i:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/g;->m:Ljava/util/ArrayList;

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iput-object v1, p0, Lio/sentry/android/core/g;->n:Lio/sentry/protocol/t;

    iput-object v1, p0, Lio/sentry/android/core/g;->o:Lio/sentry/protocol/t;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/android/core/g;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v1, Lio/sentry/g2;

    invoke-direct {v1}, Lio/sentry/g2;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/g;->q:Lio/sentry/H1;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/sentry/android/core/g;->r:Z

    iput-boolean v0, p0, Lio/sentry/android/core/g;->s:Z

    iput-boolean v0, p0, Lio/sentry/android/core/g;->t:Z

    iput v0, p0, Lio/sentry/android/core/g;->u:I

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/g;->v:Lio/sentry/util/a;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/g;->w:Lio/sentry/util/a;

    iput-object p3, p0, Lio/sentry/android/core/g;->a:Lio/sentry/ILogger;

    iput-object p2, p0, Lio/sentry/android/core/g;->g:Lio/sentry/android/core/internal/util/o;

    iput-object p1, p0, Lio/sentry/android/core/g;->e:Lio/sentry/android/core/I;

    iput-object p4, p0, Lio/sentry/android/core/g;->b:Ljava/lang/String;

    iput p5, p0, Lio/sentry/android/core/g;->c:I

    iput-object p6, p0, Lio/sentry/android/core/g;->d:Lio/sentry/c0;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/g;->v:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iput v1, p0, Lio/sentry/android/core/g;->u:I

    const/4 v2, 0x1

    iput-boolean v2, p0, Lio/sentry/android/core/g;->s:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Lio/sentry/android/core/g;->e(Z)V

    iget-object p1, p0, Lio/sentry/android/core/g;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
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

.method public final b()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/g;->j:Lio/sentry/Z;

    if-eqz v0, :cond_0

    sget-object v1, Lio/sentry/O0;->b:Lio/sentry/O0;

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    sget-object v1, Lio/sentry/O0;->b:Lio/sentry/O0;

    if-eq v0, v1, :cond_1

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/g;->j:Lio/sentry/Z;

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getCompositePerformanceCollector()Lio/sentry/m;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/g;->l:Lio/sentry/m;

    iget-object v0, p0, Lio/sentry/android/core/g;->j:Lio/sentry/Z;

    invoke-interface {v0}, Lio/sentry/Z;->c()Lio/sentry/transport/p;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/sentry/transport/p;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final c(Lio/sentry/g1;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/g;->v:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/android/core/f;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lio/sentry/android/core/g;->s:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget p1, p0, Lio/sentry/android/core/g;->u:I

    sub-int/2addr p1, v1

    iput p1, p0, Lio/sentry/android/core/g;->u:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez p1, :cond_2

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :cond_2
    if-gez p1, :cond_3

    const/4 p1, 0x0

    :try_start_1
    iput p1, p0, Lio/sentry/android/core/g;->u:I

    :cond_3
    iput-boolean v1, p0, Lio/sentry/android/core/g;->s:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final d()V
    .locals 10

    invoke-virtual {p0}, Lio/sentry/android/core/g;->b()V

    iget-object v0, p0, Lio/sentry/android/core/g;->e:Lio/sentry/android/core/I;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p0, Lio/sentry/android/core/g;->f:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Lio/sentry/android/core/g;->a:Lio/sentry/ILogger;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lio/sentry/android/core/g;->f:Z

    iget-object v5, p0, Lio/sentry/android/core/g;->b:Ljava/lang/String;

    if-nez v5, :cond_1

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v4, "Disabling profiling because no profiling traces dir path is defined in options."

    new-array v5, v2, [Ljava/lang/Object;

    invoke-interface {v3, v0, v4, v5}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lio/sentry/android/core/g;->c:I

    if-gtz v0, :cond_2

    sget-object v4, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v5, "Disabling profiling because trace rate is set to %d"

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance v4, Lio/sentry/android/core/p;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x1

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v6

    long-to-int v6, v6

    div-int/2addr v6, v0

    const/4 v8, 0x0

    iget-object v9, p0, Lio/sentry/android/core/g;->a:Lio/sentry/ILogger;

    iget-object v7, p0, Lio/sentry/android/core/g;->g:Lio/sentry/android/core/internal/util/o;

    invoke-direct/range {v4 .. v9}, Lio/sentry/android/core/p;-><init>(Ljava/lang/String;ILio/sentry/android/core/internal/util/o;Lio/sentry/c0;Lio/sentry/ILogger;)V

    iput-object v4, p0, Lio/sentry/android/core/g;->h:Lio/sentry/android/core/p;

    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/g;->h:Lio/sentry/android/core/p;

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lio/sentry/android/core/g;->j:Lio/sentry/Z;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lio/sentry/Z;->c()Lio/sentry/transport/p;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v4, Lio/sentry/n;->All:Lio/sentry/n;

    invoke-virtual {v0, v4}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v4

    if-nez v4, :cond_4

    sget-object v4, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    invoke-virtual {v0, v4}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v1, "SDK is rate limited. Stopping profiler."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {v3, v0, v1, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lio/sentry/android/core/g;->e(Z)V

    return-void

    :cond_5
    iget-object v0, p0, Lio/sentry/android/core/g;->j:Lio/sentry/Z;

    invoke-interface {v0}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getConnectionStatusProvider()Lio/sentry/O;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/O;->g()Lio/sentry/M;

    move-result-object v0

    sget-object v4, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    if-ne v0, v4, :cond_6

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v1, "Device is offline. Stopping profiler."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {v3, v0, v1, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lio/sentry/android/core/g;->e(Z)V

    return-void

    :cond_6
    iget-object v0, p0, Lio/sentry/android/core/g;->j:Lio/sentry/Z;

    invoke-interface {v0}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/g;->q:Lio/sentry/H1;

    goto :goto_1

    :cond_7
    new-instance v0, Lio/sentry/g2;

    invoke-direct {v0}, Lio/sentry/g2;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/g;->q:Lio/sentry/H1;

    :goto_1
    iget-object v0, p0, Lio/sentry/android/core/g;->h:Lio/sentry/android/core/p;

    invoke-virtual {v0}, Lio/sentry/android/core/p;->c()LCp;

    move-result-object v0

    if-nez v0, :cond_8

    :goto_2
    return-void

    :cond_8
    iput-boolean v1, p0, Lio/sentry/android/core/g;->i:Z

    iget-object v0, p0, Lio/sentry/android/core/g;->n:Lio/sentry/protocol/t;

    sget-object v2, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    if-ne v0, v2, :cond_9

    new-instance v0, Lio/sentry/protocol/t;

    invoke-direct {v0}, Lio/sentry/protocol/t;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/g;->n:Lio/sentry/protocol/t;

    :cond_9
    iget-object v0, p0, Lio/sentry/android/core/g;->o:Lio/sentry/protocol/t;

    if-ne v0, v2, :cond_a

    new-instance v0, Lio/sentry/protocol/t;

    invoke-direct {v0}, Lio/sentry/protocol/t;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/g;->o:Lio/sentry/protocol/t;

    :cond_a
    iget-object v0, p0, Lio/sentry/android/core/g;->l:Lio/sentry/m;

    if-eqz v0, :cond_b

    iget-object v2, p0, Lio/sentry/android/core/g;->o:Lio/sentry/protocol/t;

    invoke-virtual {v2}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lio/sentry/m;->c(Ljava/lang/String;)V

    :cond_b
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/g;->d:Lio/sentry/c0;

    new-instance v2, Lio/sentry/S1;

    const/4 v4, 0x3

    invoke-direct {v2, v4, p0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    const-wide/32 v4, 0xea60

    invoke-interface {v0, v2, v4, v5}, Lio/sentry/c0;->q(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/g;->k:Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?"

    invoke-interface {v3, v2, v4, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v1, p0, Lio/sentry/android/core/g;->s:Z

    return-void
.end method

.method public final e(Z)V
    .locals 12

    invoke-virtual {p0}, Lio/sentry/android/core/g;->b()V

    iget-object v0, p0, Lio/sentry/android/core/g;->v:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/g;->k:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_7

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/g;->h:Lio/sentry/android/core/p;

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lio/sentry/android/core/g;->i:Z

    if-nez v0, :cond_1

    goto/16 :goto_6

    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/g;->e:Lio/sentry/android/core/I;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lio/sentry/android/core/g;->l:Lio/sentry/m;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lio/sentry/android/core/g;->o:Lio/sentry/protocol/t;

    invoke-virtual {v2}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lio/sentry/m;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Lio/sentry/android/core/g;->h:Lio/sentry/android/core/p;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lio/sentry/android/core/p;->a(Ljava/util/List;Z)Lio/sentry/android/core/o;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lio/sentry/android/core/g;->a:Lio/sentry/ILogger;

    if-nez v0, :cond_3

    :try_start_1
    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v4, "An error occurred while collecting a profile chunk, and it won\'t be sent."

    new-array v5, v3, [Ljava/lang/Object;

    invoke-interface {v2, v0, v4, v5}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v4, p0, Lio/sentry/android/core/g;->w:Lio/sentry/util/a;

    invoke-virtual {v4}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v5, p0, Lio/sentry/android/core/g;->m:Ljava/util/ArrayList;

    new-instance v6, Lio/sentry/d1;

    iget-object v7, p0, Lio/sentry/android/core/g;->n:Lio/sentry/protocol/t;

    iget-object v8, p0, Lio/sentry/android/core/g;->o:Lio/sentry/protocol/t;

    iget-object v9, v0, Lio/sentry/android/core/o;->d:Ljava/util/Map;

    iget-object v10, v0, Lio/sentry/android/core/o;->c:Ljava/io/File;

    iget-object v11, p0, Lio/sentry/android/core/g;->q:Lio/sentry/H1;

    invoke-direct/range {v6 .. v11}, Lio/sentry/d1;-><init>(Lio/sentry/protocol/t;Lio/sentry/protocol/t;Ljava/util/Map;Ljava/io/File;Lio/sentry/H1;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v4}, Lio/sentry/r;->close()V

    :goto_2
    iput-boolean v3, p0, Lio/sentry/android/core/g;->i:Z

    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iput-object v0, p0, Lio/sentry/android/core/g;->o:Lio/sentry/protocol/t;

    iget-object v0, p0, Lio/sentry/android/core/g;->j:Lio/sentry/Z;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v4}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v5

    new-instance v6, Lio/sentry/android/core/a0;

    const/4 v7, 0x2

    invoke-direct {v6, p0, v4, v0, v7}, Lio/sentry/android/core/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v5, v6}, Lio/sentry/c0;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v6, "Failed to send profile chunks."

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    if-eqz p1, :cond_5

    iget-boolean p1, p0, Lio/sentry/android/core/g;->s:Z

    if-nez p1, :cond_5

    sget-object p1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v0, "Profile chunk finished. Starting a new one."

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v2, p1, v0, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/sentry/android/core/g;->d()V

    goto :goto_4

    :cond_5
    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iput-object p1, p0, Lio/sentry/android/core/g;->n:Lio/sentry/protocol/t;

    sget-object p1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v0, "Profile chunk finished."

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v2, p1, v0, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_4
    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-void

    :catchall_2
    move-exception v0

    move-object p1, v0

    :try_start_6
    invoke-virtual {v4}, Lio/sentry/r;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    :try_start_7
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1

    :cond_6
    :goto_6
    sget-object p1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iput-object p1, p0, Lio/sentry/android/core/g;->n:Lio/sentry/protocol/t;

    iput-object p1, p0, Lio/sentry/android/core/g;->o:Lio/sentry/protocol/t;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-void

    :goto_7
    :try_start_8
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_8

    :catchall_4
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw p1
.end method

.method public final h(Lio/sentry/g1;Lio/sentry/O2;)V
    .locals 8

    iget-object v0, p0, Lio/sentry/android/core/g;->v:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/g;->r:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, Lio/sentry/util/h;->a()Lio/sentry/util/g;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/util/g;->c()D

    move-result-wide v4

    iget-object p2, p2, Lio/sentry/O2;->a:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getProfileSessionSampleRate()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    cmpg-double p2, v6, v4

    if-ltz p2, :cond_0

    move p2, v2

    goto :goto_0

    :cond_0
    move p2, v3

    :goto_0
    iput-boolean p2, p0, Lio/sentry/android/core/g;->t:Z

    iput-boolean v3, p0, Lio/sentry/android/core/g;->r:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_1
    iget-boolean p2, p0, Lio/sentry/android/core/g;->t:Z

    if-nez p2, :cond_2

    iget-object p1, p0, Lio/sentry/android/core/g;->a:Lio/sentry/ILogger;

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "Profiler was not started due to sampling decision."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :cond_2
    :try_start_1
    sget-object p2, Lio/sentry/android/core/f;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    if-eq p1, v2, :cond_4

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    goto :goto_2

    :cond_3
    iget-boolean p1, p0, Lio/sentry/android/core/g;->i:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lio/sentry/android/core/g;->a:Lio/sentry/ILogger;

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "Profiler is already running."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :cond_4
    :try_start_2
    iget p1, p0, Lio/sentry/android/core/g;->u:I

    if-gez p1, :cond_5

    iput v3, p0, Lio/sentry/android/core/g;->u:I

    :cond_5
    iget p1, p0, Lio/sentry/android/core/g;->u:I

    add-int/2addr p1, v2

    iput p1, p0, Lio/sentry/android/core/g;->u:I

    :cond_6
    :goto_2
    iget-boolean p1, p0, Lio/sentry/android/core/g;->i:Z

    if-nez p1, :cond_7

    iget-object p1, p0, Lio/sentry/android/core/g;->a:Lio/sentry/ILogger;

    sget-object p2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "Started Profiler."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/sentry/android/core/g;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_7
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_3
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
.end method

.method public final m(Lio/sentry/transport/p;)V
    .locals 4

    sget-object v0, Lio/sentry/n;->All:Lio/sentry/n;

    invoke-virtual {p1, v0}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    invoke-virtual {p1, v0}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    sget-object p1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v0, "SDK is rate limited. Stopping profiler."

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lio/sentry/android/core/g;->a:Lio/sentry/ILogger;

    invoke-interface {v3, p1, v0, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lio/sentry/android/core/g;->e(Z)V

    return-void
.end method

.method public final p()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/sentry/android/core/g;->r:Z

    return-void
.end method

.method public final s()Lio/sentry/protocol/t;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/g;->n:Lio/sentry/protocol/t;

    return-object v0
.end method
