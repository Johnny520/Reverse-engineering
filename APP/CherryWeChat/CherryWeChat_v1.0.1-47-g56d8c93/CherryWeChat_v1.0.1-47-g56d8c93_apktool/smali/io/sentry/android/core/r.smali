.class public final Lio/sentry/android/core/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/j0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/sentry/ILogger;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:I

.field public final f:Lio/sentry/c0;

.field public final g:Lio/sentry/android/core/I;

.field public h:Z

.field public i:I

.field public final j:Lio/sentry/android/core/internal/util/o;

.field public k:Lio/sentry/i1;

.field public l:Lio/sentry/android/core/p;

.field public m:J

.field public n:J

.field public o:Ljava/util/Date;

.field public final p:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/I;Lio/sentry/android/core/internal/util/o;Lio/sentry/ILogger;Ljava/lang/String;ZILio/sentry/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/r;->h:Z

    iput v0, p0, Lio/sentry/android/core/r;->i:I

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/r;->l:Lio/sentry/android/core/p;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/r;->p:Lio/sentry/util/a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/r;->a:Landroid/content/Context;

    const-string p1, "ILogger is required"

    invoke-static {p1, p4}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p4, p0, Lio/sentry/android/core/r;->b:Lio/sentry/ILogger;

    iput-object p3, p0, Lio/sentry/android/core/r;->j:Lio/sentry/android/core/internal/util/o;

    const-string p1, "The BuildInfoProvider is required."

    invoke-static {p1, p2}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/android/core/r;->g:Lio/sentry/android/core/I;

    iput-object p5, p0, Lio/sentry/android/core/r;->c:Ljava/lang/String;

    iput-boolean p6, p0, Lio/sentry/android/core/r;->d:Z

    iput p7, p0, Lio/sentry/android/core/r;->e:I

    const-string p1, "The ISentryExecutorService is required."

    invoke-static {p1, p8}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p8, p0, Lio/sentry/android/core/r;->f:Lio/sentry/c0;

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/core/r;->o:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    iget-boolean v0, p0, Lio/sentry/android/core/r;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/sentry/android/core/r;->h:Z

    iget-boolean v0, p0, Lio/sentry/android/core/r;->d:Z

    const/4 v1, 0x0

    iget-object v2, p0, Lio/sentry/android/core/r;->b:Lio/sentry/ILogger;

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "Profiling is disabled in options."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v2, v0, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v5, p0, Lio/sentry/android/core/r;->c:Ljava/lang/String;

    if-nez v5, :cond_2

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v3, "Disabling profiling because no profiling traces dir path is defined in options."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v2, v0, v3, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    iget v0, p0, Lio/sentry/android/core/r;->e:I

    if-gtz v0, :cond_3

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Disabling profiling because trace rate is set to %d"

    invoke-interface {v2, v1, v3, v0}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    new-instance v4, Lio/sentry/android/core/p;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v1

    long-to-int v1, v1

    div-int v6, v1, v0

    iget-object v8, p0, Lio/sentry/android/core/r;->f:Lio/sentry/c0;

    iget-object v9, p0, Lio/sentry/android/core/r;->b:Lio/sentry/ILogger;

    iget-object v7, p0, Lio/sentry/android/core/r;->j:Lio/sentry/android/core/internal/util/o;

    invoke-direct/range {v4 .. v9}, Lio/sentry/android/core/p;-><init>(Ljava/lang/String;ILio/sentry/android/core/internal/util/o;Lio/sentry/c0;Lio/sentry/ILogger;)V

    iput-object v4, p0, Lio/sentry/android/core/r;->l:Lio/sentry/android/core/p;

    return-void
.end method

