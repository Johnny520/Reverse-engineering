.class public final Lo50;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Liy;


# instance fields
.field public final α:Landroid/content/Context;

.field public final β:Ln50;

.field public final γ:Li2;

.field public final δ:Ljava/lang/Object;

.field public ε:Landroid/os/Handler;

.field public ζ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public η:Ljava/util/concurrent/ThreadPoolExecutor;

.field public θ:Lpd2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ln50;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lo50;->δ:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v0, "Context cannot be null"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lp91;->δ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lo50;->α:Landroid/content/Context;

    .line 21
    .line 22
    iput-object p2, p0, Lo50;->β:Ln50;

    .line 23
    .line 24
    sget-object p1, Lp50;->δ:Li2;

    .line 25
    .line 26
    iput-object p1, p0, Lo50;->γ:Li2;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final α(Lpd2;)V
    .locals 9

    .line 1
    iget-object v1, p0, Lo50;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iput-object p1, p0, Lo50;->θ:Lpd2;

    .line 5
    .line 6
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    iget-object p1, p0, Lo50;->δ:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    :try_start_1
    iget-object v0, p0, Lo50;->θ:Lpd2;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    monitor-exit p1

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    move-object p0, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lo50;->ζ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, "emojiCompat"

    .line 24
    .line 25
    new-instance v8, Lho;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v8, v1, v0}, Lho;-><init>(ILjava/io/Serializable;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 32
    .line 33
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    new-instance v7, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 36
    .line 37
    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x1

    .line 42
    const-wide/16 v4, 0xf

    .line 43
    .line 44
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lo50;->η:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 52
    .line 53
    iput-object v1, p0, Lo50;->ζ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Lo50;->ζ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 56
    .line 57
    new-instance v1, Lν;

    .line 58
    .line 59
    const/16 v2, 0xf

    .line 60
    .line 61
    invoke-direct {v1, v2, p0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    monitor-exit p1

    .line 68
    return-void

    .line 69
    :goto_0
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p0

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    throw p0
.end method

.method public final β()V
    .locals 4

    .line 1
    iget-object v0, p0, Lo50;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Lo50;->θ:Lpd2;

    .line 6
    .line 7
    iget-object v2, p0, Lo50;->ε:Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iput-object v1, p0, Lo50;->ε:Landroid/os/Handler;

    .line 19
    .line 20
    iget-object v2, p0, Lo50;->η:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object v1, p0, Lo50;->ζ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 28
    .line 29
    iput-object v1, p0, Lo50;->η:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0
.end method

.method public final γ()Lf60;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lo50;->γ:Li2;

    .line 2
    .line 3
    iget-object v1, p0, Lo50;->α:Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, Lo50;->β:Ln50;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {v1, p0}, Lm50;->α(Landroid/content/Context;Ljava/util/List;)Lv;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    iget v0, p0, Lv;->α:I

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lv;->β:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Ljava/util/List;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, [Lf60;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    array-length v1, p0

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    aget-object p0, p0, v0

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string v0, "fetchFonts failed (empty result)"

    .line 44
    .line 45
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 50
    .line 51
    const-string v1, "fetchFonts failed ("

    .line 52
    .line 53
    const-string v2, ")"

    .line 54
    .line 55
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :catch_0
    move-exception p0

    .line 64
    new-instance v0, Ljava/lang/RuntimeException;

    .line 65
    .line 66
    const-string v1, "provider not found"

    .line 67
    .line 68
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw v0
.end method
