.class public final LJ;
.super LOj;
.source ""


# virtual methods
.method public final O(LK;LK;)V
    .locals 0

    iput-object p2, p1, LK;->b:LK;

    return-void
.end method

.method public final P(LK;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, LK;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final f(LL;LH;)Z
    .locals 2

    sget-object v0, LH;->b:LH;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, LL;->b:LH;

    if-ne v1, p2, :cond_0

    iput-object v0, p1, LL;->b:LH;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final g(LL;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, LL;->a:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, LL;->a:Ljava/lang/Object;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final h(LL;LK;LK;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, LL;->c:LK;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, LL;->c:LK;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
