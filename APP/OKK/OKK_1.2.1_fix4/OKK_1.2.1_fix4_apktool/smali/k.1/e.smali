.class public final Lk/e;
.super Lf0/P;
.source "SourceFile"


# virtual methods
.method public final O(Lk/f;Lk/f;)V
    .locals 0

    iput-object p2, p1, Lk/f;->b:Lk/f;

    return-void
.end method

.method public final P(Lk/f;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lk/f;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final c(Lk/g;Lk/c;)Z
    .locals 2

    sget-object v0, Lk/c;->b:Lk/c;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lk/g;->b:Lk/c;

    if-ne v1, p2, :cond_0

    iput-object v0, p1, Lk/g;->b:Lk/c;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final d(Lk/g;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lk/g;->a:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lk/g;->a:Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final e(Lk/g;Lk/f;Lk/f;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lk/g;->c:Lk/f;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lk/g;->c:Lk/f;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
