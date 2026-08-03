.class public final Lio/sentry/android/core/ActivityLifecycleIntegration;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/o0;
.implements Ljava/io/Closeable;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Lio/sentry/android/core/I;

.field public c:Lio/sentry/w1;

.field public d:Lio/sentry/android/core/SentryAndroidOptions;

.field public e:Z

.field public f:Z

.field public final g:Z

.field public h:Z

.field public i:Lio/sentry/G;

.field public j:Lio/sentry/g0;

.field public final k:Ljava/util/WeakHashMap;

.field public final l:Ljava/util/WeakHashMap;

.field public final m:Ljava/util/WeakHashMap;

.field public n:Lio/sentry/H1;

.field public o:Ljava/util/concurrent/Future;

.field public final p:Ljava/util/WeakHashMap;

.field public final q:LFu;

.field public final r:Lio/sentry/util/a;

.field public final s:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lio/sentry/android/core/I;LFu;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->f:Z

    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->h:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Lio/sentry/G;

    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->k:Ljava/util/WeakHashMap;

    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->l:Ljava/util/WeakHashMap;

    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->m:Ljava/util/WeakHashMap;

    new-instance v1, Lio/sentry/g2;

    new-instance v2, Ljava/util/Date;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-direct {v1, v2, v3, v4}, Lio/sentry/g2;-><init>(Ljava/util/Date;J)V

    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->n:Lio/sentry/H1;

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->o:Ljava/util/concurrent/Future;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->p:Ljava/util/WeakHashMap;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->r:Lio/sentry/util/a;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->s:Lio/sentry/util/a;

    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a:Landroid/app/Application;

    iput-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->b:Lio/sentry/android/core/I;

    iput-object p3, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->q:LFu;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1d

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->g:Z

    :cond_0
    return-void
.end method

.method public static f(Lio/sentry/g0;Lio/sentry/g0;)V
    .locals 3

    if-eqz p0, :cond_4

    invoke-interface {p0}, Lio/sentry/g0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-interface {p0}, Lio/sentry/g0;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, " - Deadline Exceeded"

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Lio/sentry/g0;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p0, v0}, Lio/sentry/g0;->c(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lio/sentry/g0;->p()Lio/sentry/H1;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p0}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object p1

    :goto_2
    sget-object v0, Lio/sentry/L2;->DEADLINE_EXCEEDED:Lio/sentry/L2;

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/ActivityLifecycleIntegration;->i(Lio/sentry/g0;Lio/sentry/H1;Lio/sentry/L2;)V

    :cond_4
    :goto_3
    return-void
.end method

