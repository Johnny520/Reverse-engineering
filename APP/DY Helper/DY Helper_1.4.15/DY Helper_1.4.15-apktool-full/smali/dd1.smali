.class public abstract Ldd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final β:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public static final γ:Ljava/lang/Object;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicLong;

.field public static η:Ljava/util/concurrent/ScheduledFuture;

.field public static θ:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 10
    .line 11
    new-instance v1, Laj;

    .line 12
    .line 13
    const/16 v2, 0xe

    .line 14
    .line 15
    invoke-direct {v1, v2}, Laj;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Ldd1;->β:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ldd1;->γ:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Ldd1;->δ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 41
    .line 42
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Ldd1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 50
    .line 51
    const-wide/16 v1, 0x0

    .line 52
    .line 53
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Ldd1;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 57
    .line 58
    return-void
.end method

.method public static α()V
    .locals 3

    .line 1
    sget-object v0, Ldd1;->γ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ldd1;->η:Ljava/util/concurrent/ScheduledFuture;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 16
    sput-object v1, Ldd1;->η:Ljava/util/concurrent/ScheduledFuture;

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    sput-wide v1, Ldd1;->θ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    monitor-exit v0

    .line 25
    throw v1
.end method

.method public static β()Landroid/app/Activity;
    .locals 2

    .line 1
    sget-object v0, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0

    .line 33
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 34
    return-object v0
.end method

.method public static γ()Z
    .locals 4

    .line 1
    invoke-static {}, Lx9;->ζ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-static {}, Lui1;->Α()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-static {}, Lv81;->ι()Lqd;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-boolean v1, v0, Lqd;->α:Z

    .line 19
    .line 20
    if-nez v1, :cond_4

    .line 21
    .line 22
    iget-boolean v1, v0, Lqd;->β:Z

    .line 23
    .line 24
    if-nez v1, :cond_4

    .line 25
    .line 26
    iget-boolean v0, v0, Lqd;->γ:Z

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    sget-object v0, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    invoke-static {}, Ljc1;->κ()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lec1;

    .line 59
    .line 60
    iget-object v1, v1, Lec1;->ζ:Lsd;

    .line 61
    .line 62
    iget-object v2, v1, Lsd;->β:Lip1;

    .line 63
    .line 64
    sget-object v3, Lip1;->ζ:Lip1;

    .line 65
    .line 66
    if-eq v2, v3, :cond_4

    .line 67
    .line 68
    iget-object v2, v1, Lsd;->γ:Lip1;

    .line 69
    .line 70
    if-eq v2, v3, :cond_4

    .line 71
    .line 72
    iget-object v1, v1, Lsd;->δ:Lip1;

    .line 73
    .line 74
    if-ne v1, v3, :cond_3

    .line 75
    .line 76
    :cond_4
    :goto_0
    const/4 v0, 0x1

    .line 77
    return v0

    .line 78
    :cond_5
    :goto_1
    const/4 v0, 0x0

    .line 79
    return v0
.end method

