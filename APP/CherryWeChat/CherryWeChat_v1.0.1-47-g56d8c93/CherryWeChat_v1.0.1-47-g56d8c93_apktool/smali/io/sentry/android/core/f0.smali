.class public final Lio/sentry/android/core/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/V;
.implements Lio/sentry/android/core/internal/util/n;


# static fields
.field public static final h:J

.field public static final i:Lio/sentry/g2;


# instance fields
.field public final a:Z

.field public final b:Lio/sentry/util/a;

.field public final c:Lio/sentry/android/core/internal/util/o;

.field public volatile d:Ljava/lang/String;

.field public final e:Ljava/util/TreeSet;

.field public final f:Ljava/util/concurrent/ConcurrentSkipListSet;

.field public g:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lio/sentry/android/core/f0;->h:J

    new-instance v0, Lio/sentry/g2;

    new-instance v1, Ljava/util/Date;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/g2;-><init>(Ljava/util/Date;J)V

    sput-object v0, Lio/sentry/android/core/f0;->i:Lio/sentry/g2;

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/internal/util/o;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/f0;->b:Lio/sentry/util/a;

    new-instance v0, Ljava/util/TreeSet;

    new-instance v1, LKh;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LKh;-><init>(I)V

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lio/sentry/android/core/f0;->e:Ljava/util/TreeSet;

    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/f0;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    const-wide/32 v0, 0xfe502a

    iput-wide v0, p0, Lio/sentry/android/core/f0;->g:J

    iput-object p2, p0, Lio/sentry/android/core/f0;->c:Lio/sentry/android/core/internal/util/o;

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableFramesTracking()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lio/sentry/android/core/f0;->a:Z

    return-void
.end method

