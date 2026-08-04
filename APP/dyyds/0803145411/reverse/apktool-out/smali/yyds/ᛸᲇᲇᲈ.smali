.class public final Lyyds/ᛸᲇᲇᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛱᲇᛷᲈ;


# instance fields
.field public ᛱᲈᲁ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public ᛲᛳᛶᲁ:Lyyds/ᛲᲇᲁᛳ;

.field public final ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public ᛶᛷᛲᲁ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final ᲀᛲᛳᲀ:Landroid/content/Context;

.field public ᲇᲇᲇᛱ:Landroid/os/Handler;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛶᛸᲈᛳ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lyyds/ᛶᛸᲈᛳ;)V
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
    iput-object v0, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v0, "Context cannot be null"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lyyds/ᲁᛴᛵᛱ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lyyds/ᛸᲇᲇᲈ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 21
    .line 22
    iput-object p2, p0, Lyyds/ᛸᲇᲇᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛸᲈᛳ;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛲᲇᲁᛳ;)V
    .locals 9

    .line 1
    iget-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iput-object p1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛲᲇᲁᛳ;

    .line 5
    .line 6
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    iget-object p1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    :try_start_1
    iget-object v0, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛲᲇᲁᛳ;

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
    iget-object v0, p0, Lyyds/ᛸᲇᲇᲈ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, "emojiCompat"

    .line 24
    .line 25
    new-instance v8, Lyyds/ᛴᛲᛱᲇ;

    .line 26
    .line 27
    invoke-direct {v8, v0}, Lyyds/ᛴᛲᛱᲇ;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 31
    .line 32
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    new-instance v7, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 35
    .line 36
    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x1

    .line 41
    const-wide/16 v4, 0xf

    .line 42
    .line 43
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛱᲈᲁ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 51
    .line 52
    iput-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 53
    .line 54
    move-object v0, v1

    .line 55
    :cond_1
    new-instance v1, Lyyds/ᛲᛳᛵᛱ;

    .line 56
    .line 57
    const/16 v2, 0x8

    .line 58
    .line 59
    invoke-direct {v1, v2, p0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 63
    .line 64
    .line 65
    monitor-exit p1

    .line 66
    return-void

    .line 67
    :goto_0
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw p0

    .line 69
    :catchall_1
    move-exception v0

    .line 70
    move-object p0, v0

    .line 71
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 72
    throw p0
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛲᛳᛶᲁ:Lyyds/ᛲᲇᲁᛳ;

    .line 6
    .line 7
    iget-object v2, p0, Lyyds/ᛸᲇᲇᲈ;->ᲇᲇᲇᛱ:Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    iput-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᲇᲇᲇᛱ:Landroid/os/Handler;

    .line 18
    .line 19
    iget-object v2, p0, Lyyds/ᛸᲇᲇᲈ;->ᛱᲈᲁ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 24
    .line 25
    .line 26
    :cond_1
    iput-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛶᛷᛲᲁ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 27
    .line 28
    iput-object v1, p0, Lyyds/ᛸᲇᲇᲈ;->ᛱᲈᲁ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᛶᛷᲈ;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lyyds/ᛸᲇᲇᲈ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛸᲇᲇᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛸᲈᛳ;

    .line 4
    .line 5
    invoke-static {p0}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {v0, p0}, Lyyds/ᛷᛴᛷᲁ;->ᛲᲈᲁ(Landroid/content/Context;Ljava/util/List;)Lyyds/ᛸᛴᛷᛵ;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    iget v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ljava/util/List;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, [Lyyds/ᲈᛶᛷᲈ;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    array-length v1, p0

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    aget-object p0, p0, v0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 37
    .line 38
    const-string v0, "fetchFonts failed (empty result)"

    .line 39
    .line 40
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v2, "fetchFonts failed ("

    .line 49
    .line 50
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, ")"

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    const-string v0, "provider not found"

    .line 71
    .line 72
    invoke-static {v0, p0}, Lyyds/ᛷᲈᲈᛶ;->ᛷᲈᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method
