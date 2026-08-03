.class public final Lio/sentry/transport/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/transport/g;


# instance fields
.field public final a:Lio/sentry/transport/n;

.field public final b:Lio/sentry/cache/d;

.field public final c:Lio/sentry/v2;

.field public final d:Lio/sentry/transport/p;

.field public final e:Lio/sentry/transport/h;

.field public final f:Lio/sentry/transport/e;

.field public volatile g:Lio/sentry/transport/b;


# direct methods
.method public constructor <init>(Lio/sentry/v2;Lio/sentry/transport/p;Lio/sentry/transport/h;Lio/sentry/internal/debugmeta/c;)V
    .locals 7

    invoke-virtual {p1}, Lio/sentry/v2;->getMaxQueueSize()I

    move-result v1

    invoke-virtual {p1}, Lio/sentry/v2;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    invoke-virtual {p1}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object v5

    new-instance v3, Lio/sentry/transport/a;

    invoke-direct {v3, v0, v4}, Lio/sentry/transport/a;-><init>(Lio/sentry/cache/d;Lio/sentry/ILogger;)V

    new-instance v0, Lio/sentry/transport/n;

    new-instance v2, Lio/sentry/J;

    const/4 v6, 0x4

    invoke-direct {v2, v6}, Lio/sentry/J;-><init>(I)V

    invoke-direct/range {v0 .. v5}, Lio/sentry/transport/n;-><init>(ILio/sentry/J;Lio/sentry/transport/a;Lio/sentry/ILogger;Lio/sentry/I1;)V

    new-instance v1, Lio/sentry/transport/e;

    invoke-direct {v1, p1, p4, p2}, Lio/sentry/transport/e;-><init>(Lio/sentry/v2;Lio/sentry/internal/debugmeta/c;Lio/sentry/transport/p;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, 0x0

    iput-object p4, p0, Lio/sentry/transport/c;->g:Lio/sentry/transport/b;

    iput-object v0, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    invoke-virtual {p1}, Lio/sentry/v2;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    move-result-object p4

    const-string v0, "envelopeCache is required"

    invoke-static {v0, p4}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p4, p0, Lio/sentry/transport/c;->b:Lio/sentry/cache/d;

    iput-object p1, p0, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    iput-object p2, p0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    const-string p1, "transportGate is required"

    invoke-static {p1, p3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p3, p0, Lio/sentry/transport/c;->e:Lio/sentry/transport/h;

    iput-object v1, p0, Lio/sentry/transport/c;->f:Lio/sentry/transport/e;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 6

    const-string v0, "Failed to shutdown the async connection async sender  within "

    iget-object v1, p0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    invoke-virtual {v1}, Lio/sentry/transport/p;->close()V

    iget-object v1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    iget-object v1, p0, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "Shutting down"

    invoke-interface {v1, v2, v5, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getFlushTimeoutMillis()J

    move-result-wide v1

    iget-object p1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v4, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms. Trying to force it now."

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    invoke-interface {p1, v4, v0, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    iget-object p1, p0, Lio/sentry/transport/c;->g:Lio/sentry/transport/b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getRejectedExecutionHandler()Ljava/util/concurrent/RejectedExecutionHandler;

    move-result-object p1

    iget-object v0, p0, Lio/sentry/transport/c;->g:Lio/sentry/transport/b;

    iget-object v1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    invoke-interface {p1, v0, v1}, Ljava/util/concurrent/RejectedExecutionHandler;->rejectedExecution(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object p1, p0, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v1, "Thread interrupted while closing the connection."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-void
.end method

.method public final b(J)V
    .locals 3

    iget-object v0, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v1, v0, Lio/sentry/transport/n;->e:Lio/sentry/B0;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lio/sentry/B0;->a:Ljava/lang/Object;

    check-cast v1, Lio/sentry/transport/q;

    invoke-virtual {v2, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p1, p2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->tryAcquireSharedNanos(IJ)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, v0, Lio/sentry/transport/n;->c:Lio/sentry/ILogger;

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v1, "Failed to wait till idle"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final c()Lio/sentry/transport/p;
    .locals 1

    iget-object v0, p0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    return-object v0
.end method

.method public final close()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/transport/c;->a(Z)V

    return-void
.end method

.method public final e()Z
    .locals 8

    iget-object v0, p0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/util/Date;

    iget-object v2, v0, Lio/sentry/transport/p;->a:Lio/sentry/transport/d;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    iget-object v0, v0, Lio/sentry/transport/p;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/n;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Date;

    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v5

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    iget-object v1, p0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    iget-object v2, v1, Lio/sentry/transport/n;->b:Lio/sentry/H1;

    if-nez v2, :cond_3

    :cond_2
    move v1, v4

    goto :goto_1

    :cond_3
    iget-object v1, v1, Lio/sentry/transport/n;->d:Lio/sentry/I1;

    invoke-interface {v1}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v1

    invoke-virtual {v1, v2}, Lio/sentry/H1;->b(Lio/sentry/H1;)J

    move-result-wide v1

    const-wide/32 v6, 0x77359400

    cmp-long v1, v1, v6

    if-gez v1, :cond_2

    move v1, v5

    :goto_1
    if-nez v0, :cond_4

    if-nez v1, :cond_4

    return v5

    :cond_4
    return v4
.end method

.method public final j(Lio/sentry/internal/debugmeta/c;Lio/sentry/H;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v1, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    const-class v4, Lio/sentry/hints/d;

    invoke-static {v2, v4}, Lio/sentry/config/a;->v(Lio/sentry/H;Ljava/lang/Class;)Z

    move-result v4

    iget-object v6, v0, Lio/sentry/transport/c;->c:Lio/sentry/v2;

    iget-object v7, v0, Lio/sentry/transport/c;->b:Lio/sentry/cache/d;

    const/4 v8, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v9, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v10, "Captured Envelope is already cached"

    new-array v11, v8, [Ljava/lang/Object;

    invoke-interface {v4, v9, v10, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v4, Lio/sentry/transport/i;->a:Lio/sentry/transport/i;

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    move-object v4, v7

    move v9, v8

    :goto_0
    iget-object v10, v0, Lio/sentry/transport/c;->d:Lio/sentry/transport/p;

    iget-object v11, v10, Lio/sentry/transport/p;->b:Lio/sentry/v2;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v14, 0x0

    :cond_1
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lio/sentry/P1;

    iget-object v5, v15, Lio/sentry/P1;->a:Lio/sentry/Q1;

    iget-object v5, v5, Lio/sentry/Q1;->e:Lio/sentry/Z1;

    invoke-virtual {v5}, Lio/sentry/Z1;->getItemType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v16

    const/16 v17, -0x1

    sparse-switch v16, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v13, "transaction"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const/16 v17, 0x9

    goto/16 :goto_2

    :sswitch_1
    const-string v13, "session"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto/16 :goto_2

    :cond_3
    const/16 v17, 0x8

    goto/16 :goto_2

    :sswitch_2
    const-string v13, "check_in"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    const/16 v17, 0x7

    goto :goto_2

    :sswitch_3
    const-string v13, "event"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const/16 v17, 0x6

    goto :goto_2

    :sswitch_4
    const-string v13, "log"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    const/16 v17, 0x5

    goto :goto_2

    :sswitch_5
    const-string v13, "feedback"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_2

    :cond_7
    const/16 v17, 0x4

    goto :goto_2

    :sswitch_6
    const-string v13, "profile"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_2

    :cond_8
    const/16 v17, 0x3

    goto :goto_2

    :sswitch_7
    const-string v13, "profile_chunk"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_2

    :cond_9
    const/16 v17, 0x2

    goto :goto_2

    :sswitch_8
    const-string v13, "replay_video"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_2

    :cond_a
    const/16 v17, 0x1

    goto :goto_2

    :sswitch_9
    const-string v13, "attachment"

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_2

    :cond_b
    move/from16 v17, v8

    :goto_2
    packed-switch v17, :pswitch_data_0

    sget-object v5, Lio/sentry/n;->Unknown:Lio/sentry/n;

    goto :goto_3

    :pswitch_0
    sget-object v5, Lio/sentry/n;->Transaction:Lio/sentry/n;

    goto :goto_3

    :pswitch_1
    sget-object v5, Lio/sentry/n;->Session:Lio/sentry/n;

    goto :goto_3

    :pswitch_2
    sget-object v5, Lio/sentry/n;->Monitor:Lio/sentry/n;

    goto :goto_3

    :pswitch_3
    sget-object v5, Lio/sentry/n;->Error:Lio/sentry/n;

    goto :goto_3

    :pswitch_4
    sget-object v5, Lio/sentry/n;->LogItem:Lio/sentry/n;

    goto :goto_3

    :pswitch_5
    sget-object v5, Lio/sentry/n;->Feedback:Lio/sentry/n;

    goto :goto_3

    :pswitch_6
    sget-object v5, Lio/sentry/n;->Profile:Lio/sentry/n;

    goto :goto_3

    :pswitch_7
    sget-object v5, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    goto :goto_3

    :pswitch_8
    sget-object v5, Lio/sentry/n;->Replay:Lio/sentry/n;

    goto :goto_3

    :pswitch_9
    sget-object v5, Lio/sentry/n;->Attachment:Lio/sentry/n;

    :goto_3
    invoke-virtual {v10, v5}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v14, :cond_c

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    :cond_c
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v5

    sget-object v13, Lio/sentry/clientreport/d;->RATELIMIT_BACKOFF:Lio/sentry/clientreport/d;

    invoke-interface {v5, v13, v15}, Lio/sentry/clientreport/f;->f(Lio/sentry/clientreport/d;Lio/sentry/P1;)V

    goto/16 :goto_1

    :cond_d
    if-eqz v14, :cond_14

    invoke-virtual {v11}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    sget-object v10, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v12

    const-string v13, "%d envelope items will be dropped due rate limiting."

    invoke-interface {v5, v10, v13, v12}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_e
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/sentry/P1;

    invoke-interface {v14, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_f
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v11}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v5, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v10, "Envelope discarded due all items rate limited."

    new-array v12, v8, [Ljava/lang/Object;

    invoke-interface {v3, v5, v10, v12}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v5

    const-class v10, Lio/sentry/hints/j;

    invoke-virtual {v10, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    if-eqz v3, :cond_10

    check-cast v3, Lio/sentry/hints/j;

    invoke-interface {v3, v8}, Lio/sentry/hints/j;->b(Z)V

    :cond_10
    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v5

    const-class v10, Lio/sentry/hints/g;

    invoke-virtual {v10, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    if-eqz v3, :cond_11

    check-cast v3, Lio/sentry/hints/g;

    invoke-interface {v3, v8}, Lio/sentry/hints/g;->e(Z)V

    :cond_11
    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v5

    const-class v10, Lio/sentry/hints/c;

    invoke-virtual {v10, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    if-eqz v3, :cond_12

    check-cast v3, Lio/sentry/hints/c;

    iget-object v3, v3, Lio/sentry/hints/c;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    invoke-virtual {v11}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    sget-object v5, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v10, "Disk flush envelope fired due to rate limit"

    new-array v11, v8, [Ljava/lang/Object;

    invoke-interface {v3, v5, v10, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_12
    const/4 v13, 0x0

    goto :goto_5

    :cond_13
    new-instance v13, Lio/sentry/internal/debugmeta/c;

    iget-object v3, v1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v3, Lio/sentry/J1;

    invoke-direct {v13, v3, v5}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/J1;Ljava/util/List;)V

    goto :goto_5

    :cond_14
    move-object v13, v1

    :goto_5
    if-nez v13, :cond_15

    if-eqz v9, :cond_18

    invoke-interface {v7, v1}, Lio/sentry/cache/d;->p(Lio/sentry/internal/debugmeta/c;)V

    return-void

    :cond_15
    const-class v1, Lio/sentry/R2;

    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v6}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v1

    invoke-interface {v1, v13}, Lio/sentry/clientreport/f;->g(Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;

    move-result-object v13

    :cond_16
    new-instance v1, Lio/sentry/transport/b;

    invoke-direct {v1, v0, v13, v2, v4}, Lio/sentry/transport/b;-><init>(Lio/sentry/transport/c;Lio/sentry/internal/debugmeta/c;Lio/sentry/H;Lio/sentry/cache/d;)V

    iget-object v3, v0, Lio/sentry/transport/c;->a:Lio/sentry/transport/n;

    invoke-virtual {v3, v1}, Lio/sentry/transport/n;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual {v6}, Lio/sentry/v2;->getClientReportRecorder()Lio/sentry/clientreport/f;

    move-result-object v1

    sget-object v2, Lio/sentry/clientreport/d;->QUEUE_OVERFLOW:Lio/sentry/clientreport/d;

    invoke-interface {v1, v2, v13}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V

    return-void

    :cond_17
    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Lio/sentry/config/a;->s(Lio/sentry/H;)Ljava/lang/Object;

    move-result-object v2

    const-class v3, Lio/sentry/v;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    if-eqz v1, :cond_18

    check-cast v1, Lio/sentry/v;

    iget-object v2, v1, Lio/sentry/v;->g:Ljava/util/Queue;

    iget-object v1, v1, Lio/sentry/v;->f:Ljava/lang/String;

    invoke-interface {v2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Envelope enqueued"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_18
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7508a6dd -> :sswitch_9
        -0x61b909dd -> :sswitch_8
        -0x2b7e93a9 -> :sswitch_7
        -0x12717657 -> :sswitch_6
        -0xb6a147b -> :sswitch_5
        0x1a344 -> :sswitch_4
        0x5c6729a -> :sswitch_3
        0x5b9b0fbc -> :sswitch_2
        0x76508296 -> :sswitch_1
        0x7fa0d2de -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