.method public final b(Lio/sentry/D2;Ljava/util/List;Lio/sentry/v2;)Lio/sentry/h1;
    .locals 9

    iget-object v0, p0, Lio/sentry/android/core/r;->p:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_0
    iget-object v3, p1, Lio/sentry/D2;->e:Ljava/lang/String;

    iget-object v0, p1, Lio/sentry/D2;->a:Lio/sentry/protocol/t;

    invoke-virtual {v0}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p1, p1, Lio/sentry/D2;->b:Lio/sentry/G2;

    iget-object p1, p1, Lio/sentry/G2;->c:Lio/sentry/H2;

    iget-object p1, p1, Lio/sentry/H2;->a:Lio/sentry/protocol/t;

    invoke-virtual {p1}, Lio/sentry/protocol/t;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object v2, p0

    move-object v7, p2

    move-object v8, p3

    invoke-virtual/range {v2 .. v8}, Lio/sentry/android/core/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/v2;)Lio/sentry/h1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p2, v0

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/v2;)Lio/sentry/h1;
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v8, p3

    move-object/from16 v0, p6

    iget-object v2, v1, Lio/sentry/android/core/r;->g:Lio/sentry/android/core/I;

    iget-object v3, v1, Lio/sentry/android/core/r;->p:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v23

    :try_start_0
    iget-object v3, v1, Lio/sentry/android/core/r;->l:Lio/sentry/android/core/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-virtual/range {v23 .. v23}, Lio/sentry/r;->close()V

    return-object v4

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Lio/sentry/android/core/r;->k:Lio/sentry/i1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v5, v1, Lio/sentry/android/core/r;->b:Lio/sentry/ILogger;

    if-eqz v3, :cond_d

    :try_start_2
    iget-object v3, v3, Lio/sentry/i1;->a:Ljava/lang/String;

    move-object/from16 v7, p2

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_7

    :cond_1
    iget v3, v1, Lio/sentry/android/core/r;->i:I

    const/4 v9, 0x1

    if-lez v3, :cond_2

    sub-int/2addr v3, v9

    iput v3, v1, Lio/sentry/android/core/r;->i:I

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_8

    :cond_2
    :goto_0
    sget-object v3, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v10, "Transaction %s (%s) finished."

    filled-new-array {v6, v8}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v5, v3, v10, v11}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    iget v3, v1, Lio/sentry/android/core/r;->i:I

    if-eqz v3, :cond_4

    iget-object v0, v1, Lio/sentry/android/core/r;->k:Lio/sentry/i1;

    if-eqz v0, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v5, v1, Lio/sentry/android/core/r;->m:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-wide v6, v1, Lio/sentry/android/core/r;->n:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0, v2, v3, v5, v6}, Lio/sentry/i1;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    invoke-virtual/range {v23 .. v23}, Lio/sentry/r;->close()V

    return-object v4

    :cond_4
    :try_start_3
    iget-object v3, v1, Lio/sentry/android/core/r;->l:Lio/sentry/android/core/p;

    const/4 v5, 0x0

    move-object/from16 v10, p5

    invoke-virtual {v3, v10, v5}, Lio/sentry/android/core/p;->a(Ljava/util/List;Z)Lio/sentry/android/core/o;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v3, :cond_5

    invoke-virtual/range {v23 .. v23}, Lio/sentry/r;->close()V

    return-object v4

    :cond_5
    :try_start_4
    iget-wide v10, v3, Lio/sentry/android/core/o;->a:J

    iget-wide v12, v1, Lio/sentry/android/core/r;->m:J

    sub-long v12, v10, v12

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v9}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v9, v1, Lio/sentry/android/core/r;->k:Lio/sentry/i1;

    if-eqz v9, :cond_6

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    iput-object v4, v1, Lio/sentry/android/core/r;->k:Lio/sentry/i1;

    iput v5, v1, Lio/sentry/android/core/r;->i:I

    const-string v9, "0"

    instance-of v15, v0, Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v15, :cond_7

    iget-object v4, v1, Lio/sentry/android/core/r;->a:Landroid/content/Context;

    move-object v15, v0

    check-cast v15, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v4, v15}, Lio/sentry/android/core/M;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/M;

    move-result-object v4

    iget-object v4, v4, Lio/sentry/android/core/M;->h:Ljava/lang/Long;

    :cond_7
    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v9

    :cond_8
    move-object/from16 v17, v9

    sget-object v4, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lio/sentry/i1;

    move/from16 v16, v5

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-wide v6, v1, Lio/sentry/android/core/r;->m:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-wide v7, v3, Lio/sentry/android/core/o;->b:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    move-object/from16 p5, v9

    iget-wide v8, v1, Lio/sentry/android/core/r;->n:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v15, v5, v6, v7, v8}, Lio/sentry/i1;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p5

    move/from16 v5, v16

    goto :goto_1

    :cond_9
    move/from16 v16, v5

    move-object v5, v2

    new-instance v2, Lio/sentry/h1;

    iget-object v6, v3, Lio/sentry/android/core/o;->c:Ljava/io/File;

    iget-object v7, v1, Lio/sentry/android/core/r;->o:Ljava/util/Date;

    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v9

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    if-eqz v4, :cond_a

    array-length v8, v4

    if-lez v8, :cond_a

    aget-object v4, v4, v16

    :goto_2
    move-object v11, v4

    goto :goto_3

    :cond_a
    const-string v4, ""

    goto :goto_2

    :goto_3
    new-instance v12, Lio/sentry/I;

    const/4 v4, 0x3

    invoke-direct {v12, v4}, Lio/sentry/I;-><init>(I)V

    sget-object v13, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    move-object v4, v5

    move-object v5, v14

    sget-object v14, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v15, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v4}, Lio/sentry/android/core/I;->b()Ljava/lang/Boolean;

    move-result-object v16

    invoke-virtual {v0}, Lio/sentry/v2;->getProguardUuid()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lio/sentry/v2;->getRelease()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lio/sentry/v2;->getEnvironment()Ljava/lang/String;

    move-result-object v20

    iget-boolean v0, v3, Lio/sentry/android/core/o;->e:Z

    if-nez v0, :cond_c

    if-eqz p4, :cond_b

    goto :goto_5

    :cond_b
    const-string v0, "normal"

    :goto_4
    move-object/from16 v21, v0

    goto :goto_6

    :cond_c
    :goto_5
    const-string v0, "timeout"

    goto :goto_4

    :goto_6
    iget-object v0, v3, Lio/sentry/android/core/o;->d:Ljava/util/Map;

    move-object/from16 v8, p3

    move-object/from16 v22, v0

    move-object v3, v6

    move-object v4, v7

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v22}, Lio/sentry/h1;-><init>(Ljava/io/File;Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual/range {v23 .. v23}, Lio/sentry/r;->close()V

    return-object v2

    :cond_d
    :goto_7
    :try_start_5
    sget-object v0, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v2, "Transaction %s (%s) finished, but was not currently being profiled. Skipping"

    filled-new-array {v6, v8}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v5, v0, v2, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual/range {v23 .. v23}, Lio/sentry/r;->close()V

    return-object v4

    :goto_8
    :try_start_6
    invoke-virtual/range {v23 .. v23}, Lio/sentry/r;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v2
.end method

.method public final close()V
    .locals 9

    iget-object v0, p0, Lio/sentry/android/core/r;->k:Lio/sentry/i1;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v3, v0, Lio/sentry/i1;->c:Ljava/lang/String;

    iget-object v4, v0, Lio/sentry/i1;->a:Ljava/lang/String;

    iget-object v5, v0, Lio/sentry/i1;->b:Ljava/lang/String;

    invoke-static {}, Lio/sentry/z1;->b()Lio/sentry/Z;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/Z;->l()Lio/sentry/v2;

    move-result-object v8

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p0

    invoke-virtual/range {v2 .. v8}, Lio/sentry/android/core/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/v2;)Lio/sentry/h1;

    goto :goto_0

    :cond_0
    move-object v2, p0

    iget v0, v2, Lio/sentry/android/core/r;->i:I

    if-eqz v0, :cond_1

    sub-int/2addr v0, v1

    iput v0, v2, Lio/sentry/android/core/r;->i:I

    :cond_1
    :goto_0
    iget-object v0, v2, Lio/sentry/android/core/r;->l:Lio/sentry/android/core/p;

    if-eqz v0, :cond_4

    iget-object v3, v0, Lio/sentry/android/core/p;->o:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v3

    :try_start_0
    iget-object v4, v0, Lio/sentry/android/core/p;->d:Ljava/util/concurrent/Future;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v4, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v5, v0, Lio/sentry/android/core/p;->d:Ljava/util/concurrent/Future;

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    iget-boolean v4, v0, Lio/sentry/android/core/p;->n:Z

    if-eqz v4, :cond_3

    invoke-virtual {v0, v5, v1}, Lio/sentry/android/core/p;->a(Ljava/util/List;Z)Lio/sentry/android/core/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-virtual {v3}, Lio/sentry/r;->close()V

    return-void

    :goto_2
    :try_start_1
    invoke-virtual {v3}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1

    :cond_4
    return-void
