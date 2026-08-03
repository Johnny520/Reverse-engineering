.class public final synthetic Lio/sentry/android/core/internal/util/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/internal/util/o;

.field public final synthetic b:Lio/sentry/android/core/I;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/internal/util/o;Lio/sentry/android/core/I;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/util/m;->a:Lio/sentry/android/core/internal/util/o;

    iput-object p2, p0, Lio/sentry/android/core/internal/util/m;->b:Lio/sentry/android/core/I;

    return-void
.end method


# virtual methods
.method public final onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-object v4, v0, Lio/sentry/android/core/internal/util/m;->b:Lio/sentry/android/core/I;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1e

    if-lt v4, v5, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/view/Window;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lio/sentry/android/core/v;->d(Landroid/content/Context;)Landroid/view/Display;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/Display;->getRefreshRate()F

    move-result v4

    :goto_0
    move/from16 v16, v4

    goto :goto_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v4

    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/Display;->getRefreshRate()F

    move-result v4

    goto :goto_0

    :goto_1
    sget-wide v4, Lio/sentry/android/core/internal/util/o;->n:J

    long-to-float v4, v4

    div-float v5, v4, v16

    float-to-long v5, v5

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v8

    const/4 v10, 0x1

    invoke-virtual {v1, v10}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v11

    add-long/2addr v11, v8

    const/4 v8, 0x2

    invoke-virtual {v1, v8}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v8

    add-long/2addr v8, v11

    const/4 v11, 0x3

    invoke-virtual {v1, v11}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v11

    add-long/2addr v11, v8

    const/4 v8, 0x4

    invoke-virtual {v1, v8}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v8

    add-long/2addr v8, v11

    const/4 v11, 0x5

    invoke-virtual {v1, v11}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v11

    add-long/2addr v11, v8

    sub-long v5, v11, v5

    const-wide/16 v8, 0x0

    invoke-static {v8, v9, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object v13, v0, Lio/sentry/android/core/internal/util/m;->a:Lio/sentry/android/core/internal/util/o;

    iget-object v14, v13, Lio/sentry/android/core/internal/util/o;->a:Lio/sentry/android/core/I;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v14, 0xa

    invoke-virtual {v1, v14}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v14

    cmp-long v1, v14, v8

    if-gez v1, :cond_1

    sub-long v14, v2, v11

    :cond_1
    iget-wide v1, v13, Lio/sentry/android/core/internal/util/o;->m:J

    invoke-static {v14, v15, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iget-wide v8, v13, Lio/sentry/android/core/internal/util/o;->l:J

    cmp-long v3, v1, v8

    if-nez v3, :cond_2

    goto :goto_5

    :cond_2
    iput-wide v1, v13, Lio/sentry/android/core/internal/util/o;->l:J

    add-long v8, v1, v11

    iput-wide v8, v13, Lio/sentry/android/core/internal/util/o;->m:J

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v3, v16, v3

    div-float/2addr v4, v3

    float-to-long v3, v4

    cmp-long v3, v11, v3

    if-lez v3, :cond_3

    move v14, v10

    goto :goto_2

    :cond_3
    move v14, v7

    :goto_2
    if-eqz v14, :cond_4

    sget-wide v3, Lio/sentry/android/core/internal/util/o;->o:J

    cmp-long v3, v11, v3

    if-lez v3, :cond_4

    move v15, v10

    goto :goto_3

    :cond_4
    move v15, v7

    :goto_3
    iget-object v3, v13, Lio/sentry/android/core/internal/util/o;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/core/internal/util/n;

    iget-wide v8, v13, Lio/sentry/android/core/internal/util/o;->m:J

    move-wide v10, v11

    move-wide/from16 v17, v5

    move-object v5, v4

    move-wide v6, v1

    move-object v1, v13

    move-wide/from16 v12, v17

    invoke-interface/range {v5 .. v16}, Lio/sentry/android/core/internal/util/n;->c(JJJJZZF)V

    move-object v13, v1

    move-wide v1, v6

    move-wide/from16 v5, v17

    move-wide v11, v10

    goto :goto_4

    :cond_5
    :goto_5
    return-void
.end method