.method public static g(Lio/sentry/H1;)J
    .locals 4

    instance-of v0, p0, Lio/sentry/g2;

    if-eqz v0, :cond_0

    sget-object v0, Lio/sentry/android/core/f0;->i:Lio/sentry/g2;

    invoke-virtual {p0, v0}, Lio/sentry/H1;->b(Lio/sentry/H1;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    invoke-virtual {p0}, Lio/sentry/H1;->d()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    return-wide v2
.end method


# virtual methods
.method public final c(JJJJZZF)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/android/core/f0;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->size()I

    move-result v2

    const/16 v3, 0xe10

    if-le v2, v3, :cond_0

    goto :goto_0

    :cond_0
    sget-wide v2, Lio/sentry/android/core/f0;->h:J

    long-to-double v2, v2

    move/from16 v4, p11

    float-to-double v4, v4

    div-double/2addr v2, v4

    double-to-long v2, v2

    iput-wide v2, v0, Lio/sentry/android/core/f0;->g:J

    if-nez p9, :cond_2

    if-eqz p10, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    new-instance v4, Lio/sentry/android/core/e0;

    move-wide/from16 v5, p1

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move-wide/from16 v11, p7

    move/from16 v13, p9

    move/from16 v14, p10

    move-wide v15, v2

    invoke-direct/range {v4 .. v16}, Lio/sentry/android/core/e0;-><init>(JJJJZZJ)V

    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/f0;->b:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/f0;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/f0;->c:Lio/sentry/android/core/internal/util/o;

    iget-object v2, p0, Lio/sentry/android/core/f0;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/sentry/android/core/internal/util/o;->a(Ljava/lang/String;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/core/f0;->d:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lio/sentry/android/core/f0;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->clear()V

    iget-object v1, p0, Lio/sentry/android/core/f0;->e:Ljava/util/TreeSet;

    invoke-virtual {v1}, Ljava/util/TreeSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

.method public final e(Lio/sentry/g0;)V
    .locals 35

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lio/sentry/android/core/f0;->e:Ljava/util/TreeSet;

    iget-boolean v3, v1, Lio/sentry/android/core/f0;->a:Z

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    instance-of v3, v0, Lio/sentry/U0;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    instance-of v3, v0, Lio/sentry/W0;

    if-eqz v3, :cond_2

    :goto_0
    return-void

    :cond_2
    iget-object v3, v1, Lio/sentry/android/core/f0;->b:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v4

    :try_start_0
    invoke-virtual {v2, v0}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    if-nez v5, :cond_3

    invoke-virtual {v4}, Lio/sentry/r;->close()V

    return-void

    :cond_3
    invoke-virtual {v4}, Lio/sentry/r;->close()V

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v4

    :try_start_1
    invoke-virtual {v2, v0}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    iget-object v6, v1, Lio/sentry/android/core/f0;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    if-nez v5, :cond_4

    :goto_1
    invoke-virtual {v4}, Lio/sentry/r;->close()V

    move-object/from16 v27, v2

    move-object/from16 v28, v3

    goto/16 :goto_e

    :cond_4
    :try_start_2
    invoke-interface {v0}, Lio/sentry/g0;->p()Lio/sentry/H1;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {v0}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v7

    invoke-static {v7}, Lio/sentry/android/core/f0;->g(Lio/sentry/H1;)J

    move-result-wide v7

    invoke-static {v5}, Lio/sentry/android/core/f0;->g(Lio/sentry/H1;)J

    move-result-wide v9

    sub-long v11, v9, v7

    const-wide/16 v13, 0x0

    cmp-long v5, v11, v13

    if-gtz v5, :cond_6

    goto :goto_1

    :cond_6
    iget-wide v13, v1, Lio/sentry/android/core/f0;->g:J

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentSkipListSet;->isEmpty()Z

    move-result v5

    const/16 v17, 0x1

    const/16 v18, 0x0

    if-nez v5, :cond_12

    new-instance v5, Lio/sentry/android/core/e0;

    invoke-direct {v5, v7, v8}, Lio/sentry/android/core/e0;-><init>(J)V

    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentSkipListSet;->tailSet(Ljava/lang/Object;)Ljava/util/NavigableSet;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move/from16 v25, v18

    move/from16 v26, v25

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v15, v27

    check-cast v15, Lio/sentry/android/core/e0;

    move-object/from16 v27, v2

    move-object/from16 v28, v3

    iget-wide v2, v15, Lio/sentry/android/core/e0;->a:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-wide/from16 v29, v2

    iget-wide v2, v15, Lio/sentry/android/core/e0;->d:J

    move-wide/from16 v31, v2

    iget-wide v2, v15, Lio/sentry/android/core/e0;->g:J

    move-wide/from16 v33, v2

    iget-wide v2, v15, Lio/sentry/android/core/e0;->b:J

    cmp-long v16, v29, v9

    if-lez v16, :cond_7

    :goto_3
    move-object/from16 v29, v4

    goto/16 :goto_9

    :cond_7
    cmp-long v13, v29, v7

    if-ltz v13, :cond_a

    cmp-long v13, v2, v9

    if-gtz v13, :cond_a

    :try_start_3
    iget-wide v2, v15, Lio/sentry/android/core/e0;->c:J

    iget-boolean v13, v15, Lio/sentry/android/core/e0;->e:Z

    iget-boolean v14, v15, Lio/sentry/android/core/e0;->f:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-long v19, v19, v2

    if-eqz v14, :cond_8

    add-long v23, v23, v31

    add-int/lit8 v26, v26, 0x1

    goto :goto_4

    :cond_8
    if-eqz v13, :cond_9

    add-long v21, v21, v31

    add-int/lit8 v25, v25, 0x1

    :cond_9
    :goto_4
    move-object/from16 v29, v4

    move-object/from16 v16, v5

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    move-object v2, v0

    move-object/from16 v29, v4

    goto/16 :goto_12

    :cond_a
    cmp-long v13, v7, v29

    if-lez v13, :cond_b

    cmp-long v13, v7, v2

    if-ltz v13, :cond_c

    :cond_b
    cmp-long v13, v9, v29

    if-lez v13, :cond_9

    cmp-long v13, v9, v2

    if-gez v13, :cond_9

    :cond_c
    sub-long v13, v7, v29

    move-object/from16 v29, v4

    move-object/from16 v16, v5

    const-wide/16 v4, 0x0

    :try_start_4
    invoke-static {v4, v5, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v13

    sub-long v13, v13, v33

    invoke-static {v4, v5, v13, v14}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v13

    sub-long v13, v31, v13

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    iget-wide v4, v15, Lio/sentry/android/core/e0;->a:J

    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    sub-long/2addr v2, v4

    sget v4, Lio/sentry/android/core/internal/util/o;->p:I

    cmp-long v4, v2, v33

    if-lez v4, :cond_d

    move/from16 v4, v17

    goto :goto_5

    :cond_d
    move/from16 v4, v18

    :goto_5
    sget-wide v30, Lio/sentry/android/core/internal/util/o;->o:J

    cmp-long v5, v2, v30

    if-lez v5, :cond_e

    move/from16 v5, v17

    goto :goto_6

    :cond_e
    move/from16 v5, v18

    :goto_6
    add-long v19, v19, v2

    if-eqz v5, :cond_f

    add-long v23, v23, v13

    add-int/lit8 v26, v26, 0x1

    goto :goto_8

    :cond_f
    if-eqz v4, :cond_10

    add-long v21, v21, v13

    add-int/lit8 v25, v25, 0x1

    goto :goto_8

    :catchall_1
    move-exception v0

    :goto_7
    move-object v2, v0

    goto/16 :goto_12

    :cond_10
    :goto_8
    move-object/from16 v5, v16

    move-object/from16 v2, v27

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    move-wide/from16 v13, v33

    goto/16 :goto_2

    :catchall_2
    move-exception v0

    move-object/from16 v29, v4

    goto :goto_7

    :cond_11
    move-object/from16 v27, v2

    move-object/from16 v28, v3

    goto/16 :goto_3

    :cond_12
    move-object/from16 v27, v2

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    move/from16 v25, v18

    move/from16 v26, v25

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    :goto_9
    add-int v2, v25, v26

    iget-object v3, v1, Lio/sentry/android/core/f0;->c:Lio/sentry/android/core/internal/util/o;

    iget-object v4, v3, Lio/sentry/android/core/internal/util/o;->j:Landroid/view/Choreographer;

    const-wide/16 v7, -0x1

    if-eqz v4, :cond_13

    iget-object v3, v3, Lio/sentry/android/core/internal/util/o;->k:Ljava/lang/reflect/Field;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v3, :cond_13

    :try_start_5
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    if-eqz v3, :cond_13

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_a

    :catch_0
    :cond_13
    move-wide v3, v7

    :goto_a
    cmp-long v5, v3, v7

    if-eqz v5, :cond_19

    sub-long/2addr v9, v3

    const-wide/16 v4, 0x0

    :try_start_6
    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    cmp-long v3, v7, v13

    if-lez v3, :cond_14

    move/from16 v3, v17

    goto :goto_b

    :cond_14
    move/from16 v3, v18

    :goto_b
    if-eqz v3, :cond_17

    sget-wide v3, Lio/sentry/android/core/internal/util/o;->o:J

    cmp-long v3, v7, v3

    if-lez v3, :cond_15

    move/from16 v3, v17

    goto :goto_c

    :cond_15
    move/from16 v3, v18

    :goto_c
    sub-long v4, v7, v13

    const-wide/16 v9, 0x0

    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    add-long v19, v19, v7

    if-eqz v3, :cond_16

    add-long v23, v23, v4

    add-int/lit8 v26, v26, 0x1

    goto :goto_d

    :cond_16
    add-long v21, v21, v4

    add-int/lit8 v25, v25, 0x1

    goto :goto_d

    :cond_17
    move/from16 v17, v18

    :goto_d
    add-int v2, v2, v17

    sub-long v11, v11, v19

    const-wide/16 v15, 0x0

    cmp-long v3, v11, v15

    if-lez v3, :cond_18

    long-to-double v3, v11

    long-to-double v7, v13

    div-double/2addr v3, v7

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    move/from16 v18, v3

    :cond_18
    add-int v2, v2, v18

    :cond_19
    add-long v3, v21, v23

    long-to-double v3, v3

    const-wide v7, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v3, v7

    const-string v5, "frames.total"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v5, v7}, Lio/sentry/g0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "frames.slow"

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v5, v7}, Lio/sentry/g0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "frames.frozen"

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v5, v7}, Lio/sentry/g0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "frames.delay"

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-interface {v0, v5, v7}, Lio/sentry/g0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    instance-of v5, v0, Lio/sentry/i0;

    if-eqz v5, :cond_1a

    const-string v5, "frames_total"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v5}, Lio/sentry/g0;->j(Ljava/lang/Number;Ljava/lang/String;)V

    const-string v2, "frames_slow"

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5, v2}, Lio/sentry/g0;->j(Ljava/lang/Number;Ljava/lang/String;)V

    const-string v2, "frames_frozen"

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5, v2}, Lio/sentry/g0;->j(Ljava/lang/Number;Ljava/lang/String;)V

    const-string v2, "frames_delay"

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Lio/sentry/g0;->j(Ljava/lang/Number;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_1a
    invoke-virtual/range {v29 .. v29}, Lio/sentry/r;->close()V

    :goto_e
    invoke-virtual/range {v28 .. v28}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v2

    :try_start_7
    invoke-virtual/range {v27 .. v27}, Ljava/util/TreeSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {v1}, Lio/sentry/android/core/f0;->d()V

    goto :goto_f

    :catchall_3
    move-exception v0

    move-object v3, v0

    goto :goto_10

    :cond_1b
    invoke-virtual/range {v27 .. v27}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/g0;

    new-instance v3, Lio/sentry/android/core/e0;

    invoke-interface {v0}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/android/core/f0;->g(Lio/sentry/H1;)J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lio/sentry/android/core/e0;-><init>(J)V

    invoke-virtual {v6, v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->headSet(Ljava/lang/Object;)Ljava/util/NavigableSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :goto_f
    invoke-virtual {v2}, Lio/sentry/r;->close()V

    return-void

    :goto_10
    :try_start_8
    invoke-virtual {v2}, Lio/sentry/r;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_11

    :catchall_4
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_11
    throw v3

    :goto_12
    :try_start_9
    invoke-virtual/range {v29 .. v29}, Lio/sentry/r;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_13

    :catchall_5
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_13
    throw v2

    :catchall_6
    move-exception v0

    move-object v2, v0

    :try_start_a
    invoke-virtual {v4}, Lio/sentry/r;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    goto :goto_14

    :catchall_7
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_14
    throw v2
.end method

.method public final f(Lio/sentry/g0;)V
    .locals 3

    iget-boolean v0, p0, Lio/sentry/android/core/f0;->a:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lio/sentry/U0;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lio/sentry/W0;

    if-eqz v0, :cond_2

    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/f0;->b:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/f0;->e:Ljava/util/TreeSet;

    invoke-virtual {v1, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/sentry/android/core/f0;->d:Ljava/lang/String;

    if-nez p1, :cond_4

    iget-object p1, p0, Lio/sentry/android/core/f0;->c:Lio/sentry/android/core/internal/util/o;

    iget-boolean v1, p1, Lio/sentry/android/core/internal/util/o;->g:Z

    if-nez v1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    invoke-static {}, Lio/sentry/config/a;->k()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lio/sentry/android/core/internal/util/o;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lio/sentry/android/core/internal/util/o;->b()V

    move-object p1, v1

    :goto_1
    iput-object p1, p0, Lio/sentry/android/core/f0;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_3
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
.end method
