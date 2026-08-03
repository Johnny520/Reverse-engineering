.class public final Lio/sentry/logger/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/logger/a;


# static fields
.field public static final f:Lio/sentry/util/a;


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Lio/sentry/F1;

.field public final c:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final d:Lio/sentry/U1;

.field public final e:Lio/sentry/B0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lio/sentry/logger/b;->f:Lio/sentry/util/a;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v2;Lio/sentry/F1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/B0;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/B0;-><init>(IZ)V

    iput-object v0, p0, Lio/sentry/logger/b;->e:Lio/sentry/B0;

    iput-object p1, p0, Lio/sentry/logger/b;->a:Lio/sentry/v2;

    iput-object p2, p0, Lio/sentry/logger/b;->b:Lio/sentry/F1;

    new-instance p2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p2, p0, Lio/sentry/logger/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance p2, Lio/sentry/U1;

    invoke-direct {p2, p1}, Lio/sentry/U1;-><init>(Lio/sentry/v2;)V

    iput-object p2, p0, Lio/sentry/logger/b;->d:Lio/sentry/U1;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    iget-object v0, p0, Lio/sentry/logger/b;->d:Lio/sentry/U1;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lio/sentry/logger/b;->d(Z)V

    new-instance p1, Lio/sentry/S1;

    const/16 v1, 0xb

    invoke-direct {p1, v1, p0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Lio/sentry/U1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_0
    iget-object p1, p0, Lio/sentry/logger/b;->a:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getShutdownTimeoutMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/sentry/U1;->g(J)V

    :goto_0
    iget-object p1, p0, Lio/sentry/logger/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lio/sentry/logger/b;->c()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b(J)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lio/sentry/logger/b;->d(Z)V

    :try_start_0
    iget-object v1, p0, Lio/sentry/logger/b;->e:Lio/sentry/B0;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v1, Lio/sentry/transport/q;

    invoke-virtual {v2, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-virtual {v1, v0, p1, p2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->tryAcquireSharedNanos(IJ)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lio/sentry/logger/b;->a:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Failed to flush log events"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final c()V
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    :cond_0
    iget-object v2, p0, Lio/sentry/logger/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/c2;

    if-eqz v3, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v2, v1, :cond_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lio/sentry/d2;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lio/sentry/d2;-><init>(ILjava/lang/Object;)V

    iget-object v3, p0, Lio/sentry/logger/b;->b:Lio/sentry/F1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-virtual {v3, v1}, Lio/sentry/F1;->m(Lio/sentry/d2;)Lio/sentry/internal/debugmeta/c;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v4}, Lio/sentry/F1;->s(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)Lio/sentry/protocol/t;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v3, v3, Lio/sentry/F1;->b:Lio/sentry/v2;

    invoke-virtual {v3}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v4, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v5, "Capturing log failed."

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v3, v4, v1, v5, v6}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_3

    iget-object v1, p0, Lio/sentry/logger/b;->e:Lio/sentry/B0;

    iget-object v1, v1, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v1, Lio/sentry/transport/q;

    sget v3, Lio/sentry/transport/q;->a:I

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final d(Z)V
    .locals 5

    sget-object v0, Lio/sentry/logger/b;->f:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x1388

    :goto_0
    :try_start_0
    iget-object v1, p0, Lio/sentry/logger/b;->d:Lio/sentry/U1;

    new-instance v2, Lio/sentry/H0;

    const/4 v3, 0x7

    invoke-direct {v2, v3, p0}, Lio/sentry/H0;-><init>(ILjava/lang/Object;)V

    int-to-long v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lio/sentry/U1;->q(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method