.method public static δ(Landroid/app/Activity;Z)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x4

    .line 15
    const-string v0, "r8b18805b9e3774c8"

    .line 16
    .line 17
    sget-object v1, Ldd1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ldd1;->α()V

    .line 27
    .line 28
    .line 29
    const-string p1, "\u64cd\u4f5c\u83dc\u5355\u5df2\u6253\u5f00\uff0c\u53d6\u6d88\u5f85\u6267\u884c\u7684\u524d\u53f0\u8425\u5730\u81ea\u52a8\u4efb\u52a1"

    .line 30
    .line 31
    invoke-static {v0, p1, v2, p0, v2}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    const-wide/16 v5, 0x5dc

    .line 44
    .line 45
    add-long/2addr v3, v5

    .line 46
    sget-object p1, Ldd1;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 47
    .line 48
    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 49
    .line 50
    .line 51
    const-string p1, "\u64cd\u4f5c\u83dc\u5355\u5df2\u5173\u95ed\uff0c\u77ed\u6682\u5ffd\u7565\u540c\u8f6e Activity \u6062\u590d"

    .line 52
    .line 53
    invoke-static {v0, p1, v2, p0, v2}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static ε(Landroid/app/Activity;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Ldd1;->δ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Ldd1;->γ()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const-wide/16 p0, 0x1f4

    .line 29
    .line 30
    invoke-static {p0, p1}, Ldd1;->η(J)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-static {}, Ldd1;->α()V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lcom/example/dyhelper/ui/φ;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/example/dyhelper/ui/φ;-><init>(Landroid/app/Activity;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static ζ(Landroid/app/Activity;)Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    sget-object v0, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v0

    .line 21
    :cond_1
    :goto_0
    if-eqz p0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 p0, 0x0

    .line 33
    :goto_1
    if-nez p0, :cond_3

    .line 34
    .line 35
    const-class p0, Ldd1;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-nez p0, :cond_3

    .line 42
    .line 43
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    :cond_3
    return-object p0
.end method

.method public static η(J)V
    .locals 9

    .line 1
    invoke-static {}, Ldd1;->γ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Ldd1;->γ:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    cmp-long v5, p0, v3

    .line 18
    .line 19
    if-gez v5, :cond_1

    .line 20
    .line 21
    move-wide v6, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-wide v6, p0

    .line 24
    :goto_0
    add-long/2addr v1, v6

    .line 25
    sget-object v6, Ldd1;->η:Ljava/util/concurrent/ScheduledFuture;

    .line 26
    .line 27
    if-eqz v6, :cond_2

    .line 28
    .line 29
    invoke-interface {v6}, Ljava/util/concurrent/Future;->isDone()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-nez v6, :cond_2

    .line 34
    .line 35
    sget-wide v6, Ldd1;->θ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    cmp-long v8, v6, v3

    .line 38
    .line 39
    if-lez v8, :cond_2

    .line 40
    .line 41
    cmp-long v6, v6, v1

    .line 42
    .line 43
    if-gtz v6, :cond_2

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :try_start_1
    sget-object v6, Ldd1;->η:Ljava/util/concurrent/ScheduledFuture;

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    invoke-interface {v6, v7}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    sput-wide v1, Ldd1;->θ:J

    .line 58
    .line 59
    sget-object v1, Ldd1;->β:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 60
    .line 61
    new-instance v2, Lfb0;

    .line 62
    .line 63
    const/16 v6, 0xd

    .line 64
    .line 65
    invoke-direct {v2, v6}, Lfb0;-><init>(I)V

    .line 66
    .line 67
    .line 68
    if-gez v5, :cond_4

    .line 69
    .line 70
    move-wide p0, v3

    .line 71
    :cond_4
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 72
    .line 73
    invoke-virtual {v1, v2, p0, p1, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    sput-object p0, Ldd1;->η:Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    monitor-exit v0

    .line 80
    return-void

    .line 81
    :goto_1
    monitor-exit v0

    .line 82
    throw p0
.end method

.method public static θ()V
    .locals 10

    .line 1
    invoke-static {}, Ldd1;->γ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    sget-object v2, Lxn0;->ρ:Lxn0;

    .line 13
    .line 14
    invoke-virtual {v2}, Lxn0;->Σ()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v2, Ljava/lang/Iterable;

    .line 26
    .line 27
    new-instance v3, Lf7;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-direct {v3, v4, v2}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lf71;

    .line 34
    .line 35
    const/16 v4, 0x14

    .line 36
    .line 37
    invoke-direct {v2, v4}, Lf71;-><init>(I)V

    .line 38
    .line 39
    .line 40
    new-instance v4, Lc40;

    .line 41
    .line 42
    sget-object v5, Lvs1;->ε:Lvs1;

    .line 43
    .line 44
    invoke-direct {v4, v3, v2, v5}, Lc40;-><init>(Lss1;La80;La80;)V

    .line 45
    .line 46
    .line 47
    new-instance v2, Lnq1;

    .line 48
    .line 49
    const/16 v3, 0x1a

    .line 50
    .line 51
    invoke-direct {v2, v3}, Lnq1;-><init>(I)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Ly30;

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-direct {v3, v4, v5, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 58
    .line 59
    .line 60
    new-instance v2, Lmc;

    .line 61
    .line 62
    const/4 v4, 0x7

    .line 63
    invoke-direct {v2, v4, v0, v1}, Lmc;-><init>(IJ)V

    .line 64
    .line 65
    .line 66
    new-instance v4, Ly30;

    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    invoke-direct {v4, v3, v6, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Lx30;

    .line 73
    .line 74
    invoke-direct {v2, v4}, Lx30;-><init>(Ly30;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lx30;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_1

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v2}, Lx30;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Ljava/lang/Comparable;

    .line 90
    .line 91
    :cond_2
    :goto_0
    invoke-virtual {v2}, Lx30;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    invoke-virtual {v2}, Lx30;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Ljava/lang/Comparable;

    .line 102
    .line 103
    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-lez v7, :cond_2

    .line 108
    .line 109
    move-object v3, v4

    .line 110
    goto :goto_0

    .line 111
    :cond_3
    move-object v2, v3

    .line 112
    :goto_1
    check-cast v2, Ljava/lang/Long;

    .line 113
    .line 114
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 119
    .line 120
    .line 121
    const/4 v4, 0x6

    .line 122
    invoke-virtual {v3, v4, v6}, Ljava/util/Calendar;->add(II)V

    .line 123
    .line 124
    .line 125
    const/16 v4, 0xb

    .line 126
    .line 127
    invoke-virtual {v3, v4, v5}, Ljava/util/Calendar;->set(II)V

    .line 128
    .line 129
    .line 130
    const/16 v4, 0xc

    .line 131
    .line 132
    invoke-virtual {v3, v4, v5}, Ljava/util/Calendar;->set(II)V

    .line 133
    .line 134
    .line 135
    const/16 v4, 0xd

    .line 136
    .line 137
    const/4 v6, 0x5

    .line 138
    invoke-virtual {v3, v4, v6}, Ljava/util/Calendar;->set(II)V

    .line 139
    .line 140
    .line 141
    const/16 v4, 0xe

    .line 142
    .line 143
    invoke-virtual {v3, v4, v5}, Ljava/util/Calendar;->set(II)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    if-eqz v2, :cond_4

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 153
    .line 154
    .line 155
    move-result-wide v5

    .line 156
    goto :goto_2

    .line 157
    :cond_4
    const-wide v5, 0x7fffffffffffffffL

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    :goto_2
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    sub-long v4, v2, v0

    .line 167
    .line 168
    const-wide/16 v6, 0x3a98

    .line 169
    .line 170
    const-wide/32 v8, 0x1499700

    .line 171
    .line 172
    .line 173
    invoke-static/range {v4 .. v9}, Lj81;->ξ(JJJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v0

    .line 177
    invoke-static {v0, v1}, Ldd1;->η(J)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public static ι(Landroid/app/Activity;Ldc1;Ldc1;)V
    .locals 14

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    invoke-static {}, Lui1;->Α()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_8

    .line 8
    .line 9
    const-string v2, "pet_elf_camp_show_top_notification"

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-static {v2, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_8

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v2, p1, Ldc1;->η:I

    .line 22
    .line 23
    iget v3, v1, Ldc1;->η:I

    .line 24
    .line 25
    add-int/2addr v2, v3

    .line 26
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget v4, p1, Ldc1;->α:I

    .line 31
    .line 32
    if-lez v4, :cond_1

    .line 33
    .line 34
    sget-object v4, Lbe1;->ε:Lbe1;

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    iget v4, v1, Ldc1;->γ:I

    .line 40
    .line 41
    if-lez v4, :cond_2

    .line 42
    .line 43
    sget-object v4, Lbe1;->ζ:Lbe1;

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    iget v4, v1, Ldc1;->δ:I

    .line 49
    .line 50
    if-lez v4, :cond_3

    .line 51
    .line 52
    sget-object v4, Lbe1;->η:Lbe1;

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_3
    iget v4, v1, Ldc1;->ε:I

    .line 58
    .line 59
    if-lez v4, :cond_4

    .line 60
    .line 61
    sget-object v4, Lbe1;->θ:Lbe1;

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_4
    sget-object v4, Lbe1;->ι:Lbe1;

    .line 67
    .line 68
    if-lez v2, :cond_5

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-static {v3}, Lyh;->μ(Lzt0;)Lzt0;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v3}, Lxn0;->ι(Ljava/util/List;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_6

    .line 86
    .line 87
    :goto_0
    return-void

    .line 88
    :cond_6
    move-object v7, v3

    .line 89
    check-cast v7, Ljava/lang/Iterable;

    .line 90
    .line 91
    new-instance v12, Lcd1;

    .line 92
    .line 93
    invoke-direct {v12, p1, v1, v2}, Lcd1;-><init>(Ldc1;Ldc1;I)V

    .line 94
    .line 95
    .line 96
    const/16 v13, 0x1e

    .line 97
    .line 98
    const-string v8, "\uff0c"

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v11, 0x0

    .line 103
    invoke-static/range {v7 .. v13}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    const-string v2, "camp:auto"

    .line 112
    .line 113
    if-eqz v1, :cond_7

    .line 114
    .line 115
    const-string v1, "\u8425\u5730\u540e\u53f0\u4efb\u52a1\u4eca\u65e5\u9996\u6b21\u7ed3\u679c"

    .line 116
    .line 117
    invoke-static {p0, v2, v1, v0}, Lcom/example/dyhelper/ui/а;->γ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_7
    invoke-static {v2}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    move-object v3, v0

    .line 126
    new-instance v0, Ld52;

    .line 127
    .line 128
    const-string v2, "\u8425\u5730\u540e\u53f0\u4efb\u52a1\u4eca\u65e5\u9996\u6b21\u5b8c\u6210"

    .line 129
    .line 130
    const/16 v4, 0x64

    .line 131
    .line 132
    sget-object v5, Lf52;->ζ:Lf52;

    .line 133
    .line 134
    const-wide/16 v7, 0x640

    .line 135
    .line 136
    move-object v6, p0

    .line 137
    invoke-direct/range {v0 .. v8}, Ld52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;Landroid/app/Activity;J)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    return-void
.end method