.end method

.method public final isRunning()Z
    .locals 1

    iget v0, p0, Lio/sentry/android/core/r;->i:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final start()V
    .locals 7

    iget-object v0, p0, Lio/sentry/android/core/r;->p:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/r;->g:Lio/sentry/android/core/I;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lio/sentry/android/core/r;->a()V

    iget v1, p0, Lio/sentry/android/core/r;->i:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lio/sentry/android/core/r;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, p0, Lio/sentry/android/core/r;->b:Lio/sentry/ILogger;

    const/4 v4, 0x0

    if-ne v1, v2, :cond_2

    :try_start_1
    iget-object v1, p0, Lio/sentry/android/core/r;->l:Lio/sentry/android/core/p;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/sentry/android/core/p;->c()LCp;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v5, v1, LCp;->a:J

    iput-wide v5, p0, Lio/sentry/android/core/r;->m:J

    iget-wide v5, v1, LCp;->b:J

    iput-wide v5, p0, Lio/sentry/android/core/r;->n:J

    iget-object v1, v1, LCp;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iput-object v1, p0, Lio/sentry/android/core/r;->o:Ljava/util/Date;

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v2, "Profiler started."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v3, v1, v2, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    :goto_0
    iget v1, p0, Lio/sentry/android/core/r;->i:I

    sub-int/2addr v1, v2

    iput v1, p0, Lio/sentry/android/core/r;->i:I

    sget-object v1, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v2, "A profile is already running. This profile will be ignored."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v3, v1, v2, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_2
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
.end method

.method public final u(Lio/sentry/i0;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/r;->p:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget v1, p0, Lio/sentry/android/core/r;->i:I

    if-lez v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/r;->k:Lio/sentry/i1;

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/i1;

    iget-wide v2, p0, Lio/sentry/android/core/r;->m:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Lio/sentry/android/core/r;->n:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3}, Lio/sentry/i1;-><init>(Lio/sentry/i0;Ljava/lang/Long;Ljava/lang/Long;)V

    iput-object v1, p0, Lio/sentry/android/core/r;->k:Lio/sentry/i1;
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
