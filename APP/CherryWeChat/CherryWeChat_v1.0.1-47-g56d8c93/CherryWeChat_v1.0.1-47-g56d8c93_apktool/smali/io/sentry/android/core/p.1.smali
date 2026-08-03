.class public final Lio/sentry/android/core/p;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:J

.field public final b:Ljava/io/File;

.field public final c:I

.field public d:Ljava/util/concurrent/Future;

.field public e:Ljava/io/File;

.field public f:Ljava/lang/String;

.field public final g:Lio/sentry/android/core/internal/util/o;

.field public final h:Ljava/util/ArrayDeque;

.field public final i:Ljava/util/ArrayDeque;

.field public final j:Ljava/util/ArrayDeque;

.field public final k:Ljava/util/HashMap;

.field public final l:Lio/sentry/c0;

.field public final m:Lio/sentry/ILogger;

.field public n:Z

.field public final o:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILio/sentry/android/core/internal/util/o;Lio/sentry/c0;Lio/sentry/ILogger;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/sentry/android/core/p;->a:J

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/p;->d:Ljava/util/concurrent/Future;

    iput-object v0, p0, Lio/sentry/android/core/p;->e:Ljava/io/File;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/p;->h:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/p;->i:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/p;->j:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/p;->k:Ljava/util/HashMap;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/p;->n:Z

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/p;->o:Lio/sentry/util/a;

    new-instance v0, Ljava/io/File;

    const-string v1, "TracesFilesDirPath is required"

    invoke-static {v1, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lio/sentry/android/core/p;->b:Ljava/io/File;

    iput p2, p0, Lio/sentry/android/core/p;->c:I

    const-string p1, "Logger is required"

    invoke-static {p1, p5}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p5, p0, Lio/sentry/android/core/p;->m:Lio/sentry/ILogger;

    iput-object p4, p0, Lio/sentry/android/core/p;->l:Lio/sentry/c0;

    const-string p1, "SentryFrameMetricsCollector is required"

    invoke-static {p1, p3}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p3, p0, Lio/sentry/android/core/p;->g:Lio/sentry/android/core/internal/util/o;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Z)Lio/sentry/android/core/o;
    .locals 18

    move-object/from16 v1, p0

    iget-object v2, v1, Lio/sentry/android/core/p;->h:Ljava/util/ArrayDeque;

    iget-object v3, v1, Lio/sentry/android/core/p;->j:Ljava/util/ArrayDeque;

    iget-object v4, v1, Lio/sentry/android/core/p;->i:Ljava/util/ArrayDeque;

    iget-object v0, v1, Lio/sentry/android/core/p;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v5

    :try_start_0
    iget-boolean v0, v1, Lio/sentry/android/core/p;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    iget-object v7, v1, Lio/sentry/android/core/p;->m:Lio/sentry/ILogger;

    const/4 v8, 0x0

    if-nez v0, :cond_0

    :try_start_1
    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v2, "Profiler not running"

    new-array v3, v8, [Ljava/lang/Object;

    invoke-interface {v7, v0, v2, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v5}, Lio/sentry/r;->close()V

    return-object v6

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_1

    :cond_0
    :try_start_2
    invoke-static {}, Landroid/os/Debug;->stopMethodTracing()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    sget-object v9, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v10, "Error while stopping profiling: "

    invoke-interface {v7, v9, v10, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_0
    :try_start_4
    iput-boolean v8, v1, Lio/sentry/android/core/p;->n:Z

    iget-object v0, v1, Lio/sentry/android/core/p;->g:Lio/sentry/android/core/internal/util/o;

    iget-object v9, v1, Lio/sentry/android/core/p;->f:Ljava/lang/String;

    invoke-virtual {v0, v9}, Lio/sentry/android/core/internal/util/o;->a(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v11

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v13

    iget-object v0, v1, Lio/sentry/android/core/p;->e:Ljava/io/File;

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Trace file does not exists"

    new-array v3, v8, [Ljava/lang/Object;

    invoke-interface {v7, v0, v2, v3}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v5}, Lio/sentry/r;->close()V

    return-object v6

    :cond_1
    :try_start_5
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v7, "nanosecond"

    iget-object v8, v1, Lio/sentry/android/core/p;->k:Ljava/util/HashMap;

    if-nez v0, :cond_2

    :try_start_6
    const-string v0, "slow_frame_renders"

    new-instance v9, Lio/sentry/profilemeasurements/a;

    invoke-direct {v9, v7, v4}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/AbstractCollection;)V

    invoke-virtual {v8, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "frozen_frame_renders"

    new-instance v4, Lio/sentry/profilemeasurements/a;

    invoke-direct {v4, v7, v3}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/AbstractCollection;)V

    invoke-virtual {v8, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "screen_frame_rates"

    new-instance v3, Lio/sentry/profilemeasurements/a;

    const-string v4, "hz"

    invoke-direct {v3, v4, v2}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/AbstractCollection;)V

    invoke-virtual {v8, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual/range {p0 .. p1}, Lio/sentry/android/core/p;->b(Ljava/util/List;)V

    iget-object v0, v1, Lio/sentry/android/core/p;->d:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v6, v1, Lio/sentry/android/core/p;->d:Ljava/util/concurrent/Future;

    :cond_5
    new-instance v10, Lio/sentry/android/core/o;

    iget-object v0, v1, Lio/sentry/android/core/p;->e:Ljava/io/File;

    move/from16 v15, p2

    move-object/from16 v16, v0

    move-object/from16 v17, v8

    invoke-direct/range {v10 .. v17}, Lio/sentry/android/core/o;-><init>(JJZLjava/io/File;Ljava/util/HashMap;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {v5}, Lio/sentry/r;->close()V

    return-object v10

    :catchall_2
    move-exception v0

    :try_start_7
    iput-boolean v8, v1, Lio/sentry/android/core/p;->n:Z

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_1
    :try_start_8
    invoke-virtual {v5}, Lio/sentry/r;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
.end method

.method public final b(Ljava/util/List;)V
    .locals 16

    move-object/from16 v1, p0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    iget-wide v4, v1, Lio/sentry/android/core/p;->a:J

    sub-long/2addr v2, v4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    sub-long/2addr v2, v4

    if-eqz p1, :cond_6

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayDeque;-><init>(I)V

    new-instance v4, Ljava/util/ArrayDeque;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayDeque;-><init>(I)V

    new-instance v5, Ljava/util/ArrayDeque;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayDeque;-><init>(I)V

    monitor-enter p1

    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/b1;

    iget-wide v8, v7, Lio/sentry/b1;->d:J

    add-long v10, v8, v2

    iget-object v12, v7, Lio/sentry/b1;->a:Ljava/lang/Double;

    iget-object v13, v7, Lio/sentry/b1;->b:Ljava/lang/Long;

    iget-object v7, v7, Lio/sentry/b1;->c:Ljava/lang/Long;

    if-eqz v12, :cond_1

    new-instance v14, Lio/sentry/profilemeasurements/b;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-direct {v14, v15, v12, v8, v9}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;J)V

    invoke-virtual {v5, v14}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    if-eqz v13, :cond_2

    new-instance v12, Lio/sentry/profilemeasurements/b;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-direct {v12, v14, v13, v8, v9}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;J)V

    invoke-virtual {v0, v12}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v7, :cond_0

    new-instance v12, Lio/sentry/profilemeasurements/b;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-direct {v12, v10, v7, v8, v9}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;J)V

    invoke-virtual {v4, v12}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v1, Lio/sentry/android/core/p;->k:Ljava/util/HashMap;

    const-string v3, "cpu_usage"

    new-instance v6, Lio/sentry/profilemeasurements/a;

    const-string v7, "percent"

    invoke-direct {v6, v7, v5}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/AbstractCollection;)V

    invoke-virtual {v2, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, v1, Lio/sentry/android/core/p;->k:Ljava/util/HashMap;

    const-string v3, "memory_footprint"

    new-instance v5, Lio/sentry/profilemeasurements/a;

    const-string v6, "byte"

    invoke-direct {v5, v6, v0}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/AbstractCollection;)V

    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v1, Lio/sentry/android/core/p;->k:Ljava/util/HashMap;

    const-string v2, "memory_native_footprint"

    new-instance v3, Lio/sentry/profilemeasurements/a;

    const-string v5, "byte"

    invoke-direct {v3, v5, v4}, Lio/sentry/profilemeasurements/a;-><init>(Ljava/lang/String;Ljava/util/AbstractCollection;)V

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_6
    return-void
