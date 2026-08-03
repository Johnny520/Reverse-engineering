.class public final Lha/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lab/b;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Lb9/b;

.field public d:Ljava/util/concurrent/ScheduledExecutorService;

.field public e:J


# direct methods
.method public constructor <init>(Lr8/g;Lab/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lha/m;->a:Lab/b;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string p2, "Hchat_moments_auto_refresh_config"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lha/m;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    new-instance p1, Lb9/b;

    .line 20
    .line 21
    const/4 p2, 0x5

    .line 22
    invoke-direct {p1, p0, p2}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lha/m;->c:Lb9/b;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lha/m;->b:Landroid/content/SharedPreferences;

    .line 3
    .line 4
    const-string v1, "enable"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    iget-object v0, p0, Lha/m;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lha/m;->d:Ljava/util/concurrent/ScheduledExecutorService;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 31
    :try_start_4
    throw v0

    .line 32
    :cond_1
    iget-object v0, p0, Lha/m;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 37
    .line 38
    .line 39
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 40
    xor-int/lit8 v2, v0, 0x1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :catchall_1
    move-exception v0

    .line 44
    goto :goto_3

    .line 45
    :cond_2
    :goto_2
    if-eqz v2, :cond_3

    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :cond_3
    const-wide/16 v0, 0x0

    .line 50
    .line 51
    :try_start_5
    iput-wide v0, p0, Lha/m;->e:J

    .line 52
    .line 53
    new-instance v0, Lc9/q;

    .line 54
    .line 55
    const/16 v1, 0xd

    .line 56
    .line 57
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v3, La1/a;

    .line 65
    .line 66
    const/16 v0, 0xa

    .line 67
    .line 68
    invoke-direct {v3, p0, v0}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 72
    .line 73
    const-wide/16 v4, 0x1

    .line 74
    .line 75
    const-wide/16 v6, 0x1

    .line 76
    .line 77
    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 78
    .line 79
    .line 80
    iput-object v2, p0, Lha/m;->d:Ljava/util/concurrent/ScheduledExecutorService;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 81
    .line 82
    monitor-exit p0

    .line 83
    return-void

    .line 84
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 85
    throw v0
.end method
