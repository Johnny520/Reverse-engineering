.class public final Lyyds/ᲇᲇᲈᲀ;
.super Lyyds/ᛲᛷᛵᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# virtual methods
.method public final ᛲᛲᲈᲈ(Lyyds/ᛵᛲᛵᲁ;Ljava/lang/Thread;)V
    .locals 0

    .line 1
    iput-object p2, p1, Lyyds/ᛵᛲᛵᲁ;->ᛲᲈᲁ:Ljava/lang/Thread;

    .line 2
    .line 3
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᲈᛳᛵᛴ;Lyyds/ᛵᛲᛵᲁ;Lyyds/ᛵᛲᛵᲁ;)Z
    .locals 0

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object p0, p1, Lyyds/ᲈᛳᛵᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛲᛵᲁ;

    .line 3
    .line 4
    if-ne p0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Lyyds/ᲈᛳᛵᛴ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛲᛵᲁ;

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    monitor-exit p1

    .line 10
    return p0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    monitor-exit p1

    .line 15
    return p0

    .line 16
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p0
.end method

.method public final ᛷᛵᲇᲀ(Lyyds/ᛵᛲᛵᲁ;Lyyds/ᛵᛲᛵᲁ;)V
    .locals 0

    .line 1
    iput-object p2, p1, Lyyds/ᛵᛲᛵᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛲᛵᲁ;

    .line 2
    .line 3
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᲈᛳᛵᛴ;Lyyds/ᛶᛵᛸᛲ;)Z
    .locals 1

    .line 1
    sget-object p0, Lyyds/ᛶᛵᛸᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛶᛵᛸᛲ;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object v0, p1, Lyyds/ᲈᛳᛵᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛵᛸᛲ;

    .line 5
    .line 6
    if-ne v0, p2, :cond_0

    .line 7
    .line 8
    iput-object p0, p1, Lyyds/ᲈᛳᛵᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛵᛸᛲ;

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    monitor-exit p1

    .line 12
    return p0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    monitor-exit p1

    .line 17
    return p0

    .line 18
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᲈᛳᛵᛴ;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object p0, p1, Lyyds/ᲈᛳᛵᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 3
    .line 4
    if-ne p0, p2, :cond_0

    .line 5
    .line 6
    iput-object p3, p1, Lyyds/ᲈᛳᛵᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    monitor-exit p1

    .line 10
    return p0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    monitor-exit p1

    .line 15
    return p0

    .line 16
    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p0
.end method