.end method

.method public final c()LCp;
    .locals 15

    const-string v0, ".trace"

    iget-object v1, p0, Lio/sentry/android/core/p;->o:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    iget v2, p0, Lio/sentry/android/core/p;->c:I

    const/4 v3, 0x0

    iget-object v4, p0, Lio/sentry/android/core/p;->m:Lio/sentry/ILogger;

    if-nez v2, :cond_0

    :try_start_0
    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v5, "Disabling profiling because intervaUs is set to %d"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v4, v0, v5, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-object v3

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_2

    :cond_0
    :try_start_1
    iget-boolean v5, p0, Lio/sentry/android/core/p;->n:Z

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    sget-object v0, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v2, "Profiling has already started..."

    new-array v5, v6, [Ljava/lang/Object;

    invoke-interface {v4, v0, v2, v5}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-object v3

    :cond_1
    :try_start_2
    new-instance v5, Ljava/io/File;

    iget-object v7, p0, Lio/sentry/android/core/p;->b:Ljava/io/File;

    invoke-static {}, Lio/sentry/config/a;->k()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v7, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v5, p0, Lio/sentry/android/core/p;->e:Ljava/io/File;

    iget-object v0, p0, Lio/sentry/android/core/p;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lio/sentry/android/core/p;->h:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iget-object v0, p0, Lio/sentry/android/core/p;->i:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iget-object v0, p0, Lio/sentry/android/core/p;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iget-object v0, p0, Lio/sentry/android/core/p;->g:Lio/sentry/android/core/internal/util/o;

    new-instance v5, Lio/sentry/android/core/n;

    invoke-direct {v5, p0}, Lio/sentry/android/core/n;-><init>(Lio/sentry/android/core/p;)V

    iget-boolean v7, v0, Lio/sentry/android/core/internal/util/o;->g:Z

    if-nez v7, :cond_2

    move-object v7, v3

    goto :goto_0

    :cond_2
    invoke-static {}, Lio/sentry/config/a;->k()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lio/sentry/android/core/internal/util/o;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v8, v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/o;->b()V

    :goto_0
    iput-object v7, p0, Lio/sentry/android/core/p;->f:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Lio/sentry/android/core/p;->l:Lio/sentry/c0;

    if-eqz v0, :cond_3

    new-instance v5, Lio/sentry/S1;

    const/4 v7, 0x4

    invoke-direct {v5, v7, p0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    const-wide/16 v7, 0x7530

    invoke-interface {v0, v5, v7, v8}, Lio/sentry/c0;->q(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/p;->d:Ljava/util/concurrent/Future;
    :try_end_3
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_4
    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v7, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?"

    invoke-interface {v4, v5, v7, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v7

    iput-wide v7, p0, Lio/sentry/android/core/p;->a:J

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v14

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v0, p0, Lio/sentry/android/core/p;->e:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const v5, 0x2dc6c0

    invoke-static {v0, v5, v2}, Landroid/os/Debug;->startMethodTracingSampling(Ljava/lang/String;II)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/sentry/android/core/p;->n:Z

    new-instance v9, LCp;

    iget-wide v10, p0, Lio/sentry/android/core/p;->a:J

    invoke-direct/range {v9 .. v14}, LCp;-><init>(JJLjava/util/Date;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-object v9

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p0, v3, v6}, Lio/sentry/android/core/p;->a(Ljava/util/List;Z)Lio/sentry/android/core/o;

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Unable to start a profile: "

    invoke-interface {v4, v2, v5, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v6, p0, Lio/sentry/android/core/p;->n:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-object v3

    :goto_2
    :try_start_7
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
.end method
