.class public final Lyyds/ᲈᲁᛱᛳ;
.super Lyyds/ᛲᲀᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲈᛲᛱ;


# instance fields
.field public final ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyyds/ᛴᲇᛴᛲ;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    instance-of p0, p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    check-cast p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    invoke-virtual {p1, p0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᲈᲁᛱᛳ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᲈᲁᛱᛳ;

    .line 6
    .line 7
    iget-object p1, p1, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    if-ne p1, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛳᛸᛴᛶ(JLyyds/ᛸᲀᛱᛴ;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    :goto_0
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v3, Lyyds/ᲈᛵᛶᛲ;

    .line 16
    .line 17
    const/16 v4, 0x8

    .line 18
    .line 19
    invoke-direct {v3, v4, p0, p3, v1}, Lyyds/ᲈᛵᛶᛲ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p3, Lyyds/ᛸᲀᛱᛴ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛲ;

    .line 23
    .line 24
    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    invoke-interface {v0, v3, p1, p2, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 27
    .line 28
    .line 29
    move-result-object v2
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    move-exception v0

    .line 32
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 33
    .line 34
    const-string v4, "The task was rejected"

    .line 35
    .line 36
    invoke-direct {v3, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    sget-object v0, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 43
    .line 44
    invoke-interface {p0, v0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lyyds/ᲈᲇᲈᲇ;

    .line 49
    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    invoke-interface {p0, v3}, Lyyds/ᲈᲇᲈᲇ;->ᛵᲀᲈᛴ(Ljava/util/concurrent/CancellationException;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 56
    .line 57
    new-instance p0, Lyyds/ᛲᛶᲇᲇ;

    .line 58
    .line 59
    invoke-direct {p0, v1, v2}, Lyyds/ᛲᛶᲇᲇ;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, p0}, Lyyds/ᛸᲀᛱᛴ;->ᲈᲀᛲᲀ(Lyyds/ᛳᛴᲀᲈ;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    sget-object p0, Lyyds/ᛶᲁᛶᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲁᛶᲈ;

    .line 67
    .line 68
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᛲᲁᲀᛱ;->ᛳᛸᛴᛶ(JLyyds/ᛸᲀᛱᛴ;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-interface {p0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 9
    .line 10
    const-string v1, "The task was rejected"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lyyds/ᲈᲇᲈᲇ;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-interface {p0, v0}, Lyyds/ᲈᲇᲈᲇ;->ᛵᲀᲈᛴ(Ljava/util/concurrent/CancellationException;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object p0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 32
    .line 33
    sget-object p0, Lyyds/ᲇᛷᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lyyds/ᲇᛷᛶᛲ;->ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final ᛸᛸᛷᛱ(JLyyds/ᲀᛴᛸᛴ;Lyyds/ᲁᛴᛲ;)Lyyds/ᛴᲇᛲᛱ;
    .locals 3

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲁᛱᛳ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    invoke-interface {p0, p3, p1, p2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    goto :goto_1

    .line 21
    :catch_0
    move-exception p0

    .line 22
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 23
    .line 24
    const-string v2, "The task was rejected"

    .line 25
    .line 26
    invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 33
    .line 34
    invoke-interface {p4, p0}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lyyds/ᲈᲇᲈᲇ;

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    invoke-interface {p0, v0}, Lyyds/ᲈᲇᲈᲇ;->ᛵᲀᲈᛴ(Ljava/util/concurrent/CancellationException;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    .line 46
    .line 47
    new-instance p0, Lyyds/ᛴᛱᛵᛸ;

    .line 48
    .line 49
    invoke-direct {p0, v1}, Lyyds/ᛴᛱᛵᛸ;-><init>(Ljava/util/concurrent/ScheduledFuture;)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    sget-object p0, Lyyds/ᛶᲁᛶᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲁᛶᲈ;

    .line 54
    .line 55
    invoke-virtual {p0, p1, p2, p3, p4}, Lyyds/ᛶᲁᛶᲈ;->ᛸᛸᛷᛱ(JLyyds/ᲀᛴᛸᛴ;Lyyds/ᲁᛴᛲ;)Lyyds/ᛴᲇᛲᛱ;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method
