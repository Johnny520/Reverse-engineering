.class public final Lm/e;
.super Lb1/h;
.source "SourceFile"


# virtual methods
.method public final K(Lm/f;Lm/f;)V
    .locals 0

    .line 1
    iput-object p2, p1, Lm/f;->b:Lm/f;

    .line 2
    .line 3
    return-void
.end method

.method public final L(Lm/f;Ljava/lang/Thread;)V
    .locals 0

    .line 1
    iput-object p2, p1, Lm/f;->a:Ljava/lang/Thread;

    .line 2
    .line 3
    return-void
.end method

.method public final d(Lm/g;Lm/c;)Z
    .locals 2

    .line 1
    sget-object v0, Lm/c;->b:Lm/c;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object v1, p1, Lm/g;->b:Lm/c;

    .line 5
    .line 6
    if-ne v1, p2, :cond_0

    .line 7
    .line 8
    iput-object v0, p1, Lm/g;->b:Lm/c;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    monitor-exit p1

    .line 12
    return p2

    .line 13
    :catchall_0
    move-exception p2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    monitor-exit p1

    .line 17
    return p2

    .line 18
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p2
.end method

.method public final e(Lm/g;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lm/g;->a:Ljava/lang/Object;

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Lm/g;->a:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    monitor-exit p1

    .line 10
    return p2

    .line 11
    :catchall_0
    move-exception p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p2, 0x0

    .line 14
    monitor-exit p1

    .line 15
    return p2

    .line 16
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p2
.end method

.method public final f(Lm/g;Lm/f;Lm/f;)Z
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lm/g;->c:Lm/f;

    .line 3
    .line 4
    if-ne v0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Lm/g;->c:Lm/f;

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    monitor-exit p1

    .line 10
    return p2

    .line 11
    :catchall_0
    move-exception p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p2, 0x0

    .line 14
    monitor-exit p1

    .line 15
    return p2

    .line 16
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p2
.end method