.method public static i(Lio/sentry/g0;Lio/sentry/H1;Lio/sentry/L2;)V
    .locals 1

    if-eqz p0, :cond_2

    invoke-interface {p0}, Lio/sentry/g0;->f()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lio/sentry/g0;->o()Lio/sentry/L2;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p0}, Lio/sentry/g0;->o()Lio/sentry/L2;

    move-result-object p2

    goto :goto_0

    :cond_1
    sget-object p2, Lio/sentry/L2;->OK:Lio/sentry/L2;

    :goto_0
    invoke-interface {p0, p2, p1}, Lio/sentry/g0;->q(Lio/sentry/L2;Lio/sentry/H1;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a:Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ActivityLifecycleIntegration removed."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->q:LFu;

    iget-object v1, v0, LFu;->f:Ljava/io/Serializable;

    check-cast v1, Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v1

    :try_start_0
    invoke-virtual {v0}, LFu;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lio/sentry/S1;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v0}, Lio/sentry/S1;-><init>(ILjava/lang/Object;)V

    const-string v3, "FrameMetricsAggregator.stop"

    invoke-virtual {v0, v2, v3}, LFu;->i(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object v2, v0, LFu;->a:Ljava/lang/Object;

    check-cast v2, Landroidx/core/app/FrameMetricsAggregator;

    iget-object v2, v2, Landroidx/core/app/FrameMetricsAggregator;->a:LNi;

    iget-object v3, v2, LNi;->b:Ljava/lang/Object;

    const/16 v3, 0x9

    new-array v3, v3, [Landroid/util/SparseIntArray;

    iput-object v3, v2, LNi;->b:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, v0, LFu;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
.end method

.method public final d()V
    .locals 7

    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0, v1}, Lio/sentry/android/core/performance/f;->a(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/g;

    move-result-object v0

    iget-wide v1, v0, Lio/sentry/android/core/performance/g;->d:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    new-instance v1, Lio/sentry/f2;

    invoke-virtual {v0}, Lio/sentry/android/core/performance/g;->b()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-wide v3, v0, Lio/sentry/android/core/performance/g;->b:J

    invoke-virtual {v0}, Lio/sentry/android/core/performance/g;->a()J

    move-result-wide v5

    add-long/2addr v3, v5

    :cond_0
    const-wide/32 v5, 0xf4240

    mul-long/2addr v3, v5

    invoke-direct {v1, v3, v4}, Lio/sentry/f2;-><init>(J)V

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    iget-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->j:Lio/sentry/g0;

    invoke-static {v0, v1, v2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->i(Lio/sentry/g0;Lio/sentry/H1;Lio/sentry/L2;)V

    :cond_2
    return-void
.end method

.method public final l(Lio/sentry/i0;Lio/sentry/g0;Lio/sentry/g0;)V
    .locals 2

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lio/sentry/g0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/sentry/L2;->DEADLINE_EXCEEDED:Lio/sentry/L2;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lio/sentry/g0;->f()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p2, v0}, Lio/sentry/g0;->n(Lio/sentry/L2;)V

    :cond_1
    invoke-static {p3, p2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->f(Lio/sentry/g0;Lio/sentry/g0;)V

    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->o:Ljava/util/concurrent/Future;

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 p2, 0x0

    iput-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->o:Ljava/util/concurrent/Future;

    :cond_2
    invoke-interface {p1}, Lio/sentry/g0;->o()Lio/sentry/L2;

    move-result-object p2

    if-nez p2, :cond_3

    sget-object p2, Lio/sentry/L2;->OK:Lio/sentry/L2;

    :cond_3
    invoke-interface {p1, p2}, Lio/sentry/g0;->n(Lio/sentry/L2;)V

    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    if-eqz p2, :cond_4

    new-instance p3, Lrl;

    invoke-direct {p3, p0, p1}, Lrl;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/i0;)V

    invoke-virtual {p2, p3}, Lio/sentry/w1;->m(Lio/sentry/s1;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final m(Lio/sentry/g0;Lio/sentry/g0;)V
    .locals 6

    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object p1

    iget-object v0, p1, Lio/sentry/android/core/performance/f;->c:Lio/sentry/android/core/performance/g;

    iget-object p1, p1, Lio/sentry/android/core/performance/f;->d:Lio/sentry/android/core/performance/g;

    invoke-virtual {v0}, Lio/sentry/android/core/performance/g;->b()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    iget-wide v4, v0, Lio/sentry/android/core/performance/g;->d:J

    cmp-long v1, v4, v2

    if-nez v1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iput-wide v4, v0, Lio/sentry/android/core/performance/g;->d:J

    :cond_0
    invoke-virtual {p1}, Lio/sentry/android/core/performance/g;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lio/sentry/android/core/performance/g;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lio/sentry/android/core/performance/g;->d:J

    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/core/ActivityLifecycleIntegration;->d()V

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->s:Lio/sentry/util/a;

    invoke-virtual {p1}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {v0}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v0

    invoke-interface {p2}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/H1;->b(Lio/sentry/H1;)J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    const-string v3, "time_to_initial_display"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lio/sentry/F0;->MILLISECOND:Lio/sentry/F0;

    invoke-interface {p2, v3, v1, v2}, Lio/sentry/g0;->l(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/G0;)V

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->i(Lio/sentry/g0;Lio/sentry/H1;Lio/sentry/L2;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    invoke-interface {p2}, Lio/sentry/g0;->f()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lio/sentry/g0;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_0
    invoke-virtual {p1}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
.end method

.method public final o(Landroid/app/Activity;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v3, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    if-eqz v3, :cond_d

    iget-object v3, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->p:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    iget-boolean v4, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    if-nez v4, :cond_0

    sget-object v0, Lio/sentry/W0;->a:Lio/sentry/W0;

    invoke-virtual {v3, v2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    new-instance v2, Lio/sentry/android/core/T;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lio/sentry/android/core/T;-><init>(I)V

    invoke-virtual {v0, v2}, Lio/sentry/w1;->m(Lio/sentry/s1;)V

    return-void

    :cond_0
    invoke-virtual {v3}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    iget-object v6, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->l:Ljava/util/WeakHashMap;

    iget-object v7, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->k:Ljava/util/WeakHashMap;

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/i0;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/g0;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/g0;

    invoke-virtual {v1, v8, v7, v5}, Lio/sentry/android/core/ActivityLifecycleIntegration;->l(Lio/sentry/i0;Lio/sentry/g0;Lio/sentry/g0;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v5

    iget-object v8, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v5, v8}, Lio/sentry/android/core/performance/f;->a(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/g;

    move-result-object v5

    invoke-static {}, Lio/sentry/android/core/H;->d()Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v8, :cond_4

    invoke-virtual {v5}, Lio/sentry/android/core/performance/g;->b()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v5}, Lio/sentry/android/core/performance/g;->b()Z

    move-result v8

    if-eqz v8, :cond_2

    new-instance v8, Lio/sentry/f2;

    iget-wide v12, v5, Lio/sentry/android/core/performance/g;->b:J

    const-wide/32 v14, 0xf4240

    mul-long/2addr v12, v14

    invoke-direct {v8, v12, v13}, Lio/sentry/f2;-><init>(J)V

    goto :goto_1

    :cond_2
    move-object v8, v11

    :goto_1
    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v5

    iget-object v5, v5, Lio/sentry/android/core/performance/f;->a:Lio/sentry/android/core/performance/e;

    sget-object v12, Lio/sentry/android/core/performance/e;->COLD:Lio/sentry/android/core/performance/e;

    if-ne v5, v12, :cond_3

    move v5, v10

    goto :goto_2

    :cond_3
    move v5, v9

    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v15, v8

    goto :goto_3

    :cond_4
    move-object v5, v11

    move-object v15, v5

    :goto_3
    new-instance v8, Lio/sentry/Q2;

    invoke-direct {v8}, Lio/sentry/Q2;-><init>()V

    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v12}, Lio/sentry/v2;->getDeadlineTimeout()J

    move-result-wide v12

    const-wide/16 v16, 0x0

    cmp-long v14, v12, v16

    if-gtz v14, :cond_5

    move-object v12, v11

    goto :goto_4

    :cond_5
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    :goto_4
    iput-object v12, v8, Lio/sentry/Q2;->h:Ljava/lang/Long;

    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v12}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    move-result v12

    if-eqz v12, :cond_6

    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v12}, Lio/sentry/v2;->getIdleTimeout()Ljava/lang/Long;

    move-result-object v12

    iput-object v12, v8, Lio/sentry/Q2;->g:Ljava/lang/Long;

    iput-boolean v10, v8, LZd;->a:Z

    :cond_6
    iput-boolean v10, v8, Lio/sentry/Q2;->f:Z

    new-instance v12, Lio/sentry/android/core/e;

    invoke-direct {v12, v1, v0, v4}, Lio/sentry/android/core/e;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v12, v8, Lio/sentry/Q2;->i:Lio/sentry/android/core/e;

    iget-boolean v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->h:Z

    if-nez v0, :cond_7

    if-eqz v15, :cond_7

    if-eqz v5, :cond_7

    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/android/core/performance/f;->j:Lvx;

    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v12

    iput-object v11, v12, Lio/sentry/android/core/performance/f;->j:Lvx;

    move-object v11, v0

    move-object v0, v15

    goto :goto_5

    :cond_7
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->n:Lio/sentry/H1;

    :goto_5
    iput-object v0, v8, LZd;->b:Ljava/lang/Object;

    if-eqz v11, :cond_8

    move v9, v10

    :cond_8
    iput-boolean v9, v8, Lio/sentry/Q2;->e:Z

    const-string v9, "auto.ui.activity"

    iput-object v9, v8, LZd;->d:Ljava/lang/Object;

    iget-object v10, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    new-instance v12, Lio/sentry/P2;

    sget-object v13, Lio/sentry/protocol/C;->COMPONENT:Lio/sentry/protocol/C;

    const-string v14, "ui.load"

    invoke-direct {v12, v4, v13, v14, v11}, Lio/sentry/P2;-><init>(Ljava/lang/String;Lio/sentry/protocol/C;Ljava/lang/String;Lvx;)V

    invoke-virtual {v10, v12, v8}, Lio/sentry/w1;->k(Lio/sentry/P2;Lio/sentry/Q2;)Lio/sentry/i0;

    move-result-object v16

    new-instance v8, LZd;

    invoke-direct {v8}, LZd;-><init>()V

    iput-object v9, v8, LZd;->d:Ljava/lang/Object;

    iget-boolean v9, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->h:Z

    if-nez v9, :cond_b

    if-eqz v15, :cond_b

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_9

    const-string v9, "app.start.cold"

    :goto_6
    move-object v13, v9

    goto :goto_7

    :cond_9
    const-string v9, "app.start.warm"

    goto :goto_6

    :goto_7
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_a

    const-string v5, "Cold Start"

    :goto_8
    move-object v14, v5

    move-object/from16 v12, v16

    goto :goto_9

    :cond_a
    const-string v5, "Warm Start"

    goto :goto_8

    :goto_9
    sget-object v16, Lio/sentry/n0;->SENTRY:Lio/sentry/n0;

    move-object/from16 v17, v8

    invoke-interface/range {v12 .. v17}, Lio/sentry/g0;->s(Ljava/lang/String;Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;LZd;)Lio/sentry/g0;

    move-result-object v5

    move-object/from16 v16, v12

    move-object/from16 v21, v17

    iput-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->j:Lio/sentry/g0;

    invoke-virtual {v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->d()V

    goto :goto_a

    :cond_b
    move-object/from16 v21, v8

    :goto_a
    const-string v5, " initial display"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    sget-object v20, Lio/sentry/n0;->SENTRY:Lio/sentry/n0;

    const-string v17, "ui.load.initial_display"

    move-object/from16 v19, v0

    invoke-interface/range {v16 .. v21}, Lio/sentry/g0;->s(Ljava/lang/String;Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;LZd;)Lio/sentry/g0;

    move-result-object v0

    invoke-virtual {v7, v2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->f:Z

    if-eqz v5, :cond_c

    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Lio/sentry/G;

    if-eqz v5, :cond_c

    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v5, :cond_c

    const-string v5, " full display"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v17, "ui.load.full_display"

    invoke-interface/range {v16 .. v21}, Lio/sentry/g0;->s(Ljava/lang/String;Ljava/lang/String;Lio/sentry/H1;Lio/sentry/n0;LZd;)Lio/sentry/g0;

    move-result-object v4

    move-object/from16 v12, v16

    :try_start_0
    invoke-virtual {v6, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v5}, Lio/sentry/v2;->getExecutorService()Lio/sentry/c0;

    move-result-object v5

    new-instance v6, Ln3;

    invoke-direct {v6, v1, v4, v0}, Ln3;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/g0;Lio/sentry/g0;)V

    const-wide/16 v7, 0x61a8

    invoke-interface {v5, v6, v7, v8}, Lio/sentry/c0;->q(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->o:Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    iget-object v4, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v4}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v6, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?"

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_b

    :cond_c
    move-object/from16 v12, v16

    :goto_b
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    new-instance v4, LQ9;

    const/4 v5, 0x6

    invoke-direct {v4, v5, v1, v12}, LQ9;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lio/sentry/w1;->m(Lio/sentry/s1;)V

    invoke-virtual {v3, v2, v12}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    iget-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->g:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->r:Lio/sentry/util/a;

    invoke-virtual {p2}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object p2

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/sentry/v2;->isEnableScreenTracking()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lio/sentry/config/a;->l(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    new-instance v2, Lio/sentry/J2;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lio/sentry/J2;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Lio/sentry/w1;->m(Lio/sentry/s1;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->o(Landroid/app/Activity;)V

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->k:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/g0;

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->l:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/g0;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->h:Z

    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Lio/sentry/G;

    if-eqz p1, :cond_2

    new-instance v0, Lr1;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lr1;-><init>(I)V

    iget-object p1, p1, Lio/sentry/G;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {p2}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {p2}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 11

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->l:Ljava/util/WeakHashMap;

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->k:Ljava/util/WeakHashMap;

    iget-object v2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->m:Ljava/util/WeakHashMap;

    iget-object v3, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->r:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v3

    :try_start_0
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/core/performance/b;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    iget-object v6, v4, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    if-eqz v6, :cond_0

    invoke-interface {v6}, Lio/sentry/g0;->f()Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, v4, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    sget-object v7, Lio/sentry/L2;->CANCELLED:Lio/sentry/L2;

    invoke-interface {v6, v7}, Lio/sentry/g0;->n(Lio/sentry/L2;)V

    :cond_0
    iput-object v5, v4, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    iget-object v6, v4, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    if-eqz v6, :cond_1

    invoke-interface {v6}, Lio/sentry/g0;->f()Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, v4, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    sget-object v7, Lio/sentry/L2;->CANCELLED:Lio/sentry/L2;

    invoke-interface {v6, v7}, Lio/sentry/g0;->n(Lio/sentry/L2;)V

    :cond_1
    iput-object v5, v4, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    :cond_2
    iget-boolean v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    iget-object v7, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->p:Ljava/util/WeakHashMap;

    if-eqz v4, :cond_7

    :try_start_1
    iget-object v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->j:Lio/sentry/g0;

    sget-object v8, Lio/sentry/L2;->CANCELLED:Lio/sentry/L2;

    if-eqz v4, :cond_3

    invoke-interface {v4}, Lio/sentry/g0;->f()Z

    move-result v9

    if-nez v9, :cond_3

    invoke-interface {v4, v8}, Lio/sentry/g0;->n(Lio/sentry/L2;)V

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/g0;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/g0;

    sget-object v9, Lio/sentry/L2;->DEADLINE_EXCEEDED:Lio/sentry/L2;

    if-eqz v4, :cond_4

    invoke-interface {v4}, Lio/sentry/g0;->f()Z

    move-result v10

    if-nez v10, :cond_4

    invoke-interface {v4, v9}, Lio/sentry/g0;->n(Lio/sentry/L2;)V

    :cond_4
    invoke-static {v8, v4}, Lio/sentry/android/core/ActivityLifecycleIntegration;->f(Lio/sentry/g0;Lio/sentry/g0;)V

    iget-object v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->o:Ljava/util/concurrent/Future;

    if-eqz v4, :cond_5

    invoke-interface {v4, v6}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v5, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->o:Ljava/util/concurrent/Future;

    :cond_5
    iget-boolean v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    if-eqz v4, :cond_6

    invoke-virtual {v7, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/i0;

    invoke-virtual {p0, v4, v5, v5}, Lio/sentry/android/core/ActivityLifecycleIntegration;->l(Lio/sentry/i0;Lio/sentry/g0;Lio/sentry/g0;)V

    :cond_6
    iput-object v5, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->j:Lio/sentry/g0;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_7
    :goto_0
    invoke-virtual {v7, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-nez p1, :cond_8

    iput-boolean v6, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->h:Z

    new-instance p1, Lio/sentry/g2;

    new-instance v0, Ljava/util/Date;

    const-wide/16 v4, 0x0

    invoke-direct {v0, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-direct {p1, v0, v4, v5}, Lio/sentry/g2;-><init>(Ljava/util/Date;J)V

    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->n:Lio/sentry/H1;

    invoke-virtual {v2}, Ljava/util/WeakHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_8
    invoke-virtual {v3}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_2
    invoke-virtual {v3}, Lio/sentry/r;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->r:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->g:Z

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPrePaused(Landroid/app/Activity;)V
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

.method public final onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->m:Ljava/util/WeakHashMap;

    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/android/core/performance/b;

    if-eqz p2, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->j:Lio/sentry/g0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->p:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lio/sentry/g0;

    :goto_0
    iget-object p1, p2, Lio/sentry/android/core/performance/b;->b:Lio/sentry/H1;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    iget-object p1, p2, Lio/sentry/android/core/performance/b;->a:Ljava/lang/String;

    const-string v1, ".onCreate"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p2, Lio/sentry/android/core/performance/b;->b:Lio/sentry/H1;

    invoke-static {v0, p1, v1}, Lio/sentry/android/core/performance/b;->a(Lio/sentry/g0;Ljava/lang/String;Lio/sentry/H1;)Lio/sentry/g0;

    move-result-object p1

    iput-object p1, p2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    invoke-interface {p1}, Lio/sentry/g0;->r()V

    :cond_1
    return-void
.end method

.method public final onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityPostStarted(Landroid/app/Activity;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->m:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/android/core/performance/b;

    if-eqz v2, :cond_4

    iget-object v3, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->j:Lio/sentry/g0;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->p:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/sentry/g0;

    :goto_0
    iget-object v1, v2, Lio/sentry/android/core/performance/b;->c:Lio/sentry/H1;

    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    iget-object v1, v2, Lio/sentry/android/core/performance/b;->a:Ljava/lang/String;

    const-string v4, ".onStart"

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v4, v2, Lio/sentry/android/core/performance/b;->c:Lio/sentry/H1;

    invoke-static {v3, v1, v4}, Lio/sentry/android/core/performance/b;->a(Lio/sentry/g0;Ljava/lang/String;Lio/sentry/H1;)Lio/sentry/g0;

    move-result-object v1

    iput-object v1, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    invoke-interface {v1}, Lio/sentry/g0;->r()V

    :cond_1
    iget-object v1, v2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    if-eqz v1, :cond_4

    iget-object v3, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-interface {v1}, Lio/sentry/g0;->p()Lio/sentry/H1;

    move-result-object v1

    iget-object v3, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    invoke-interface {v3}, Lio/sentry/g0;->p()Lio/sentry/H1;

    move-result-object v3

    if-eqz v1, :cond_4

    if-nez v3, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    sget-object v6, Lio/sentry/android/core/i;->a:Lio/sentry/android/core/c0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lio/sentry/g2;

    invoke-direct {v6}, Lio/sentry/g2;-><init>()V

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v8, v2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    invoke-interface {v8}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v8

    invoke-virtual {v6, v8}, Lio/sentry/g2;->b(Lio/sentry/H1;)J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    invoke-virtual {v6, v1}, Lio/sentry/g2;->b(Lio/sentry/H1;)J

    move-result-wide v10

    invoke-virtual {v7, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v10

    iget-object v1, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    invoke-interface {v1}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v1

    invoke-virtual {v6, v1}, Lio/sentry/g2;->b(Lio/sentry/H1;)J

    move-result-wide v12

    invoke-virtual {v7, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v12

    invoke-virtual {v6, v3}, Lio/sentry/g2;->b(Lio/sentry/H1;)J

    move-result-wide v14

    invoke-virtual {v7, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v14

    new-instance v1, Lio/sentry/android/core/performance/c;

    invoke-direct {v1}, Lio/sentry/android/core/performance/c;-><init>()V

    iget-object v3, v2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    invoke-interface {v3}, Lio/sentry/g0;->i()Ljava/lang/String;

    move-result-object v3

    iget-object v6, v2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/g0;

    invoke-interface {v6}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v6

    move-wide/from16 v16, v4

    invoke-virtual {v6}, Lio/sentry/H1;->d()J

    move-result-wide v4

    invoke-virtual {v7, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sub-long v8, v16, v8

    sub-long v10, v16, v10

    iget-object v6, v1, Lio/sentry/android/core/performance/c;->a:Lio/sentry/android/core/performance/g;

    iput-object v3, v6, Lio/sentry/android/core/performance/g;->a:Ljava/lang/String;

    iput-wide v4, v6, Lio/sentry/android/core/performance/g;->b:J

    iput-wide v8, v6, Lio/sentry/android/core/performance/g;->c:J

    iput-wide v10, v6, Lio/sentry/android/core/performance/g;->d:J

    iget-object v3, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    invoke-interface {v3}, Lio/sentry/g0;->i()Ljava/lang/String;

    move-result-object v3

    iget-object v2, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/g0;

    invoke-interface {v2}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/H1;->d()J

    move-result-wide v4

    invoke-virtual {v7, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sub-long v6, v16, v12

    sub-long v8, v16, v14

    iget-object v2, v1, Lio/sentry/android/core/performance/c;->b:Lio/sentry/android/core/performance/g;

    iput-object v3, v2, Lio/sentry/android/core/performance/g;->a:Ljava/lang/String;

    iput-wide v4, v2, Lio/sentry/android/core/performance/g;->b:J

    iput-wide v6, v2, Lio/sentry/android/core/performance/g;->c:J

    iput-wide v8, v2, Lio/sentry/android/core/performance/g;->d:J

    invoke-static {}, Lio/sentry/android/core/performance/f;->b()Lio/sentry/android/core/performance/f;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/android/core/performance/f;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public final onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    new-instance p2, Lio/sentry/android/core/performance/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lio/sentry/android/core/performance/b;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->m:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->h:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/sentry/w1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Lio/sentry/android/core/i;->a:Lio/sentry/android/core/c0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lio/sentry/g2;

    invoke-direct {p1}, Lio/sentry/g2;-><init>()V

    :goto_0
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->n:Lio/sentry/H1;

    iput-object p1, p2, Lio/sentry/android/core/performance/b;->b:Lio/sentry/H1;

    return-void
.end method

.method public final onActivityPrePaused(Landroid/app/Activity;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->h:Z

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/sentry/w1;->l()Lio/sentry/v2;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/android/core/i;->a:Lio/sentry/android/core/c0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lio/sentry/g2;

    invoke-direct {p1}, Lio/sentry/g2;-><init>()V

    :goto_0
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->n:Lio/sentry/H1;

    return-void
.end method

.method public final onActivityPreStarted(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->m:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/android/core/performance/b;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/v2;->getDateProvider()Lio/sentry/I1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/I1;->a()Lio/sentry/H1;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/sentry/android/core/i;->a:Lio/sentry/android/core/c0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lio/sentry/g2;

    invoke-direct {v0}, Lio/sentry/g2;-><init>()V

    :goto_0
    iput-object v0, p1, Lio/sentry/android/core/performance/b;->c:Lio/sentry/H1;

    :cond_1
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->r:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->g:Z

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPostStarted(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->k:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/g0;

    iget-object v2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->l:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/g0;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v3, Lio/sentry/android/core/d;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v2, v1, v4}, Lio/sentry/android/core/d;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/g0;Lio/sentry/g0;I)V

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->b:Lio/sentry/android/core/I;

    invoke-static {p1, v3, v1}, Lio/sentry/android/core/internal/util/h;->a(Landroid/app/Activity;Ljava/lang/Runnable;Lio/sentry/android/core/I;)V

    goto :goto_1

    :cond_1
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lio/sentry/android/core/d;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v2, v1, v4}, Lio/sentry/android/core/d;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/g0;Lio/sentry/g0;I)V

    invoke-virtual {p1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->r:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->g:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPreStarted(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->q:LFu;

    invoke-virtual {v1, p1}, LFu;->a(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
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

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final p(Lio/sentry/v2;)V
    .locals 3

    instance-of v0, p1, Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "SentryAndroidOptions is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    sget-object v0, Lio/sentry/w1;->a:Lio/sentry/w1;

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/w1;

    invoke-virtual {p1}, Lio/sentry/v2;->isTracingEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/v2;->getFullyDisplayedReporter()Lio/sentry/G;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Lio/sentry/G;

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/v2;->isEnableTimeToFullDisplayTracing()Z

    move-result p1

    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->f:Z

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a:Landroid/app/Application;

    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p1

    sget-object v0, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v2, "ActivityLifecycleIntegration installed."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "ActivityLifecycle"

    invoke-static {p1}, Lio/sentry/config/a;->a(Ljava/lang/String;)V

    return-void
.end method
