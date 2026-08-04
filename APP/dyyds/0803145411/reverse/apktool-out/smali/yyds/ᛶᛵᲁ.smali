.class public final Lyyds/ᛶᛵᲁ;
.super Lyyds/ᛲᛴᲈᲈ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# virtual methods
.method public final ᲀᛲᛳᲀ(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 2
    .line 3
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->getArguments()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "request_code"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_0
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    sget-object v0, Lyyds/ᛸᲁᛵᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 21
    .line 22
    const-class v0, Lyyds/ᛸᲁᛵᛸ;

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    sget-object v1, Lyyds/ᛸᲁᛵᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    invoke-virtual {p0}, Lyyds/ᛲᛴᲈᲈ;->ᛲᲈᲁ()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Landroid/app/Activity;Ljava/util/ArrayList;I)V
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-array p1, v0, [Ljava/lang/String;

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    new-array p1, p1, [Ljava/lang/String;

    .line 16
    .line 17
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge v0, v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lyyds/ᛲᛴᛷᲁ;

    .line 28
    .line 29
    invoke-virtual {v1}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    aput-object v1, p1, v0

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    iget-object p0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 39
    .line 40
    :try_start_0
    invoke-interface {p0, p1, p3}, Lyyds/ᛱᛸᲇᛵ;->requestPermissions([Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Lyyds/ᛱᛸᲇᛵ;->getActivity()Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    instance-of v0, p0, Landroidx/fragment/app/FragmentActivity;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static {p0}, Lyyds/ᛴᛶᲀᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    :try_start_1
    invoke-virtual {p0, p1, p3}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catch_1
    move-exception p0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 70
    .line 71
    .line 72
    :goto_2
    invoke-static {p2}, Lyyds/ᛲᛶᛵᛴ;->ᛲᲈᲁ(Ljava/util/ArrayList;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
